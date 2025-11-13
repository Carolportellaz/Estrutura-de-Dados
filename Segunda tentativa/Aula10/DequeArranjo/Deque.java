public class Deque {
    int [] deque = new int[10];
    int inicio = -1;
    int fim = -1;
    int tamanho = 0;

    public void addI(int n) throws Exception{
        if(tamanho == 10){
            throw new Exception("Deque cheio");
        }

        if(tamanho == 0){
            inicio++;
            fim++;
            deque[inicio] = n;
        }

        else{
            inicio--;

            if(inicio == -1){
                inicio = tamanho - 1;
                deque[inicio] = n;
            }

            if(inicio == tamanho){
                inicio = 0;
                deque[inicio] = n;
            }
        }

        tamanho++;
    }

    public void addF(int n) throws Exception{
        if(tamanho == 10){
            throw new Exception("Deque cheio");
        }

        else{
            if(tamanho == 0){
                addI(n);
            }

            else{
                fim++;

                if(fim == -1){
                    fim = tamanho - 1;
                    deque[fim] = n;
                }

                if(fim == tamanho){
                    fim = 0;
                    deque[fim] = n;
                }

                tamanho++;
            }
        }
    }

    public int removerI(){
        int removido = deque[inicio];

        return removido;
    }

    public void imprimir(){
        for(int i = inicio; i != fim; i++){
            if(i == tamanho){
                i = 0;
            }
        }
    }
}
