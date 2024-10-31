import java.util.Scanner;
public class Atividade03C {
    int cot = 0;
    public boolean func(int [] vetor, int n){

        if(vetor.length > cot){
            if(vetor[cot] == n){
                return true;
            }

            else{
                System.out.println(cot);
                cot++;
                return func(vetor, n);
            }
        }

        return false;

        // cot 0 
        // cot 1
        // cot 2
        // cot 3
        // cot 

        
    }
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        Atividade03C atividade03c = new Atividade03C();
        System.out.println("Informe um número: ");
        int n = teclado.nextInt();
        int [] vetor = {100, 95, 20, 519, 200, 34};
        boolean resultado = atividade03c.func(vetor, n); 

        if(resultado == true){
            System.out.println("O número está contido no vetor");
        }

        if(resultado == false){
            System.out.println("O número não está contido no vetor");
        }

        teclado.close();

    }

}
