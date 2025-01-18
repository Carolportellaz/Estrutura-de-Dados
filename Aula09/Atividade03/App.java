import java.util.Scanner;
public class App{
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        int escolha = 0;
        Fila fila = new Fila();
        Integer [] vet_r;
        
        while(escolha != 3){
            System.out.println("Qual operação você deseja fazer: 1.Solicitar senha | 2.Chamar para atendimento | 3.Sair");
            escolha = teclado.nextInt();
            
            switch (escolha) {
                case 1:
                    try {
                        fila.enfilera();
                        vet_r = fila.imprimir();

                        for(int i = fila.inicio; i >= fila.fim; i--){
                            System.out.println(vet_r[i]);
                        }
                    } 
                    
                    catch (Exception e) {
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }    

                    break;
                
                case 2:
                    try{
                        System.out.println("Senha chamada " + fila.chamado());
                        vet_r = fila.imprimir();

                        for(int i = fila.inicio; i >= fila.fim; i--){
                            System.out.println(vet_r[i]);
                        }
                    }

                    catch(Exception e){
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }
            
                default:
                    break;
            }
        }

        teclado.close();
        
    }
}
