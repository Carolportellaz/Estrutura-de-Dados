import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String escolha = "";
        Fila fila = new Fila();
        String posicao = "";

        while (!(escolha.equals("0"))) {
            System.out.println("Informe o valor");
            escolha = teclado.nextLine();

            if (!(escolha.equals("0"))) {
                try {
                    if (escolha.charAt(0) == '-') {
                        posicao = escolha;
                        System.out.println("Informe o valor");
                        escolha = teclado.nextLine();
                    }

                    switch (posicao) {
                        case "-1":
                            fila.adicionar_1(escolha);
                            break;

                        case "-2":
                            fila.adicionar_2(escolha);
                            break;

                        case "-3":
                            fila.adicionar_3(escolha);
                            break;

                        case "-4":
                            fila.adicionar_4(escolha);
                            break;

                        default:
                            break;
                    }

                }

                catch (Exception e) {
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }
            }

        }

        teclado.close();

        try {
            fila.verificar();
        }

        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        try {
            fila.imprimir(fila.cabeca);
        }

        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

    }

}
