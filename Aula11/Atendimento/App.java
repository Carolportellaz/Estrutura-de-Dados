import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int escolha = 1;
        String nome;
        Scanner teclado = new Scanner(System.in);
        Deque<String> deque = new Deque<>();

        while (escolha != 0) {
            System.out.println(
                    "Informe a operacao: 1.Adicionar início | 2. Adicionar fim | 3.Remover início | 4.Remover fim | 5.Imprimir ");
            escolha = teclado.nextInt();

            if (escolha == 0) {
                break;
            }
            try {
                switch (escolha) {
                    case 1:
                        System.out.println("Informe o nome");
                        nome = teclado.next();
                        deque.addI(nome);
                        break;

                    case 2:
                        System.out.println("Informe o nome");
                        nome = teclado.next();
                        break;

                    case 3:
                        System.out.println(deque.removeI() + " foi removido");
                        break;
                    case 4:
                        break;

                    case 5:
                        while (deque.tamanho_imprimir != 0) {
                            try {
                                System.out.println(deque.imprimir());
                            }

                            catch (Exception e) {
                                System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                            }
                        }

                        deque.tamanho_imprimir = deque.tamanho;
                        break;

                    default:
                        break;
                }
            }

            catch (Exception e) {
                System.out.println("Ocorreu o seguinte erro " + e.getMessage());
            }

        }

        teclado.close();

    }
}
