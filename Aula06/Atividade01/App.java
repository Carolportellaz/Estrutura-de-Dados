import java.util.Scanner;

public class App {
    static int qtd_vagoes = 1;
    static int[] vet_a;
    static int[] vet_b;
    static boolean vet_retorno;
    static int parada = 1;
    static int iteracao = 0;
    static int valor_a;
    static int valor_b;
    static int valor;
    static boolean retorno;
    static Pilha pilha = new Pilha();
    static int posicao;

    public static void main(String[] args) {
        App app = new App();
        app.mensagem();
    }

    public static int mensagem() {
        Scanner teclado = new Scanner(System.in);

        while (qtd_vagoes != 0) {

            System.out.println("Informe quantos vagões vão ter: ");
            qtd_vagoes = teclado.nextInt();

            vet_a = new int[qtd_vagoes];
            vet_b = new int[qtd_vagoes];

            for (int i = 0; i < qtd_vagoes; i++) {
                System.out.println("Informe o valor de n" + (i + 1));
                valor = teclado.nextInt();
                vet_a[i] = valor;

                if((valor == 0) || (qtd_vagoes == 0)){
                    return mensagem();
                }
            }

            for (int j = 0; j < qtd_vagoes; j++) {
                vet_b[j] = j + 1;
            }

            try {
                retorno = pilha.verifica(vet_a, vet_b);

                if (retorno == false) {
                    System.out.println("Não há como realizar essa combinação");
                }

                else {
                    System.out.println("Há como realizar essa combinação");
                }
            }

            catch (Exception e) {
                System.out.println("Ocorreu o seguinte erro " + e.getMessage());
            }

        }

        return 1;

    }

}