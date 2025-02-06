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
        int inicio;
        int tamanho;
        int cot = 0;

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
                
                case 2:
                    System.out.println("Informe o nome: ");
                    nome = teclado.next();
        
                    System.out.println("Informe a idade: ");
                    idade = teclado.nextInt();
                    deque.addF(nome, idade);
                    break;

                case 3:
                    try{
                        System.out.println("O valor " + deque.removerI());
                    }

                    catch(Exception e){
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }
                    break;
                case 5:
                    try{
                        vet = deque.imprimir();
                        inicio = deque.inicio;
                        tamanho = deque.tamanho;
                        cot = 0;


                        if(tamanho == 0){
                            System.out.println("Lista vazia");
                        }

                        else{
                            while(tamanho > 0){
                                if(inicio != vet.length){
                                    System.out.println(vet[inicio].getInfo().getNome() + " | " + vet[inicio].getInfo().getIdade());
                                    inicio--;
                                    tamanho--;
                                }

                                else{
                                    if(cot == 0){
                                        inicio = 0;
                                        System.out.println(vet[inicio].getInfo().getNome() + " | " + vet[inicio].getInfo().getIdade());
                                        cot++;
                                        inicio--;
                                        tamanho--;
                                    }
    
                                    else{
                                        System.out.println(vet[inicio].getInfo().getNome() + " | " + vet[inicio].getInfo().getIdade());
                                        inicio--;
                                        tamanho--;
                                    }
                                }
                            }
                        }
                    }

                    catch(Exception e){
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }
                    
                    break;

                default:
                    break;
            }
        }

        teclado.close();
        
    }
}
