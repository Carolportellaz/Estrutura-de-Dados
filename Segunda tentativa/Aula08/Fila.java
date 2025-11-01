public class Fila {
    Pessoa fila [] = new Pessoa[10];
    int inicio = 0;
    int fim = 0;
    int tamanho = 0;

    public void enfileirar(Pessoa p) throws Exception{
        if(fila.length == tamanho){
            throw new Exception("Fila cheia");
        }

        else{
            fila[fim] = p;
            fim++;

            if(fim == fila.length){
                fim = 0;
            }

            tamanho++;
        }
    }

    public Pessoa desinfileirar(Pessoa p) throws Exception{
        if(tamanho == 0){
            throw new Exception("Fila vazia");
        }

        else{
            Pessoa removido = fila[inicio];
            inicio++;

            if(inicio == fila.length){
                inicio = 0;
            }

            tamanho--; 

            return removido;
        }
    }

    public void imprimir(){
        for(int i = inicio; i < tamanho; i++){
            System.out.println(fila[i].getNome() + " | " + fila[i].getIdade());
        }
    }
}
