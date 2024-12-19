import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int qtd;
        int posicao;
        int iteracao_imp_user = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de pedras: ");
        qtd = teclado.nextInt();

        System.out.println("Informe a posição");
        posicao = teclado.nextInt();

        Pilha pilha = new Pilha();
        try {
            pilha.addI(qtd, posicao);
        } 
        
        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro ao adicionar " + e.getMessage());
        }
        
        while(iteracao_imp_user < qtd){
            try {
                System.out.println(pilha.imprimir(iteracao_imp_user));
                iteracao_imp_user++;

            } 
            
            catch (Exception e) {
                System.out.println("Ocorreu o seguinte erro ao tentar imprimir " + e.getMessage());
            }
        }

        teclado.close();
    }
}
