import java.util.Scanner;

public class Atividade04E {
    static int qtd = 0;
    static Integer [] vetor = new Integer[10];
    int posicao = 0;
    int numero;


    Scanner teclado = new Scanner(System.in);

    public Integer [] pergunta() throws Exception{
        System.out.println("\nVocê deseja: ");
        System.out.println("1.INSERIR | 2.EXCLUIR");
        int escolha = teclado.nextInt();

        

        System.out.println("Informe a posição entre: ");
        posicao = teclado.nextInt();

        if(escolha == 1){

            System.out.println("Informe um número: ");
            int numero = teclado.nextInt();

            if(vetor[posicao - 1] == null){
                vetor[posicao - 1] = numero;
                qtd++;
            }

            else{
                System.out.println("Já há um número inserido nessa posição");
            }
        }

        if(escolha == 2){
            if(vetor[posicao - 1] != null){
                vetor[posicao - 1] = null;
                qtd--;
            }

            else{
                System.out.println("Não há nenhum número nessa posição");
            }
        }

        if(qtd < 10){
            return pergunta();
        }

        return vetor;
    }

    public static void main(String[] args) {
        Atividade04E atividade04e = new Atividade04E();
        try {
            Integer [] vetor = atividade04e.pergunta();
            System.out.println("Os valores são ");

            for(int i = 0; i < vetor.length; i++){
                System.out.print(vetor[i] + " | ");;
            }

        } 
        
        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
    }

}
