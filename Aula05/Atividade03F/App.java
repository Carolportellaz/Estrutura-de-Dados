import java.util.Scanner;
public class App{
    String nome;
    String pais;
    String atrativos;
    int nota;
    int escolha;
    Lista lista = new Lista();
    int iteracao = 1;

    public static void main(String args[]){
        App app = new App();
        app.mensagem();
    }

    public int mensagem(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Você deseja: 1.Inserir | 2.Excluir | 3.Imprimir");
        escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                // Inserir //
                System.out.println("Informe o nome");
                nome = teclado.next();

                System.out.println("Informe o país");
                pais = teclado.next();

                System.out.println("Informe os atrativos");
                atrativos = teclado.next();

                System.out.println("Informe o nota");
                nota = teclado.nextInt();

                while(nota > 10 || nota < 0){
                    System.out.println("Insira valores entre 0 e 10");
                    System.out.println("Informe o nota");
                    nota = teclado.nextInt();
                }

                Cidade c = new Cidade(nome, pais, atrativos, nota);

                lista.add(c);

                System.out.println("Está inserindo certo ");

                try {
                    lista.imprimirC();

                } catch (Exception e) {
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }

                break;
        
            case 2: 
            
            case 3:
            try {
                lista.imprimirD(iteracao);

            } catch (Exception e) {
                System.out.println("Ocorreu o seguinte erro " + e.getMessage());
            }

            default:
                break;
        }

        System.out.println("Você deseja realizar uma nova operação? 1.Sim | 2.Não");
        escolha = teclado.nextInt();

        if(escolha == 1){
            iteracao++;
            return mensagem();
        }   

        return 1;
    }
}