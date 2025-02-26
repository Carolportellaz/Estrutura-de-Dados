public class Arvore {
    Node raiz = null;

    public void inserir(Node no, Pessoa p){

        if(no == null){
            raiz = new Node(p);
        }

        else{
            int valor = p.getMat();
            if(valor < no.p.getMat()){
                if(no.direita != null){
                    inserir(no.direita, p);
                }

                else{
                    no.direita = new Node(p);
                }
            }

            else{
                if(no.esquerda != null){
                    inserir(no.esquerda, p);
                }

                else{
                    no.esquerda = new Node(p);
                }
            }
        }
    }

    public void preOrdem(Node no){
        if(no != null){
            System.out.println(no.p.getMat() + " ");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

    public void inOrdem(Node no){
        if(no != null){
            inOrdem(no.esquerda);
            System.out.println(no.p.getMat());
            inOrdem(no.direita);
        }
    }

    public void posOrdem(Node no){
        if(no != null){
            inOrdem(no.esquerda);
            inOrdem(no.direita);
            System.out.println(no.p.getMat());
        }
    }
}
