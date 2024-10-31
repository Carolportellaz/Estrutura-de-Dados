import java.util.Scanner;
public class Atividade03C {
    int cot = 0;
    public boolean func(int [] vetor, int n){

        if(vetor[cot] == n){
            System.out.println(cot);
            return true;
        }

        else{
            cot++;
            System.out.println(cot);
            return func(vetor, n);

        }
        
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
