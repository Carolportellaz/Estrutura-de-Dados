import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Deque<Valor> deque = new Deque<Valor>();
        Scanner teclado = new Scanner(System.in);
        String tempoS = "0";
        int tempo = 0;
        String valorS = "0";
        double valor = 0;
        double qtd = 0;
        int escolha = 0;
        Valor[] vet;
        Valor removeI = new Valor(0, 0);
        Valor removeF = new Valor(0, 0);
        boolean valido = false;
        int conta;

        while (valido == false) {
            try {
                System.out.println("Informe o tempo que deseja parcelar");
                tempoS = teclado.nextLine();

                try {
                    tempo = Integer.parseInt(tempoS);
                    valido = true;
                }

                catch (Exception e) {
                    System.out.println("Informe um valor válido");
                }

                if (tempo < 0) {
                    System.out.println("Informe um valor válido");
                    valido = false;
                }
            }

            catch (Exception e) {
                System.out.println("Informe um valor válido");
            }
        }

        valido = false;

        while (valido == false) {
            try {
                System.out.println("Informe o valor que deseja financiar");
                valorS = teclado.next();

                try {
                    valor = Double.parseDouble(valorS);
                    valido = true;
                }

                catch (Exception e) {
                    System.out.println("Informe um valor válido");
                    valido = false;
                }

                if (valor < 0) {
                    valido = false;
                    System.out.println("Informe um valor válido");
                }
            }

            catch (Exception e) {
                System.out.println("Informe um valor válido");
            }
        }

        try {
            qtd = deque.calcular(tempo, valor);
        }

        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        while (escolha != 4) {
            System.out.println("Informe a operação: 1.Pagar do início | 2.Pagar final | 3.Imprimir | 4.Sair");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    try {
                        removeI = deque.removeI();
                        System.out.println("O valor a ser pago é " + removeI.getJuros());
                    }

                    catch (Exception e) {
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        removeF = deque.removeF();
                        System.out.println("O valor a ser pago é " + removeF.getValor());

                        break;

                    }

                    catch (Exception e) {
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }

                case 3:
                    vet = new Valor[deque.tamanho];
                    int cot = 0;
                    if (deque.tamanho == 0) {
                        System.out.println("Lista vazia");
                    }

                    else {
                        while (deque.tamanho_imp > 0) {
                            try {
                                vet[cot] = deque.imprimir();
                                cot++;
                            }

                            catch (Exception e) {
                                System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                            }
                        }

                        for (int i = 0; i < vet.length; i++) {
                            double valor1 = vet[i].getJuros();
                            System.out.println(valor1);
                        }

                        deque.tamanho_imp = deque.tamanho;

                        break;
                    }

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Informe uma opção válida");
                    break;
            }
        }

        teclado.close();

    }
}
