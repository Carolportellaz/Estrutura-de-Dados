public class Fila {
    int senha = 1;
    int tamanho = 0;
    Integer [] vet_senhas = new     Integer[50];
    int inicio = 0;
    int fim = 0;
    int nova_senha;

    public void enfilera() throws Exception{
        if(senha > 10){
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
        if(vet_senhas[fim] == null){
            throw new Exception("Lista vazia");
        }

        else{
            int c_chamado = vet_senhas[fim];
            fim++;
            return c_chamado;
        }
    }

    public Integer [] imprimir(){
        return vet_senhas;
    }
}
