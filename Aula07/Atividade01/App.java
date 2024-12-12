import java.util.Scanner;
public class App {
    static boolean continuar = true;
    static int carta_jog1;
    static int soma_jog1;
    static int escolha;
    static Pilha pilha = new Pilha();
    static int pontuacao1;
    static int pontuacao2;


    // Jogador 2 //
    static boolean continuar2 = true;
    static int carta_jog2;
    static int soma_jog2;
    static Pilha2 pilha2 = new Pilha2();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        carta_jog1 = pilha.pilha_jog1();
        soma_jog1 = pilha.imp_soma_jog1();

        System.out.println("A sua carta foi " + carta_jog1);

        while(continuar == true){
            
            System.out.println("Você deseja receber mais uma: 1.Sim | 2.Não");  
            escolha = teclado.nextInt();
            

            if(escolha == 1){
                carta_jog1 = pilha.pilha_jog1();
                soma_jog1 = pilha.imp_soma_jog1();

                if(pilha.foi_retirada == true){
                    System.out.println("A sua carta retirada é " + carta_jog1);
                    pilha.imp_soma_jog1();
                    System.out.println("Sua nova soma é " + soma_jog1);

                    break;
                }

                else{
                    System.out.println("Sua carta foi " + carta_jog1);
                    System.out.println("Sua soma é " + soma_jog1);
                }

            }

            if(escolha == 2){
                break;
            }
        }

        // Jogador 2 //
        System.out.println("Agora, passe a vez para o jogador2");

        carta_jog2 = pilha2.pilha_jog2();
        soma_jog2 = pilha2.imp_soma_jog2();

        System.out.println("A sua carta foi " + carta_jog2);

        while(continuar2 == true){
            
            System.out.println("Você deseja receber mais uma: 1.Sim | 2.Não");  
            escolha = teclado.nextInt();
            

            if(escolha == 1){
                carta_jog2 = pilha2.pilha_jog2();
                soma_jog2 = pilha2.imp_soma_jog2();

                if(pilha2.foi_retirada == true){
                    System.out.println("A sua carta retirada é" + carta_jog2);
                    pilha2.imp_soma_jog2();
                    System.out.println("Sua nova soma é " + soma_jog2);

                    break;
                }

                else{
                    System.out.println("Sua carta foi " + carta_jog2);
                    System.out.println("Sua soma é " + soma_jog2);
                }

            }

            if(escolha == 2){
                break;
            }

        }

        // Ver a pontuação //
        pontuacao1 = Math.abs(soma_jog1 - 21);
        pontuacao2 = Math.abs(soma_jog2 - 21);

        if(pontuacao1 < pontuacao2){
            System.out.println("O jogador 1 ganhou");
        }

        if(pontuacao1 > pontuacao2){
            System.out.println("O jogador 2 ganhou");
        }

        else{
            System.out.println("Empate");
        }

        teclado.close();
    }
    
}