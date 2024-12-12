import java.util.Scanner;

public class App {
    static int tamanho = 0;
    static int chave;
    static double nota;
    static int [] opcao = new int[10];
    static Lista lista = new Lista();
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (tamanho < 20) {
            System.out.println("Informe o valor da chave: ");
            chave = teclado.nextInt();

            System.out.println("Informe o valor da nota: ");
            chave = teclado.nextInt();

            System.out.println("Informe o valor da opcao 1: ");
            opcao[0] = teclado.nextInt();

            System.out.println("Informe o valor da opcao 2: ");
            opcao[1] = teclado.nextInt();

            System.out.println("Informe o valor da opcao 3: ");
            opcao[2] = teclado.nextInt();

            try {
                lista.add(chave, nota, opcao);
            } 
            
            catch (Exception e) {
                System.out.println("Ocorreu o seguinte erro " + e.getMessage());
            }

            tamanho++;
        }

        teclado.close();
    }
}
