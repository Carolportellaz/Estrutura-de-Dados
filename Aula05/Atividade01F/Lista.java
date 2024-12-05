public class Lista {
    No cabeca = new No();
    No busca;
    No cauda = cabeca;
    int tamanho = 0;
    No quebra_galho;
    int posicao = 0;

    public void add(Cliente c) {
        No novo_elemento = new No(c, null, null);
        if (tamanho == 0) {
            cabeca.proximo = novo_elemento;
            novo_elemento.anterior = cabeca;
            cauda = novo_elemento;
            tamanho++;
        }

        else {
            No quebra_galho = cauda;

            while ((quebra_galho != cabeca)
                    && (quebra_galho.elemento.getCodigo() > novo_elemento.elemento.getCodigo())) {
                quebra_galho = quebra_galho.anterior;
                posicao++;
            }

            // Adicionar no inicio //
            if (quebra_galho == cabeca) {
                adicionarI(novo_elemento);
            }

            // Adicionar no final //
            if(quebra_galho == cauda){
                adicionarF(novo_elemento);
            }

            // Adicionar no meio //
            else{
                adicionarM(novo_elemento, quebra_galho);
            }
        }

    }

    public void adicionarI(No novo_elemento) {
        // Lembrar de não usar métodos e variáveis externas como quebra-galho porque pode não funcionar //
        novo_elemento.proximo = cabeca.proximo;

        if(cabeca.proximo != null){
            cabeca.proximo.anterior = novo_elemento;
        }

        cabeca.proximo = novo_elemento;
        novo_elemento.anterior = cabeca;

        // Não esquece de atualizar a cauda e o tamanho//
        if(cauda == cabeca){
            cauda = novo_elemento;
        }

        tamanho++;
    }

    public void adicionarF(No novo_elemento){
        novo_elemento.anterior = cauda;
        cauda.proximo = novo_elemento;
        cauda = novo_elemento;

        tamanho++;
    }

    public void adicionarM(No novo_elemento, No elemento_atual){
        No quebra_galho = elemento_atual.proximo;

        elemento_atual.proximo = novo_elemento;
        novo_elemento.anterior = elemento_atual;
        novo_elemento.proximo = quebra_galho;
        
        if(quebra_galho != null){
            quebra_galho.anterior = novo_elemento;
        }

        tamanho++;
    }

    public void imprimir() {
        System.out.println("Os clientes em ordem crescete são: ");

        No quebra_galho = cabeca.proximo;

        for (int i = 0; i < tamanho; i++) {
            System.out.println(quebra_galho.elemento.getCodigo() + " | " + quebra_galho.elemento.getNome() + " | "
                    + quebra_galho.elemento.getTelefone());
            quebra_galho = quebra_galho.proximo;
        }
    }

    public void imprimirD() {
        System.out.println("Os clientes em ordem descrencete são: ");

        No quebra_galho = cauda;

        for (int i = 0; i < tamanho; i++) {
            System.out.println(quebra_galho.elemento.getCodigo() + " | " + quebra_galho.elemento.getNome() + " | "
                    + quebra_galho.elemento.getTelefone());
            quebra_galho = quebra_galho.anterior;
        }
    }

}
