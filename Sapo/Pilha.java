public class Pilha {
    No cabeca = new No();
    No cauda = cabeca;
    int tamanho = 0;
    int iteracao_imp = 0;
    int iteracao = 0;


    public void addI(int qtd, int posicao) throws Exception{
        // Primeiro vou adicionar os elementos na pilha //
        while (qtd > iteracao) {
            push(iteracao + 1);
            iteracao++;
        }

    }

    public void push(int elemento) throws Exception{
        No novo_elemento = new No(elemento);

        if(tamanho == 0){
            cabeca.proximo = novo_elemento;
            cauda = novo_elemento;
            novo_elemento.anterior = cabeca;
        }
        
        else{
            novo_elemento.anterior = cauda;
            cauda = novo_elemento;
        }
        
        tamanho++;

    }

    public int imprimir(int iteracao_imp_user) throws Exception{
        No quebra_galho = cabeca.proximo;
        iteracao_imp = 0;

        while((iteracao_imp < iteracao_imp_user) && (quebra_galho != null)){
            quebra_galho = quebra_galho.proximo;
            iteracao_imp++;
        }

        return quebra_galho.elemento;
    }
}
