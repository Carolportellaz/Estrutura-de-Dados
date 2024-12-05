import java.util.Scanner;

public class App {
    String nome;
    String pais;
    String atrativos;
    int nota;
    int escolha;
    Lista lista = new Lista();
    int iteracao = 0;
    int iteracao2 = 0;
    boolean comeco = true;
    boolean comeco2 = true;
    No quebra_galho_prox;
    No quebra_galho_ant;

    public static void main(String args[]) {
        App app = new App();
        app.mensagem();
    }

    public int mensagem() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Você deseja: 1.Inserir | 2.Excluir | 3.Próximo | 4.Anterior");
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

                while (nota > 10 || nota < 0) {
                    System.out.println("Insira valores entre 0 e 10");
                    System.out.println("Informe o nota");
                    nota = teclado.nextInt();
                }

                Cidade c = new Cidade(nome, pais, atrativos, nota);

                lista.add(c);

                System.out.println("Está inserindo certo ");

                try {
                    lista.imprimirD();

                } catch (Exception e) {
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }

                break;

            case 2:
                System.out.println("Informe o país");
                pais = teclado.next();

                System.out.println("Informe o nome da cidade");
                nome = teclado.next();

                try{
                    lista.remover2(pais, nome);
                }

                catch(Exception e){
                    System.out.println("Ocorreu o seguinte " + e.getMessage());
                }
                break;

            case 3:
                try {
                    quebra_galho_prox = lista.proximo(comeco, iteracao);

                    if (quebra_galho_prox == null) {
                        System.out.println("Não há próximo a esse valor");
                    }

                    else {
                        System.out.println("O valor proximo é ");
                        System.out.println(quebra_galho_prox.elemento.getNome() + " | "
                                + quebra_galho_prox.elemento.getAtrativos() + " | "
                                + quebra_galho_prox.elemento.getNota() + " | " + quebra_galho_prox.elemento.getPais());

                        iteracao++;
                        comeco = false;
                        comeco2 = false;
                    }

                }

                catch (Exception e) {
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }

                break;

            case 4:
                try {
                    quebra_galho_ant = lista.anterior(comeco2, iteracao2);

                    if(quebra_galho_ant == null){
                        System.out.println("Não há valor anterior a esse");
                    }

                    else{
                        System.out.println("O valor anterior é ");
                        System.out.println(quebra_galho_ant.elemento.getNome() + " | "
                                + quebra_galho_ant.elemento.getAtrativos() + " | "
                                + quebra_galho_ant.elemento.getNota() + " | " + quebra_galho_ant.elemento.getPais());
    
                        iteracao2++;
                        comeco2 = false;
                    }
                }

                catch (Exception e) {
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }

                break;

            default:
                break;
        }

        System.out.println("Você deseja realizar uma nova operação? 1.Sim | 2.Não");
        escolha = teclado.nextInt();

        if (escolha == 1) {
            return mensagem();
        }

        return 1;
    }
}