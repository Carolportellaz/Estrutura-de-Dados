public class Lista {
    public No cabeca = new No();
    public No cauda = cabeca;
    public int tamanho = 0;
    private No elemento;
    private int posicao;
    private boolean contem = false;

    public void adicionar(Carro c) {
        elemento = new No(c, null, null);
        if (tamanho == 0) {
            cabeca.proximo = elemento;
            cauda = elemento;
        }

        else {
            elemento.proximo = cabeca.proximo;
            cabeca.proximo = elemento;
        }

        tamanho++;
    }

    public void imprimir() {
        No quebra_galho = cabeca.proximo;
        System.out.println("Os clientes são: ");

        for (int i = 0; i < tamanho; i++) {
            System.out.println(quebra_galho.carro.getPlaca() + " | " + quebra_galho.carro.getMarca() + " | "
                    + quebra_galho.carro.getModelo() + " | " + quebra_galho.carro.getPreco());
            quebra_galho = quebra_galho.proximo;
        }
    }

    public void remove(String placa) throws Exception {
        No quebra_galho = cabeca.proximo;

        for (int i = 0; i < tamanho; i++) {
            if (quebra_galho.carro.getPlaca().equals(placa)) {
                posicao = i + 1;
                contem = true;
                break;
            }

            quebra_galho = quebra_galho.proximo;
        }

        System.out.println("O valor da posicao é " + tamanho);

        if (tamanho == 0) {
            throw new Exception();
        }

        if (contem == true) {
            if (posicao == 1) {
                System.out.println("Inicio");
                removeInicio();
            }

            else if (posicao == tamanho) {
                System.out.println("Fim");
                removeFim();
            }

            else {
                System.out.println("Meio");
                No el = cabeca.proximo;
                // Lembrar de pegar o anterior ao que será removido //
                for (int i = 1; i < posicao - 1; ++i) {
                    el = el.proximo;
                }

                el.proximo = el.proximo.proximo;

                if (el.proximo != null) {
                    el.proximo.anterior = el;
                }

                tamanho--;

            }
        }

        else {
            System.out.println("Não existe carro com essa placa" + placa);
        }

    }

    // Remove no início //
    public void removeInicio() throws Exception {
        if (tamanho == 0) {
            throw new Exception("Lista vazia");
        }

        cabeca.proximo = cabeca.proximo.proximo;

        if (cabeca.proximo != null) {
            cabeca.proximo.anterior = cabeca;
        }

        tamanho--;

        if (tamanho == 0) {
            cauda = null;
        }

    }

    public void removeFim() throws Exception {
        if (tamanho == 0) {
            throw new Exception("Lista vazia");
        }

        if (tamanho == -1) {
            removeInicio();
        }

        else {
            No el = cabeca.proximo;
            while (el.proximo != null) {
                el = el.proximo;
            }

            // Atualiza o último nó //
            if (el.anterior != null) {
                elemento.anterior.proximo = null;

            }
            cauda = el.anterior;
            tamanho--;
        }

    }
}
