import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        int qtd;
        int altura;
        Arvore ar = new Arvore();

        Scanner teclado = new Scanner(System.in);
        qtd = teclado.nextInt();

        while (qtd > 0) {
            altura = teclado.nextInt();

            ar.add(ar.raiz, altura);
            qtd--;
        }

        System.out.println("");
        ar.menorPorNível(ar.raiz);
    }
}