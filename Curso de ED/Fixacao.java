import java.util.Scanner;
public class Fixacao {
    Scanner teclado = new Scanner(System.in);
    Integer [] vet1 = new Integer[10];
    Integer [] vet2 = new Integer[10];
    Integer [] vet3 = new Integer[20];
    int escolha;
    int ultima1 = 3;
    int numero;
    int posicao = 3;
    int index = -1;
    boolean parada = false;

    public Integer [] inserir1(int numero){
        vet1[0] = 2;
        vet1[1] = 2; 
        vet1[2] = 4;
        if(vet1[0] == null){
            vet1[0] = numero;
            ultima1++;
        }

        else{
            parada = false;
            for(int i = 0; i < ultima1; i++){
                if(numero <= vet1[i]){
                    index = i;
                    System.out.println("O index é " + index);
                    System.out.println("O index é " + index);
                    break;
                }
            }

    
            for(int i = ultima1; i > index; i--){
                vet1[i] = vet1[i - 1];
            }
    
            vet1[index] = numero;
            ultima1++;

        }

        return vet1;

    }

    public void mensagem(){
        System.out.println("Seja bem vindo, você deseja inserir no 1.vetor I ou 2.vetor II?");
        escolha = teclado.nextInt();

        System.out.println("Informe o número desejado");
        numero = teclado.nextInt();

        if(escolha == 1){
            System.out.println("O novo vetor agora é: ");
            vet1 = inserir1(numero);
            for(int i = 0; i < vet1.length; i++){
                System.out.print(" | " + vet1[i]);
            }
        }

        teclado.close();


    }

    public static void main(String[] args) {
        Fixacao fixacao = new Fixacao();
        fixacao.mensagem();
    }

}
