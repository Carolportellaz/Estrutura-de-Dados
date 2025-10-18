import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada;
        int r;
        Pilha p = new Pilha();

        System.out.println("Informe a entrada");
        entrada = teclado.nextLine();

        try {
            r = p.logica(entrada);
            System.out.println("Quantidade de diamantes " + r);

        } 
        
        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        teclado.close();
        
    }
}