import java.util.Scanner;

public class App {
    public static void main (String args[]){
        String titulo;
        Fila fila = new Fila();
        Scanner teclado = new Scanner(System.in);
        int escolha = 1;
        Processo [] resultado = new Processo[10];
        try{
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
                    
                    case 2:
                        try{
                            System.out.println("O processo " + fila.retirar().getId() + " foi retirado");
                        }
    
                        catch(Exception e){
                            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                        }
    
                        break;
                    
                    case 3:
                        try{
                            resultado = fila.imprimir();
                            for(int i = fila.inicio; i > fila.fim; i--){
                                System.out.println(resultado[i - 1].getId() + " | " + resultado[i - 1].getTitulo());
                            }
                        }

                        catch(Exception e){
                            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                        }
                        
                        break;
                
                    case 4:
                        System.out.println("Informe o identificador");
                        int id = teclado.nextInt();
                        Integer idx_p = fila.buscar(id);
                        if(idx_p == null){
                            System.out.println("Processo não encontrado");
                        }

                        else{
                            System.out.println("O processo foi encontrado: " + fila.vet_p[idx_p].getId() + " | " + fila.vet_p[idx_p].getTitulo());
                        }

                        break;
                    
                    case 5:
                        fila.excluir_todos();
                        System.out.println("Arquivos excluídos com sucesso");
                        break;
                        
                    default:
                        break;
                }
            }
            teclado.close();
        
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
    }

}
