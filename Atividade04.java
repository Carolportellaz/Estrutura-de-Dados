import java.util.Scanner;
public class Atividade04{
    int total;
    public int soma(int num, int num2){
        if(num2 > 0){
            total = total + num;
            return soma(num, num2 - 1);
        }

        return total;
    }

    public static void main(String[] args) {
        Atividade04 atividade04 = new Atividade04();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número");
        int num = teclado.nextInt();

        System.out.println("Informe um outro número");
        int num2 = teclado.nextInt();

        int total2 = atividade04.soma(num, num2);
        System.out.println(total2);

        teclado.close();

    }
}