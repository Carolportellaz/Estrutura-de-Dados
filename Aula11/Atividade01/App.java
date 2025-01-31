import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        int escolha = 1;
        String nome;
        Scanner teclado = new Scanner(System.in);
        Deque<String> deque = new Deque<>();

        while(escolha != 0){
            System.out.println("Informe o nome");
            nome = teclado.nextLine();

            System.out.println("Informe a operacao: 1.Adicionar início | 2. Adicionar fim | 3.Remover início | 4.Remover fim");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    deque.addI(nome);
                    break;
            
                default:
                    break;
            }
        }
        /*for(deque.isEmpty()){
            System.out.println(deque.);
        }*/

        teclado.close();
        
    }
}