import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtd;
        int altura; 
        Arvore arv = new Arvore();

        System.out.println("Informe a quantidade de crianças");
        qtd = teclado.nextInt();

        while(qtd > 0){
            System.out.println("Informe a altura");
            altura = teclado.nextInt();

            arv.add(arv.raiz, altura);
            qtd--;
        }


        arv.imprimir(arv.raiz);

        System.out.println("Exibindo");
        arv.saida(arv.raiz, arv.raiz);

        teclado.close();
    }
}