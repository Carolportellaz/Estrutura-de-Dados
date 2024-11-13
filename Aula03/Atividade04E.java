import java.util.Scanner;

public class Atividade04E {
    static int qtd = 0;
    static Integer [] vetor = new Integer[10];
    int posicao = 0;
    int numero;


    Scanner teclado = new Scanner(System.in);

    public Integer [] pergunta() throws Exception{
        System.out.println("Você deseja: ");
        System.out.println("1. Adicionar um elemento");
        System.out.println("2. Excluir um elemento");
        int escolha = teclado.nextInt();

        if(escolha == 1){

            System.out.println("Informe um número: ");
            int numero = teclado.nextInt();

            System.out.println("Informe a posição dentro das vagas disponíveis: ");
            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] == null){
                    System.out.print(" | ");
                }

                else{
                    System.out.print(" | X");
                }
            }
            posicao = teclado.nextInt();

            if(vetor[posicao - 1] == null){
                vetor[posicao - 1] = numero;
                qtd++;
            }

            else{
                System.out.println("Já há um número inserido nessa posição");
                return pergunta();
            }
        }

        if(escolha == 2){
            System.out.println("Informe a posição dentro das vagas ocupada: ");

            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] == null){
                    System.out.print(" | ");
                }

                else{
                    System.out.print(" | X");
                }

            }

            posicao = teclado.nextInt();


            if(vetor[posicao - 1] != null){
                vetor[posicao - 1] = null;
                qtd--;
            }

            else{
                System.out.println("Não há nenhum número nessa posição");
                return pergunta();
            }
        }

        if(qtd < 10){
            System.out.println("Os valores atualizados são : \n");

            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] == null){
                    System.out.print(" | X ");
                }

                else{
                    System.out.print(" | " + vetor[i]);
                }
            }

            System.out.println("");

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
