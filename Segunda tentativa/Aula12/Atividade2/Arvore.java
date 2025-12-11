public class Arvore {
    No raiz = null;
    int cot = 0;
    int vet [] = new int[4];

    public void add(No no, int altura){
        if(no == null){
            raiz = new No(altura);
        }

        else{
            if(altura > no.altura){
                if(no.direita == null){
                    no.direita = new No(altura);
                }

                else{
                    add(no.direita, altura);
                }
            }

            else{
                if(no.esquerda == null){
                    no.esquerda = new No(altura);
                }

                else{
                    add(no.esquerda, altura);
                }
            }
        }
    }

    public void inOrdem(No no){
        if(no != null){
            inOrdem(no.esquerda);
            System.out.println(no.altura);
            inOrdem(no.direita);
        }
    }

    public void menorPorNível(No no){
        if(no == raiz){
            vet[0] = raiz.altura;
        }

        else{
            
        }

    }
}
