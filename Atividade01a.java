import java.util.Scanner;
public class Atividade01a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int n = teclado.nextInt();
        int fat = 1; 

        if((n > 0) && (n > 1)) {
            for(int i = 0; i < n; i++){
                fat *= (n - i);
            }
        }

        else{
            if(n == 0){
                fat = 0;
            }

            else{
                if(n == 1){
                    fat = 1;
                }
            }
        }

        teclado.close();

        System.out.println("O fatorial de " + n + " é: " + fat);
    }
}
