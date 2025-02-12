import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("unchecked")

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String escolha = "1";
        String nome;
        String codigo = "";
        String ano;
        String tecnico;
        String presidente;
        Hash hash = new Hash();
        boolean correto;
        int verifica_codigo;

        while (!(escolha.equals(4))) {
            System.out.println(
                    "Informe a operação que deseja realizar: 1.Cadastrar | 2.Concultar | 3.Ver status | 4.Sair");
            escolha = teclado.next();

            correto = false;

            switch (escolha) {
                case "1":
                    while (correto == false) {
                        System.out.println("Informe o codigo");
                        codigo = teclado.next();

                        try {
                            verifica_codigo = Integer.parseInt(codigo);
                            correto = true;
                        }

                        catch (Exception e) {
                            System.out.println("Informe um valor válido");
                            correto = false;
                        }
                    }

                    System.out.println("Informe o nome");
                    nome = teclado.next();

                    System.out.println("Informe o ano de Fundacao");
                    ano = teclado.next();

                    System.out.println("Informe o técnico");
                    tecnico = teclado.next();

                    System.out.println("Informe o presidente");
                    presidente = teclado.next();

                    Time time = new Time(codigo, nome, ano, presidente, tecnico);
                    hash.put(time);

                    break;

                case "2":
                    try {
                        ArrayList<Time>[] tabela = hash.imprimir();

                        for (int i = 0; i < 10; i++) {
                            if (tabela[i] != null) {
                                for (int j = 0; j < tabela[i].size(); j++) {
                                    if (tabela[i].get(j).getCodigo() != null) {
                                        System.out.println(
                                                tabela[i].get(j).getCodigo() + " | " + tabela[i].get(j).getNome());
                                    }

                                }
                            }
                        }

                    }

                    catch (Exception e) {
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }

                    break;

                case "3":
                    try {
                        ArrayList<Time>[] tabela_status = hash.status();

                        System.out.println("O status é");
                        boolean vazia = true;

                        for(int i = 0; i < tabela_status.length; i++){
                            if(tabela_status[i] == null){
                                vazia = true;
                            }

                            else{
                                vazia = false;
                                break;
                            }
                        }

                        if(vazia == true){
                            System.out.println("Tabela vazia");
                        }

                        else{
                            for (int i = 0; i < tabela_status.length; i++) {
                                if(tabela_status[i] != null){
                                    System.out.println("A posição possui " + tabela_status[i].size() + " livros cadastrados");
                                }

                                else{
                                    System.out.println("A posição não possui livros cadastrados");
                                }
                            }
                        }

                        break;
                        
                    }

                    catch (Exception e) {
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }


                case "4":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Informe uma opção válida");
            }

        }

        teclado.close();

    }
}
