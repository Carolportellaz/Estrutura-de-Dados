import java.util.Random;

public class Atividade01E {
    public static int[] preencher() {
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 1, 12};
        Random gerador = new Random();

        // ALOCA OS NÚMEROS NO VETOR //
        //for (int i = 0; i < 10; i++) {
        //    vetor[i] = gerador.nextInt(100);
        //}

        return vetor;

    }

    // 1 2 3 4 5 6 7 8 9 10//
    // 1 3 5 7 9 //

    // 1
    // 2
    // 3
    // 4
    // 5
    // 6 j == 5
    // 7
    // 8
    // 9
    // 10 9º

    // posicao == i //

    public static int[] par(int[] vetor) throws Exception {
        int ultima = 10;
        int posicao;

        for (int i = 0; i < ultima; i++) {
            int n = vetor[i];
            int div = n;

            while ((div != 0) && (div != 1)) {
                try {
                    div = div % 2;

                } catch (Exception e) {
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }
            }


            if (div == 0) {
                posicao = i;
                ultima--;




                // MUDANDO DE LUGAR //
                for (int p = posicao; p < ultima; p++) {
                    System.out.println(p);
                    vetor[p] = vetor[p + 1];
                }
            }

        }

        System.out.println(ultima);

        return vetor;

    }

    public static void main(String[] args) {
        int[] vetor = preencher();

        System.out.println("São os valores do vetor normal: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        try {
            System.out.println("\nSão os valores do vetor ímpar: ");
            vetor = par(vetor);
            for (int i = 0; i < 10; i++) {
                if (vetor[i] != 0) {
                    System.out.print(vetor[i] + " ");

                }
            }

        } catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

    }
}