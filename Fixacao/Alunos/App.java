import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int escolha = 1;
        int mat;
        String nome;
        String curso;
        Pilha pilha = new Pilha();

        try{    
            while(escolha != 0){
                System.out.println("Informe a operacao: ");
                escolha = teclado.nextInt();
    
                switch(escolha){
                    case 1: 
                        System.out.println("Informe a matrícula: ");
                        mat = teclado.nextInt();
                
                        System.out.println("Informe o nome: ");
                        nome = teclado.next();
    
                        System.out.println("Informe o curso");
                        curso = teclado.next();
    
                        pilha.push(mat, nome, curso);
                        break;
    
    
                    case 2: 
                        pilha.pop();
                        break;
    
                    case 3: 
                        System.out.println( "O topo é " + pilha.topo());
                        break;
                    
                    case 4:
                        int iteracao = 0;
    
                        while(iteracao < pilha.tamanho){
                            System.out.println(pilha.imprimir(iteracao));
                            iteracao++;
    
                        }
    
                        break;
    
                }
    
                
            }
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
        
    }
}
