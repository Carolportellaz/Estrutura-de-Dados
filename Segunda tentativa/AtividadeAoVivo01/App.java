import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int qtd;
        int elemento;
        String escolha = "";
        Scanner teclado = new Scanner(System.in);
        Pilha pilha = new Pilha();

        // Quantidade de emtadas //
        qtd = teclado.nextInt();

        while(qtd > 0){
            // INFORMANDO O TIPO //
            teclado.nextLine();
            escolha = teclado.next();

            if(escolha.equals("PUSH")){
                elemento = teclado.nextInt();

                try{
                    pilha.push(elemento);
                }

                catch(Exception e){
                    System.out.println("Erro no push: " + e.getMessage());
                }
            }

            if(escolha.equals("POP")){
                try{
                    pilha.pop();
                }

                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

            if(escolha.equals("MIN")){
                try{
                    System.out.println(pilha.menor());
                }

                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

            qtd--;
        }

        teclado.close();
    }
}
