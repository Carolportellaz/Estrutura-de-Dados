public class Arvore {
    Node raiz = null;
    int cot;
    int niveis;
    int cot2;
    boolean exibir = true;

    public Node add(Node no, int altura) {
        if (no == null) {
            raiz = new Node(altura);
            niveis++;
        }

        else {
            if (no.getAltura() < altura) {
                if (no.getDireita() == null) {
                    no.setDireita(new Node(altura));

                    if(no.getEsquerda() !=null){
                        niveis++;
                    }

                } else {
                    no.setDireita(add(no.getDireita(), altura));
                }
            }

            else {
                if (no.getEsquerda() == null) {
                    no.setEsquerda(new Node(altura));

                    if(no.getDireita() != null){
                        niveis++;
                    }
                }

                else {
                    no.setEsquerda(add(no.getEsquerda(), altura));
                }
            }

        }

        return no;

    }

    public Node saida(Node no, Node irmao) {
        if (no == null) {
            return null;
        }

        if(niveis >= cot){
            System.out.println(cot + " " + no.getAltura());
        }

        cot++;
        
        if (no.getEsquerda() != null) {

            if (no.getDireita() != null) {
                irmao = no.getDireita();
            }

            no.setEsquerda(saida(no.getEsquerda(), irmao));

        }

        else if (no.getDireita() != null) {

            if (no.getEsquerda() != null) {
                irmao = no.getEsquerda();

            }

            no.setDireita(saida(no.getDireita(), irmao));
        }

        // Verificando se o irmão dele tem algum valor
        else if (irmao != null) {
            no = irmao;

            if (no.getEsquerda() != null) {
                irmao = no.getDireita();

                no.setEsquerda(saida(no.getEsquerda(), irmao));

            }

            else if (no.getDireita() != null) {
                irmao = no.getEsquerda();

                no.setDireita(saida(no.getDireita(), irmao));

            }

        }
        
        // Se eu não percorir todos os niveis da árvores
        if(cot != niveis){
            exibir_direita(no.getDireita(), irmao);
        }

        return no;

    }

    public Node exibir_direita(Node no, Node irmao){       
        if(no == null){
            return null;
        }

        if(cot2 > cot){
            System.out.println(cot2 + " " + no.getAltura());
        }

        cot2++;



        if(no.getEsquerda() != null){
            if(no.getDireita() != null){
                irmao = no.getDireita();
            }

            no.setEsquerda(exibir_direita(no.getEsquerda(), irmao));
        }

        else if (no.getDireita() != null){
            if(no.getEsquerda() != null){
                irmao = no.getEsquerda();
            }

            no.setDireita(exibir_direita(no.getDireita(), irmao));
        }

        else if (irmao != null){
            no = irmao;

            if(no.getEsquerda() != null){
                irmao = no.getDireita();

                no.setEsquerda(exibir_direita(no.getEsquerda(), irmao));
            }

            else if (no.getDireita() != null){
                irmao = no.getEsquerda();

                no.setDireita(exibir_direita(no.getDireita(), irmao));
            }
        }

        else{
            if(cot2 < niveis){
                exibir_direita(no.getDireita(), irmao);
            }
        }

        return no;
    }

    public void imprimir(Node no){
        if ( no != null ) {
            imprimir(no.getEsquerda()) ;
            System.out.print(no.getAltura()+ " ") ;
            imprimir(no.getDireita()) ;
        
        }
    }

}
