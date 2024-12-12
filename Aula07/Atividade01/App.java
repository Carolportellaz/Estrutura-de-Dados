import java.util.Scanner;
public class App {
    static boolean continuar = true;
    static int carta_jog1;
    static int escolha;


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while(continuar == true){
            
            System.out.println("Vocẽ deseja receber mais uma: 1.Sim | 2.Não");  
            escolha = teclado.nextInt();
            
            if(escolha == 1){

            }

            if(escolha == 2){
                break;
            }
        }
    }
    
}