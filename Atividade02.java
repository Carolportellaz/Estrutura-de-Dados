import java.util.Scanner;

public class Atividade02 {
    static int total = 2;
    public static int pot(int n) throws Exception{
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

            try{
                int total = pot(num);
                System.out.println("O total é: " + total);
            }
    
            catch(Exception e){
                System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
            }

        teclado.close();
    }
}


// 2 * 2 * 2 * 2

