import java.util.Scanner;

public class Atividade03 {
    public boolean funcPrimo(int num, int div) {

        if (div == 1) {
            return true;
        }

        // TRATAMENTO QUANDO É 1 OU NEGATIVO//
        if (num <= 1) {
            return false;
        }
        // VERIFICA SE O NÚMERO É PRIMO //
        if (num % div == 0) {
            return false;
        }

        return funcPrimo(num, div - 1);
    }

    public static void main(String[] args) {
        Atividade03 atividade01 = new Atividade03();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = teclado.nextInt();
        boolean primo = atividade01.funcPrimo(num, num - 1);
        System.out.println(primo);

        teclado.close();
    }

}