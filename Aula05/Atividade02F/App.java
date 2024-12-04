import java.util.Scanner;

public class App {
    int escolha;
    String placa;
    String modelo;
    String marca;
    double preco;
    Lista lista = new Lista();
    No quebra_galho;

    public static void main(String[] args) {
        App app = new App();
        app.mensagem();
    }

    public int mensagem() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Você deseja: 1.Inserir | 2.Excluir | 3.Imprimir");
        escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Informe a placa");
                placa = teclado.next();

                System.out.println("Informe o modelo");
                modelo = teclado.next();

                System.out.println("Informe a marca");
                marca = teclado.next();

                System.out.println("Informe a preço");
                preco = teclado.nextDouble();

                Carro carro = new Carro(placa, modelo, marca, preco);
                lista.adicionar(carro);
                lista.imprimir();
                break;

            case 2:
                System.out.println("Informe a placa: ");
                placa = teclado.next();

                try {
                    lista.remove(placa);
                    lista.imprimir();
                }

                catch (Exception e) {
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }
                break;

            case 3:
                lista.imprimir();
                break;

            default:
                break;
        }

        System.out.println("Você deseja realizar outra ação? 1.Sim | 2.Não");
        escolha = teclado.nextInt();

        if (escolha == 1) {
            return mensagem();
        }

        else {
            return 1;
        }

    }
}