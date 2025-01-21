import java.util.Scanner;
public class App{
    public static void main (String args[]){
        String titulo;
        Fila fila = new Fila();
        Scanner teclado = new Scanner(System.in);
        int escolha = 1;
        Processo [] resultado = new Processo[10];
        while (escolha != 0) {
            System.out.println("Qual operação você deseja fazer: 1.Incluir | 2.Retirar | 3.Imprimir | 4.Localizar | 5.Excluir ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Informe o título: ");
                    titulo = teclado.next();
                    try{
                        fila.inserir(titulo);
                    }

                    catch(Exception e){
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }
                    break;
                
                case 3:
                    resultado = fila.imprimir();
                    System.out.println("Inicio " + fila.inicio + " Fim " + fila.fim);
                    for(int i = fila.inicio; fila.inicio >= fila.fim; i++){
                        System.out.println(resultado[i].getId() + " | " + resultado[i].getTitulo());
                    }
            
                default:
                    break;
            }
        }
        teclado.close();
    }
}