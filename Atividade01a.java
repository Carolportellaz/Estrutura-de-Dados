import java.util.Scanner;
public class Atividade01a {
    int fat = 1; 
    int valor;

    public int fat(int n) throws Exception{
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

        
            return fat;
        }

        
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int n = teclado.nextInt();
        Atividade01a atividade01a  = new Atividade01a();
        try{
            int fat = atividade01a.fat(n);
            System.out.println("O total é " + fat);
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e);
        }

        teclado.close();

    }
}
