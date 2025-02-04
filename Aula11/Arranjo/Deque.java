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
            /* Isso é um vetor circular? */
            inicio++;    
            deque[inicio] = p;
            System.out.println();
            tamanho++;        
        }
    }

    public NoDeque<Pessoa> [] imprimir(){
        return deque;
    }

    public void addF(String nome, int idade){
        Pessoa p1 = new Pessoa(nome, idade);
        NoDeque<Pessoa> p = new NoDeque<>(p1);

        if(tamanho == 0){

        }
    }

}
