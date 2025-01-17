public class Fila {
    int senha = 1;
    int tamanho = 0;
    int [] vet_senhas = new int[50];
    int inicio = 0;
    int fim = 0;
    int nova_senha;

    public void enfilera() throws Exception{
        if(senha > 50){
            throw new Exception("Fila cheia");
        }

        else{
            if(tamanho == 0){
                vet_senhas[tamanho] = senha;
                tamanho++;
                senha++;
            }

            else{
                vet_senhas[inicio + 1] = senha;
                inicio++;
                tamanho++;
                senha++;
            }
        }
    }

    public int chamado() throws Exception{
        if(tamanho == 0){
            throw new Exception("Lista vazia");
        }

        else{
            int cliente = vet_senhas[fim];
            fim++;
            
        }

    }

    public int [] imprimir(){
        return vet_senhas;
    }
}
