import java.util.Random;

public class Atividade02E {
    public static int[] preencher() throws Exception {
        int vetor[] = new int[100];
        Random gerador = new Random();

        int ultima = 0;
        int posicao = 0;
        int anterior = 0;
        int ultima2;

        // INSERINDO NO VETOR OS NÚMEROS //
        for (int cot = 0; cot < 100; cot++) {
            int n = gerador.nextInt(1000);
            int escolha = gerador.nextInt(3) + 1;

            if (ultima == 0) {
                vetor[0] = n;
                ultima++;
                anterior = ultima;
                posicao = ultima; 
            }

            else {
                if (escolha == 1) {
                    posicao = ultima;
                    anterior = posicao;

                    for (int i = 0; i < ultima; i++) {
                        vetor[posicao] = vetor[posicao - 1];
                        posicao--;
                    }

                    posicao = 1;

                    vetor[0] = n;
                    ultima++;

                }

                if (escolha == 2) {
                    vetor[ultima] = n;
                    anterior = ultima;
                    posicao = ultima;
                    ultima++;

                }

                if (escolha == 3) {

                    // TRATAMENTO SE A POSIÇÃO FOR A 1º //
                    if(posicao == 1){
                        cot--;
                    }

                    else{
                        // VARIÁVEL ÚLTIMA SÓ PARA NÃO MODIFICÁ-LA //
                        ultima2 = ultima;

                        for (int j = ultima2; j >= posicao; j--) {
                            vetor[j + 1] = vetor[j];

                        }

                        vetor[posicao] = n;

                        ultima++;
                    }

                    
                }

            }
        }

        return vetor;
    }

    public static void main(String[] args) {
        try {
            int[] vetor = preencher();

            System.out.println("Os valores do vetor1 são: ");

            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);

            }
        }

        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

    }

}
