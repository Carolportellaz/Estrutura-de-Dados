import java.util.Scanner;

public class Atividade04E {
    static int qtd = 0;
    static Integer[] vetor = new Integer[10];
    int posicao = 0;
    int ultima = 0;
    int ultima2 = 0;

    int numero;

    Scanner teclado = new Scanner(System.in);

    public Integer[] pergunta() throws Exception {
        System.out.println("Você deseja: ");
        System.out.println("1. Adicionar no início");
        System.out.println("2. Adicionar no meio entre 0 e " + ultima);
        System.out.println("3. Adicionar no final");
        int escolha = teclado.nextInt();

        System.out.println("Informe um número: ");
        int numero = teclado.nextInt();

        if (vetor[0] == null) {
            vetor[0] = numero;
            ultima = 0;
        }

        else {
            if (escolha == 1) {

                for (int i = ultima; i >= 0; i--) {
                    vetor[i + 1] = vetor[i];
                }

                vetor[0] = numero;
                ultima++;
                qtd++;

            }

            if (escolha == 3) {
                System.out.println("A ultima posicao vai ser " + ultima);
                vetor[ultima + 1] = numero;
                ultima++;
                qtd++;

            }

            if (escolha == 2) {
                posicao = ultima / 2;

                for (int i = ultima; i >= posicao; i--) {
                    vetor[i + 1] = vetor[i];
                }

                System.out.println("O valor da posição é " + posicao);
                System.out.println("O valor do ultimo é " + ultima);

                vetor[posicao + 1] = numero;
                ultima++;
                qtd++;

            }



            else{
                System.out.println("Informe uma escolha válida");
            }

        }


        System.out.println("Os valores do vetor agora são: ");
        for (int i = 0; i <= ultima; i++) {
            System.out.println(vetor[i]);
        }

        if (qtd < 10) {
            return pergunta();
        }

        else {
            return vetor;
        }
    }

    public static void main(String[] args) {
        Atividade04E atividade04e = new Atividade04E();
        try {
            Integer[] vetor = atividade04e.pergunta();
            System.out.println("O vetor final é ");

            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " | ");
                ;
            }

        }

        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
    }

}
