public class Lista2 {
    No cabeca;
    No cauda;
    int tamanho = 0;
    int iteracao_imp = 0;
    int pulo = 1;
    int calculo;
    int inicio;
    int fim;
    No distancia_frente;
    No distancia_tras;
    No no_posicao_atual;
    int calculo_frente;
    int calculo_tras;

    // O cabeça não é uma dummy
    public void addF(int elemento) throws Exception {
        No novo_elemento = new No(elemento);

        if (tamanho == 0) {
            cabeca = novo_elemento;
            cauda = novo_elemento;
        } else {
            No quebra_galho = cabeca;
            novo_elemento.proximo = quebra_galho;
            cabeca = novo_elemento;
            quebra_galho.anterior = novo_elemento;
        }

        tamanho++;
    }

    public boolean pulo(int posicao) throws Exception {
        // Verifica se é o primeiro elemento
        No quebra_galho = cabeca;
        if (quebra_galho.elemento == posicao) {
            return true;
        } else {
            distancia_frente = null;
            distancia_tras = null;

            while ((distancia_frente != null) || (distancia_tras != null) || pulo == 1) {
                if (pulo == 1) {
                    no_posicao_atual = puloF();
                    if (no_posicao_atual == null) return false;

                    pulo++;
                    if (no_posicao_atual.elemento == posicao) {
                        return true;
                    }
                    System.out.println("A posição atual é " + no_posicao_atual.elemento);
                } else {
                    distancia_frente = puloF();
                    distancia_tras = puloT();

                    if ((distancia_frente == null) && (distancia_tras == null)) {
                        return false;
                    }

                    if ((distancia_frente == null) && (distancia_tras != null)) {
                        no_posicao_atual = distancia_tras;
                        pulo++;
                    } else if ((distancia_tras == null) && (distancia_frente != null)) {
                        no_posicao_atual = distancia_frente;
                        pulo++;
                    } else {
                        // Calcula a diferença de distância
                        calculo_frente = distancia_frente.elemento - posicao;
                        calculo_frente = Math.abs(calculo_frente);

                        calculo_tras = distancia_tras.elemento - posicao;
                        calculo_tras = Math.abs(calculo_tras);

                        if (calculo_frente > calculo_tras) {
                            no_posicao_atual = distancia_tras;
                        } else {
                            no_posicao_atual = distancia_frente;
                        }
                    }

                    if (no_posicao_atual.elemento == posicao) {
                        return true;
                    }
                    System.out.println("O atual é " + no_posicao_atual.elemento);
                }
            }
        }
        return false;
    }

    public No puloT() {
        int calculo = 2 * pulo - 1;
        No quebra_galho = no_posicao_atual;

        while (calculo > 0) {
            if (quebra_galho == null || quebra_galho.anterior == null) {
                return null;
            }
            quebra_galho = quebra_galho.anterior;
            calculo--;
        }

        return quebra_galho;
    }

    public No puloF() {
        No quebra_galho;

        if (pulo == 1) {
            quebra_galho = cabeca;
        } else {
            quebra_galho = no_posicao_atual;
        }
        int calculo = 2 * pulo - 1;

        while (calculo > 0) {
            if (quebra_galho == null || quebra_galho.proximo == null) {
                return null;
            }
            quebra_galho = quebra_galho.proximo;
            calculo--;
        }

        return quebra_galho;
    }

    public int imprimir(int iteracao_imp_user) throws Exception {
        No quebra_galho = cabeca;

        while ((1 < iteracao_imp_user) && (quebra_galho.proximo != null)) {
            quebra_galho = quebra_galho.proximo;
            iteracao_imp_user--;
        }

        return quebra_galho.elemento;
    }
}
