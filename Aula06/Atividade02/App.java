import java.util.Scanner;

public class App{
    Scanner teclado = new Scanner(System.in);
    int qtd;
    String caractere_entrada;   
    Pilha pilha = new Pilha();
    int resultado;
    public static void main(String[] args) {
        App app = new App();
        app.mensagem();
    }

    public void mensagem(){
        int x = teclado.nextInt();
        caractere_entrada = teclado.nextLine();
        while (x>0) {
            x--;
            try {
                caractere_entrada = teclado.nextLine();
                resultado = pilha.verificar(caractere_entrada);
                System.out.println(resultado);
            } 
            
            
            catch (Exception e) {
                System.out.println("Ocorreu o seguinte erro " + e.getMessage());
            }
        }

    }
}