import java.util.Scanner;
public class App{
    static int escolha;
    static String nome;
    static int codigo;
    static String telefone;
    static Scanner teclado = new Scanner (System.in);
    static Lista lista = new Lista();

    public static void main(String[] args) {
        mensagem();
    }

    public static int mensagem (){

        System.out.println("Qual operação você deseja fazer? 1.Inserir | 2.Exibir em ordem crescente | 3.Exibir em ordem decrescente");
        escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Informe o nome do cliente: ");
                nome = teclado.next();

                System.out.println("Informe o código: ");
                codigo = teclado.nextInt();

                System.out.println("Informe seu telefone: ");
                telefone = teclado.next();

                try {
                    Cliente cliente = new Cliente(codigo, nome, telefone);
                    lista.adicionarI(cliente);
                    lista.imprimir();
                } 
                
                catch (Exception e) {
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }
                

                break;
        
            default:
                break;
        }

        System.out.println("Você deseja realizar uma nova ação? 1.Sim 2.Não");
        escolha = teclado.nextInt();


        if(escolha == 1){
            return mensagem();
        }

        else{
            return 1;
        }


    }
}
