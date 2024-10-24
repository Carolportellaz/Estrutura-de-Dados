import java.util.Scanner;

public class Atividade01b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int conta = 0;
        int total = 1;

        System.out.println("Informe a quantidade de números");
        int nUser = teclado.nextInt();

        for(int i = 2; i <= nUser; i++){
            conta = n1 + n2;
            n1 = n2; 
            n2 = conta;
            total = total + conta;
        }

        teclado.close();

        System.out.println("O total é " + total);
    }
}