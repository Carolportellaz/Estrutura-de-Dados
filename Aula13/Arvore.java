import java.util.Random;

public class Arvore {
    Node raiz = null;
    int escolha;

    public void inserir(Node no, Pessoa p){
        if(no == null){
            raiz = new Node(p);
        }

        else{
            int valor = p.getMat();
            if(valor > no.p.getMat()){
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

    public Node remover(int mat) throws Exception{
        return remover(this.raiz, mat);
    }

    public Node remover(Node no, int mat) throws Exception{
        Node no_removido = no;
        if(no == null){
            throw new Exception("Componente não encontrado");
        }

        if(raiz == null){
            throw new Exception("Lista vazia");
        }

        else{
            if(mat > no.p.getMat()){
                return remover(no.direita, mat);
            }

            if(mat < no.p.getMat()){
                return remover(no.esquerda, mat);
            }

            // Aqui eu encontrei o no //
            else{
                // Se tiver dois filhos
                Random radom = new Random();
                escolha = radom.nextInt(2);

                if(no.esquerda != null && no.direita != null){

                    // Pega o menor do lado direito//
                    if(escolha == 0){
                        no.p = minimo(no.direita).p;
                        
                        // Remove o menor //
                        no.direita = removerMin(no);
                        
                    }

                    // Pega o maior do lado esquerdo//
                    else{
                        no.p = maximo(no.esquerda).p;

                        // Remove o maior //
                        no.esquerda = removerMax(no);
                    }
                }

                else{
                    // Se tiver filho na esquerda
                    if(no.esquerda != null){
                        no = no.esquerda;
                    }

                    // Se tiver filho na direita
                    else{
                        no = no.direita;
                    }
                }
            }
        }

        return no_removido;
    }

    public Node minimo(Node no) {
        if(no.esquerda != null){
            return minimo(no.esquerda);
        }
        
        else{
            return no;
        }
    }

    public Node removerMin(Node no) throws Exception{
        if(no == null){
            throw new Exception("Árvore vazia");
        }

        else{
            if(no.esquerda != null){
                no.esquerda = (removerMin(no.esquerda));
                return no;
            }

            else{
                return no.direita;
            }
        }
    }

    public Node maximo(Node no) {
        if(no.direita != null){
            return minimo(no.direita);
        }

        else{
            return no;
        }
    }

    public Node removerMax(Node no) throws Exception{
        if(no == null){
            throw new Exception("Árvore vazia");
        }

        else{
            if(no.direita != null){
                no.direita = removerMax(no.direita);
                return no;                
            }

            else{
                return no;
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
