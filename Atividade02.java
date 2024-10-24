import java.util.Scanner;

public class Atividade02 {
    static int total = 2;
    public static int pot(int n){
        if(n > 1){
           total = total * 2; 
           return pot(n - 1);
        }

        else{
            return total;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num = teclado.nextInt();
        int total = pot(num);
        System.out.println("O total é: " + total);

        teclado.close();
    }
}


// 2 * 2 * 2 * 2

