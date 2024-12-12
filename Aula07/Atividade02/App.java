import java.util.Scanner;

public class App {
    static int tamanho;
    static int iteracao = 0;
    static Pilha pilha = new Pilha();
    static int [] vet;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o tamanho");
        tamanho = teclado.nextInt();
        vet = new int[tamanho];

        try {
            pilha.add(tamanho);
            vet = pilha.imprimir();

            for(int i = 0; i < vet.length; i++){
                System.out.println(vet[i]);
            }
        } 
        
        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage() );
        }
        

        

    }
}
