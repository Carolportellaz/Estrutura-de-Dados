public class Arvore {
    Node raiz = null;
    boolean propria = true;
    int folha = 0;
    Node vet_ordenado [];
    int tamanho;
    int cot = 0;
    

    public Node inserir(Node no, Temp t){
        if(no == null){
            tamanho++;
            raiz = new Node(t);
        }

        else{
            double valor = t.getGraus();

            if(valor > no.t.getGraus()){
                if(no.direita != null){
                    inserir(no.direita, t);
                }

                else{
                    tamanho++;
                    no.direita = new Node(t);
                }
            }

            else{

                if(no.esquerda != null){
                    inserir(no.esquerda, t);
                }

                else{
                    tamanho++;
                    no.esquerda = new Node(t);
                }
            }
        }


        return no;
    }

    public Node adicionar_vet(Node no, Node [] vet_adicionado){
        if(no != null){
            vet_adicionado[cot] = no;
            cot++;

            adicionar_vet(no.esquerda, vet_adicionado);
            adicionar_vet(no.direita, vet_adicionado);

        }        

        return no;

    }

    public Node [] insertion(Node [] vet){
        int fim = 1;
        boolean trocou = true;


        for(int j = 0; j < vet.length; j++){
            int menor = vet[0].t.getAno();

            for(int i = 0; i < fim; i++){
                if(vet[i] != null){
                    if(vet[i].t.getAno() < menor){
                        Node n1 = vet[i];
                        Node n2 = vet[i + 1];
    
                        vet[i] = n2;
                        vet[i + 1] = n1;
                        trocou = true;
                    }
                }
                
            }

            fim++;


        }
            
        return vet;
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

    public boolean propria(Node no){
        // Lembra de verficar antes se ela é ou não própria //
        if((no != null) && (propria != false)){
            if((no.esquerda == null && no.direita == null) || (no.esquerda != null && no.direita != null)){
                propria = true;
            }
    
            else{
                propria = false;
            }

            propria(no.esquerda);
            propria(no.direita);
        }

        return propria;

    }

    public int count(Node no){
        if(no != null){
            if(no.esquerda == null && no.direita == null){
                folha++;
            }

            count(no.esquerda);
            count(no.direita);
        }
        return folha;
    }
}
