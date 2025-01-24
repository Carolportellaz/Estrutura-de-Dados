import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = "";
        String fila_escolha = "";
        Fila<Pessoa> fila = new Fila<>();

        while (!(nome.equals("0"))) {
            System.out.println("Informe o nome");
            nome = teclado.next();

            if (nome.equals("0")) {
                break;
            }

            System.out.println("Informe a fila");
            fila_escolha = teclado.next();

            try {
                fila.enfileirar_q(new Pessoa(nome, fila_escolha));
            }

            catch (Exception e) {
                System.out.println("Ocorreu o seguinte erro " + e.getMessage());
            }
        }

        try {
            Pessoa p;
            // 'Método' para imprimir //
            System.out.println("Lista completa");
            while (fila.isVazia() == false) {
                p = fila.desenfilera();
                System.out.println(p.getNome() + " | " + p.getFila());
            }

        } 
        
        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        try{
            System.out.println(" ");
            System.out.println("Lista A");
            Pessoa p;

            while(fila.isVazia_a() == false){
                p = fila.desenfilera_a();
                System.out.println(p.getNome() + " | " + p.getFila());
            }
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        try {
            System.out.println(" ");
            System.out.println("Lista B");
            Pessoa p;

            while(fila.isVazia_b() == false){
                p = fila.desenfilera_b();
                System.out.println(p.getNome() + " | " + p.getFila());
            }
        } 
        
        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
        teclado.close();
    }
}
