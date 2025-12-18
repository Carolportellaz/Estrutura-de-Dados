public class Arvore {
    Node raiz = null;

    public void add(int valor, Node no){
        if(raiz == null){
            raiz = new Node(valor);
        }

        else{
            // SE FOR MAIOR
            if(no.valor < valor){
                if(no.direita == null){
                    no.direita = new Node(valor);
                }

                else{
                    add(valor, no.direita);
                }
            }

            // SE FOR MENOR //
            else{
                if(no.esquerda == null){
                    no.esquerda = new Node(valor);
                }

                else{
                    add(valor, no.esquerda);
                }
            }
        }
    }

    public void imprimirIn(Node no){
        if(no != null){
            imprimirIn(no.esquerda);
            System.out.println(no.valor);
            imprimirIn(no.direita);
        }
    }
}
