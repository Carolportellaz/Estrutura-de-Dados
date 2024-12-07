import java.util.Scanner;
public class App {
    int qtd_vagoes;
    String [] vet_a;
    String [] vet_b;
    Pilha pilha = new Pilha();
    boolean resultado;

    public static void main (String args[]){
        App app = new App();
        app.mensagem();
    }

    public int mensagem(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de vagões");
        qtd_vagoes = teclado.nextInt();

        vet_a = new String[qtd_vagoes];
        vet_b = new String[qtd_vagoes];


        System.out.println("Informe os valores do primeiro vagão");
        for(int i = 0; i < vet_a.length; i++){
            System.out.println("Informe o n" + (i + 1));
            vet_a[i] = teclado.next();
        }

        System.out.println("Informe os valores do segundo vagão");
        for(int i = 0; i < vet_b.length; i++){
            System.out.println("Informe o n" + (i + 1));
            vet_b[i] = teclado.next();
        }

        try {
            resultado = pilha.verifica(vet_a, vet_b);
            if(resultado == true){
                System.out.println("Funciona");
            }

            else{
                System.out.println("Não funciona");
            }
        } 
        
        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
        


        return 1;
    }
}