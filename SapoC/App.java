import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int qtd;
        int posicao;
        int iteracao1 = 0;
        int iteracao2 = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de pedras: ");
        qtd = teclado.nextInt();

        iteracao1 = qtd;
        iteracao2 = qtd;

        System.out.println("Informe a posição");
        posicao = teclado.nextInt();

        Lista lista = new Lista();
        try {
            while(iteracao1 > 0){
                lista.addF(iteracao1);
                iteracao1--;
            }
        } 
        
        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro ao adicionar " + e.getMessage());
        }

        try{
            System.out.println("É possível? " + lista.pulo(posicao));
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        /*while(0 < iteracao2){
            try {
                System.out.println(lista.imprimir(iteracao2));
                iteracao2--;

            } 
            
            catch (Exception e) {
                System.out.println("Ocorreu o seguinte erro ao tentar imprimir " + e.getMessage());
            }
        }*/

        teclado.close();
    }
}
