import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdCase = teclado.nextInt();

        while(qtdCase > 0){
            Arvore arv = new Arvore();
            
            int qtdEl = teclado.nextInt();

            while(qtdEl > 0){
                qtdEl--;

                arv.add(teclado.nextInt(), arv.raiz);
            }

            System.out.println("Case " + qtdCase + ":");
            System.out.println("Pre.: ");

            try{
                arv.imprimirIn(arv.raiz);
            }

            catch(Exception e){
                System.out.println("");
                System.out.println("Erro ao imprimir " + e.getMessage());
            }

            qtdCase--;
        }

        
        
    }
}
