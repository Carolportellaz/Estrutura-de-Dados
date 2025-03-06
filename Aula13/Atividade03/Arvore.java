public class Arvore {
    Node raiz = null;
    

    public Node inserir(Node no, Temp t){
        if(no == null){
            raiz = new Node(t);
        }

        else{
            double valor = t.getGraus();

            if(valor > no.t.getGraus()){
                if(no.direita != null){
                    inserir(no.direita, t);
                }

                else{
                    no.direita = new Node(t);
                }
            }

            else{
                if(no.esquerda != null){
                    inserir(no.esquerda, t);
                }

                else{
                    no.esquerda = new Node(t);
                }
            }
        }

        return no;
    }

    public Node maior(Node no){
        if(no.direita != null){
            return maior(no.direita);
        }

        else{
            return no;
        }
    }

    public void preOrdem(Node no){
        if(no != null){
            System.out.println(no.t.getGraus() + " ");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }
}
