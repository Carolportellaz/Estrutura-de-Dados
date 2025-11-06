public class Fila {
    String [] fila = new String[100];
    int inicio = -1;
    int fim = -1;
    int tamanho = 0;

    public String enfileirar(String valor){
        if(tamanho > fila.length){
            return null;
        }

        if(tamanho == 0){
            inicio++;
        }

        tamanho++;
        fim++;
        fila[fim] = valor;

        return fila[fim];
    }   

    public String desenfileirar(){
        if(tamanho == 0){
            return null;
        }
        String removido = fila[inicio];

        inicio++;
        tamanho--;

        return removido;
    }


    public void imprimir(){
        while(tamanho > 0){
            System.out.println(desenfileirar());
        }
    }
}
