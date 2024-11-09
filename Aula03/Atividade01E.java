import java.util.Random;

public class Atividade01E {
    public static int[] preencher() {
        int vetor[] = new int[10];
        Random gerador = new Random();

        // ALOCA OS NÚMEROS NO VETOR //
        for (int i = 0; i < 10; i++) {
            vetor[i] = gerador.nextInt(100);
        }

        return vetor;

    }

    public static int[] par(int[] vetor) throws Exception {
        int ultima = vetor.length;
        int posicao;

        for (int i = 0; i < ultima; i++) {
            int n = vetor[i];


            if (n % 2 == 0) {
                posicao = i;
                ultima--;




                // MUDANDO DE LUGAR //
                for (int p = posicao; p < ultima; p++) {
                    vetor[p] = vetor[p + 1];
                }

                vetor[ultima] = 0;

                i--;
            }

        }

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
