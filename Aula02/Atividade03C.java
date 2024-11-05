import java.util.Scanner;
public class Atividade03C {
    int var;

    public boolean func(int [] vetor, int n, int fim, int inicio) throws Exception{
        fim = fim / 2;
            for(int i = 0; i <= fim; i++){
                if(inicio < vetor.length){

                    if(vetor[inicio] == n){
                        var = n;
                    }
                }
    
                inicio++;
    
            }
    

        if(var == n){
            return true;
        }

        else{
            if(inicio < vetor.length){
                return func(vetor, n, fim, inicio);
                
            }

            else{
                return false;
            }
        }

                
    }
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        Atividade03C atividade03c = new Atividade03C();
        int [] vetor = {45, 2, 7, 6, 45, 8, 54, 2};
        System.out.println("Informe um número: ");
        int n = teclado.nextInt();
        int fim = vetor.length;
        int inicio = 0;

        
        try{
            boolean resultado = atividade03c.func(vetor, n, fim, inicio); 

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
