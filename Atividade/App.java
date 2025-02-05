import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtd_cartas = 0;
        int qtd_acordos = 0;
        int cidade1;
        int cidade2;
        int horas;
        int consultas;

        System.out.println("Informe a quantidade de cartas: ");
        qtd_cartas = teclado.nextInt();

        System.out.println("Informe a quantidade de acordos: ");
        qtd_acordos = teclado.nextInt();

        while(qtd_acordos != 0){
            System.out.println("Informe a cidade x");
            cidade1 = teclado.nextInt();
    
            System.out.println("Informe a cidade y");
            cidade2 = teclado.nextInt();
    
            System.out.println("Informe a quantidade de horas");
            horas = teclado.nextInt();

            qtd_acordos--;
        }

        System.out.println("Informe a quantidade de consultas: ");
        consultas = teclado.nextInt();

        System.out.println();


        

        System.out.println("");        

    }
}