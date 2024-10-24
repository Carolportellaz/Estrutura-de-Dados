import java.util.Scanner;
public class Atividade05 {
    public int mdc(int x, int y){
        if((x >= y) && (x % y == 0.0)){
            return y;
        }

        if(x < y){
            return mdc(y ,x);
        }

        else{
            return mdc(y, x % y);
        }
    }

    public static void main (String [] args){
        Atividade05 atividade05 = new Atividade05();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o 1º número: ");
        int x = teclado.nextInt();

        System.out.println("Informe o 2º número: ");
        int y = teclado.nextInt();

        int mdc = atividade05.mdc(x, y);
        System.out.println("O valor será: " + mdc);
        
        teclado.close();
    
    }
}
