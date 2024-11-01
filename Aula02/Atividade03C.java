import java.util.Scanner;
public class Atividade03C {
    int inicio = 0;
    int fim = -1;
    public boolean func(int [] vetor, int n) throws Exception{
        fim = (vetor.length) / 2;
        for(int i = 0; i < fim; i++){
            
        }
        
        

        

        return false;
        
    }
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        Atividade03C atividade03c = new Atividade03C();
        System.out.println("Informe um número: ");
        int n = teclado.nextInt();
        int [] vetor = {100, 95, 20, 12, 100, 519, 200, 34};
        try{
            boolean resultado = atividade03c.func(vetor, n); 

            if(resultado == true){
                System.out.println("O número está contido no vetor");
            }
    
            if(resultado == false){
                System.out.println("O número não está contido no vetor");
            }
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        teclado.close();

    }

}
