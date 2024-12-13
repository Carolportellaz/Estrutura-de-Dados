import java.util.Scanner;
public class App{
    static int n = 1;
    static int tamanho;
    static String [] entrada;
    static String [] saida;
    static Pilha pilha = new Pilha();
    static boolean isVazia = false;

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        while(n != 0){
            System.out.println("Informe a o tamanho");
            tamanho = teclado.nextInt();

            entrada = new String[tamanho];
            saida = new String[tamanho];


            for(int i = 0; i < tamanho; i++){
                System.out.println("Informe a letra de entrada " + (i + 1));
                entrada[i] = teclado.next();
            }

            for(int i = 0; i < tamanho; i++){
                System.out.println("Informe a letra de saída " + (i + 1));
                saida[i] = teclado.next();
            }

            try {
                isVazia = pilha.add(entrada, saida);

                if(isVazia == true){
                    System.out.println("Possivel");
                }

                else{
                    System.out.println("Impossível");
                }

            } catch (Exception e) {
                System.out.println("Ocorreu o guinte erro" + e.getMessage());
            }

        }
    }
}