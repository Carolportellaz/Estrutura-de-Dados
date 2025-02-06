@SuppressWarnings("unchecked")
public class Deque {
    NoDeque<Pessoa> [] deque = new NoDeque[10];
    int tamanho = 0;
    int inicio;
    int fim;

    public void addI(String nome, int idade){
        Pessoa p1 = new Pessoa(nome, idade);
        NoDeque<Pessoa> p = new NoDeque<Pessoa>(p1);

        if(tamanho == 0){
            p.setInfo(p1);
            deque[inicio] = p;
            tamanho++;

            /* Meu início e meu fim são zeros */
            fim = 0;
            inicio = 0;
        }

        else{
            /* Verifico se caiu do vetor */
            if(inicio + 1 == -1){
                inicio = 0;
                deque[inicio] = p;
                tamanho++;
            }

            /* Se não cair do vetor */
            else{
                inicio++;
                deque[inicio] = p;
                tamanho++;
            }     
        }
    }

    public NoDeque<Pessoa> [] imprimir(){
        return deque;
    }

    public void addF(String nome, int idade){
        Pessoa p1 = new Pessoa(nome, idade);
        NoDeque<Pessoa> p = new NoDeque<>(p1);

        if(tamanho == 0){
            deque[fim] = p;
            tamanho++;
            fim = 0;
            inicio = 0;
        }

        else{

            /* Verifico se caiu do vetor */
            if(fim + 1 >= deque.length){
                fim = 0;
                deque[fim] = p;
                tamanho++;
            }

            else{
                fim++;
                deque[fim] = p;
                tamanho++;
            }
            
        }
    }

    public NoDeque<Pessoa> removerI() throws Exception{
        if(tamanho == 0){
            throw new Exception("Lista vazia");
        }

        NoDeque<Pessoa> removido = deque[inicio];
        deque[inicio] = null;
        
        inicio--;
        tamanho--;

        return removido;
    }

    public NoDeque<Pessoa> removerF() throws Exception{
        if(tamanho == 0){
            throw new Exception("Lista vazia");
        }

        NoDeque<Pessoa> removido = deque[fim];
        deque[fim] = null;

        fim--;
        tamanho--;

        return removido;
    }

}
