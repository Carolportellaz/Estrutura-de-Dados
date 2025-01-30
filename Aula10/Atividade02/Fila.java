public class Fila {
    Aviao cabeca_1 = new Aviao();
    Aviao cauda_1 = cabeca_1;
    int tamanho_1 = 0;

    Aviao cabeca_2 = new Aviao();
    Aviao cauda_2 = cabeca_2;
    int tamanho_2 = 0;

    Aviao cabeca_3 = new Aviao();
    Aviao cauda_3 = cabeca_3;
    int tamanho_3 = 0;

    Aviao cabeca_4 = new Aviao();
    Aviao cauda_4 = cabeca_4;
    int tamanho_4 = 0;

    int tamanho_total;
    Aviao quebra_galho_1 = cabeca_1;
    Aviao quebra_galho_2 = cabeca_2;
    Aviao quebra_galho_3 = cabeca_3;
    Aviao quebra_galho_4 = cabeca_4;

    Aviao cabeca = new Aviao();
    Aviao cauda = cabeca;

    Aviao quebra_galho_imprimir = cabeca;


    public void adicionar_1(String nome) throws Exception {
        Aviao novo_aviao = new Aviao(nome);

        if (tamanho_1 == 0) {
            cabeca_1.proximo = novo_aviao;
            cauda_1 = novo_aviao;
            tamanho_1++;
        }

        else {
            cauda_1.proximo = novo_aviao;
            cauda_1 = novo_aviao;
            tamanho_1++;
        }
    }

    public void adicionar_2(String nome) throws Exception {
        Aviao novo_aviao = new Aviao(nome);

        if (tamanho_2 == 0) {
            cabeca_2.proximo = novo_aviao;
            cauda_2 = novo_aviao;
            tamanho_2++;
        }

        else {
            cauda_2.proximo = novo_aviao;
            cauda_2 = novo_aviao;
            tamanho_2++;
        }
    }

    public void adicionar_3(String nome) throws Exception {
        Aviao novo_aviao = new Aviao(nome);

        if (tamanho_3 == 0) {
            cabeca_3.proximo = novo_aviao;
            cauda_3 = novo_aviao;
            tamanho_3++;
        }

        else {
            cauda_3.proximo = novo_aviao;
            cauda_3 = novo_aviao;
            tamanho_3++;
        }
    }

    public void adicionar_4(String nome) throws Exception {
        Aviao novo_aviao = new Aviao(nome);

        if (tamanho_4 == 0) {
            cabeca_4.proximo = novo_aviao;
            cauda_4 = novo_aviao;
            tamanho_4++;
        }

        else {
            cauda_4.proximo = novo_aviao;
            cauda_4 = novo_aviao;
            tamanho_4++;
        }
    }

    public void verificar() throws Exception {
        tamanho_total = tamanho_1 + tamanho_2 + tamanho_3 + tamanho_4;
        int cot = 0;

        while (cot < tamanho_total) {
            // Verifica se o oeste está vazio //
            if (tamanho_1 != 0) {
                if (cot == 0) {
                    cabeca.proximo = quebra_galho_1.proximo;
                    cauda = quebra_galho_1.proximo;
                    quebra_galho_1 = quebra_galho_1.proximo;
                    tamanho_1--;
                }

                else {
                    cauda.proximo = quebra_galho_1;
                    cauda = quebra_galho_1;
                    quebra_galho_1 = quebra_galho_1.proximo;
                    tamanho_1--;
                }

                cot++;
            }

            if (tamanho_3 != 0) {
                cauda.proximo = quebra_galho_3;
                cauda = quebra_galho_3;
                quebra_galho_3 = quebra_galho_3.proximo;
                tamanho_3--;
                cot++;
            }

            if (tamanho_3 != 0) {
                cauda.proximo = quebra_galho_2;
                cauda = quebra_galho_2;
                quebra_galho_2 = quebra_galho_2.proximo;
                tamanho_2--;
                cot++;
            }

            if (tamanho_4 != 0) {
                cauda.proximo = quebra_galho_4;
                cauda = quebra_galho_4;
                quebra_galho_4 = quebra_galho_4.proximo;
                tamanho_4--;
                cot++;
            }

        }


    }

    public void imprimir(Aviao quebra_galho_imprimir) throws Exception {
        while (quebra_galho_imprimir.proximo != null){
            System.out.println(quebra_galho_imprimir.getNome());
            quebra_galho_imprimir = quebra_galho_imprimir.proximo;
        }
    }
}
