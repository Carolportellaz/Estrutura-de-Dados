import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int escolha;
        int cot = 1;
        Fila fila = new Fila();
        int cot2 = 0;
        int [] vet_r = new int[50];

        System.out.println("Informe a qtd de cartas");
        escolha = teclado.nextInt();
        cot = 0;
        cot2 = escolha;

        while(cot < 0){
            try {
                System.out.println(fila.addP(cot));
                cot++;
            } 
            
            catch (Exception e) {
                System.out.println("Ocorreu o seguinte erro " + e.getMessage());
            }
        }

        //fila.imprimir();

        while(cot2 != 1){
            cot2--;
            fila.remover();
        }

        vet_r = fila.imprimir_r();
        System.out.println("Os valores são ");

        for(int i = 0; i < vet_r.length; i++){
            if(vet_r[i] != 0){
                System.out.print(vet_r[i] + " | ");
            }
        }



        teclado.close();
    }
}