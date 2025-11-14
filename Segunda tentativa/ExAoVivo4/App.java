import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Deque deque = new Deque();
        int qtdCav = 10;
        int qtdPer = 10;
        String nome = "";
        int qtdPoder = 0;
        Cavaleiro vencedor = new Cavaleiro();
        Cavaleiro resultado [] = new Cavaleiro[2];
        int rodada = 0;
        Scanner teclado = new Scanner(System.in);

        try{
            qtdCav = teclado.nextInt();
            qtdPer = teclado.nextInt();
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }


        try{
            try{
                while(qtdCav > 0){
                    nome = teclado.next();
                    qtdPoder = teclado.nextInt();

                    deque.addF(new Cavaleiro(nome, qtdPoder));
                    qtdCav--;
                }  
            }

            catch(Exception e){
                System.out.println("Ocorreu o seguinte erro ao inserir no inicio " + e.getMessage());
            }
             
            

            while(qtdPer > 0){
                rodada = teclado.nextInt();

                resultado = deque.remover(rodada);

                int j1 = resultado[0].getQtdPoder();
                int j2 = resultado[1].getQtdPoder();

                if(j1 > j2){
                    System.out.println("");
                    System.out.println(resultado[0].getNome() + " " + resultado[1].getNome());
                    deque.addI(resultado[0]);
                    deque.addF(resultado[1]);
                }

                else{
                    System.out.println(resultado[1].getNome() + " " + resultado[0].getNome());
                    deque.addI(resultado[1]);
                    deque.addF(resultado[0]);
                }


                qtdPer--;
            }
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        teclado.close();

    }
}
