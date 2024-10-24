import java.util.Scanner;

public class Atividade01b {
    int n1 = 0;
    int n2 = 1;
    int conta = 0;
    int total = 1;

    public int fib(int nUser) throws Exception{
        if(nUser >= 0){
            for(int i = 2; i <= nUser; i++){
                conta = n1 + n2;
                n1 = n2; 
                n2 = conta;
                total = total + conta;
            }
    
            return total;
        }
        
        return 0;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de números");
        int nUser = teclado.nextInt();
        Atividade01b atividade01b = new Atividade01b();

        try{
            int total = atividade01b.fib(nUser);
            System.out.println("O total é " + total);
        }

        catch(Exception e){
            System.err.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        teclado.close();

    }
}
