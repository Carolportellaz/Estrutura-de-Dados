public class Fila {
    int id;
    int tamanho;
    int inicio;
    int fim;
    Processo [] vet_p = new Processo[1000];
    public Processo inserir(String titulo) throws Exception{
        id++;
        Processo novo_p = new Processo(id, titulo);
        if(tamanho < 10){
            if(inicio == 0){
                vet_p[inicio] = novo_p;
                tamanho++;
                inicio++;
            }

            else{
                vet_p[inicio] = novo_p;
                tamanho++;
                inicio++;
            }

            return novo_p;
        }

        else{
            throw new Exception("Lista cheia");
        }
    }

    public Processo retirar() throws Exception{
        if(tamanho == 0){
            throw new Exception("Lista Vazia");
        }
        Processo saida = vet_p[fim];
        vet_p[fim] = null;
        fim++;
        tamanho--;
        return saida;
    }

    public Processo [] imprimir(){
        return vet_p;
    }

    public Integer buscar(int id){
        // O início aponta para uma posição vazia //
        int quebra_galho = inicio - 1;
        Integer correto = null;
        while(quebra_galho >= fim){
            if(vet_p[quebra_galho].getId() == id){
                correto = quebra_galho;
                break;
            }

            else{
                quebra_galho--;
            }
            
        }

        return correto;
    }

    public void excluir_todos(){
        vet_p[0] = null;
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }
}
