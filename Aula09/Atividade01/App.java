import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int escolha = 1;
        

        while (escolha != 0) {
            Pessoa [] vet;
            Fila fila = new Fila();
            System.out.println("Informe a operação 1.Inserir | 2.Remover | 3.Furar fila");
            escolha = teclado.nextInt();
            

            switch (escolha) {
                case 1:
                    try{
                        Pessoa p1 = new Pessoa("Clark", 1165);
                        Pessoa p2 = new Pessoa("Laura", 21);
                        Pessoa p3 = new Pessoa("Ana", 20);
                        Pessoa p4 = new Pessoa("Marcelo", 15);
                        Pessoa p5 = new Pessoa("Diego", 20);
                        
                        fila.empilhar(p1);
                        fila.empilhar(p2);
                        fila.empilhar(p3);
                        fila.empilhar(p4);
                        fila.empilhar(p5);
    
                        vet = fila.vet_pessoa;
    
                        for(int i = 0; i < fila.tamanho - 2; i++){
                            System.out.println(vet[i].getNome() + " | " + vet[i].getIdade());
                        }
    
                        Pessoa fim = fila.fim();
                        System.out.println("A última pessoa é " + fim.getNome() + " | " + fim.getIdade());
                    }
    
                    catch(Exception e){
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }
    
                    break;
                
                case 2: 
                    try {
                        System.out.println(fila.desempilhar());
                    } 
                    
                    catch (Exception e) {
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }
    
                default:
                    break;
            }
        }

        
    }
}
