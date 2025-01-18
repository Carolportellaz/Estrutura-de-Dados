import java.util.Scanner;
public class App{
    public static void main (String args[]){
        String titulo;
        Fila fila = new Fila();
        Scanner teclado = new Scanner(System.in);
        int escolha = 1;
        while (escolha != 0) {
            System.out.println("Qual operação você deseja fazer: 1.Incluit | 2.Retirar | 3.Imprimir | 4.Localizar | 5.Excluir ");

            switch (escolha) {
                case 1:
                    System.out.println("Informe o título: ");
                    titulo = teclado.nextLine();
                    fila.inserir(titulo);
                    break;
            
                default:
                    break;
            }
        }
        teclado.close();
    }
}