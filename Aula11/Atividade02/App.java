import java.util.Scanner;
import java.util.concurrent.ExecutionException;
public class App{
    public static void main(String[] args) {
        Deque deque = new Deque();
        Scanner teclado = new Scanner(System.in);
        int tempo;
        double valor;
        double qtd;
        int escolha;
        Valor [] vet;
        Valor removeI = new Valor(0,0);
        Valor removeF = new Valor(0,0);

        System.out.println("Informe o tempo que deseja parcelar");
        tempo = teclado.nextInt();

        System.out.println("Informe o valor que deseja financiar");
        valor = teclado.nextDouble();

        try{
            qtd = deque.calcular(tempo, valor);
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        System.out.println("Informe a operação: 1.Pagar do início | 2.Pagar final | 3.Imprimir");
        escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                try {
                    Valor removeF1 = deque.removeI();
                    System.out.println(removeF1.getValor() + removeF1.getJuros());
                } 
                
                
                catch (Exception e) {
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }
                break;

            case 2:
                try{
                    Valor removeF1= deque.removeF();
                    System.out.println(removeF1.getValor());

                    break;

                }

                catch(Exception e){
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }

            case 3: 
                vet = new Valor[deque.tamanho];
                int cot = 0;
                while(deque.tamanho_imp > 0){
                    try{
                        vet[cot] = deque.imprimir();
                        cot++;
                    }

                    catch(Exception e){
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }
                }


                for(int i = 0; i < vet.length; i++){
                    double valor1 = vet[i].getValor() + vet[i].getJuros();
                    System.out.println(valor1);
                }

                deque.tamanho_imp = deque.tamanho;

                break;

        
            default:
                break;
        }

        teclado.close();

        
    }
}