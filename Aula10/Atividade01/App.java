import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = "";
        String fila_escolha = "";
        Fila <Pessoa> fila = new Fila<>();

        while(!(nome.equals("0"))){
            System.out.println("Informe o nome");
            nome = teclado.next();
    
            System.out.println("Informe a fila");
            fila_escolha = teclado.next();
        }
        

        

        teclado.close();
    }
}