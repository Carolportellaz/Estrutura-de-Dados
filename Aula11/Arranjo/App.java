import java.util.Scanner;

public class App{
    @SuppressWarnings("unchecked")

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        int escolha = 1;
        Deque deque = new Deque();
        NoDeque <Pessoa> [] vet = new NoDeque[10];



        while(escolha != 0){
            System.out.println("Informe a operação: 1.Adicionar no início | 2.Adicionar no fim | 3.Remover do início | 4.Remover do fim  | 5.Impirmir");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                try{
                    System.out.println("Informe o nome: ");
                    nome = teclado.next();
        
                    System.out.println("Informe a idade: ");
                    idade = teclado.nextInt();

                    deque.addI(nome, idade);

                    break;
                }

                catch(Exception e){
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }
                    

                case 5:
                    try{
                        vet = deque.imprimir();

                        for(int i = deque.inicio; i >= deque.fim; i--){
                            System.out.println(vet[i].getInfo().getNome() + " | " + vet[i].getInfo().getIdade());
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