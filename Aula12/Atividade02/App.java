import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings("unchecked")

public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int escolha = 1; 
        String nome;
        String codigo;
        String ano;
        String tecnico;
        String presidente;
        Hash hash = new Hash();
        ArrayList<Time> array [];

        array = new ArrayList[10];
        
        while(escolha != 3){
            System.out.println("Informe a operação que deseja realizar: 1.Cadastrar | 2.Concultar | 3.Sair");
            escolha = teclado.nextInt();


            switch(escolha){
                case 1: 
                    System.out.println("Informe o codigo");
                    codigo = teclado.next(); 

                    System.out.println("Informe o nome");
                    nome = teclado.next();

                    System.out.println("Informe o ano de Fundacao");
                    ano = teclado.next();

                    System.out.println("Informe o técnico");
                    tecnico = teclado.next();

                    System.out.println("Informe o presidente");
                    presidente = teclado.next();

                    Time time = new Time(codigo, nome, ano, presidente, tecnico);
                    hash.put(time);

                    break;
                 

                case 2: 
                try{
                    array = hash.imprimir();

                    for(int i = 0; i < hash.tamanho; i++){
                        System.out.println(array[i].get(i).getCodigo() + " | " + array[i].get(i).getNome());
                    }
                }

                catch(Exception e){
                    System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                }
                    

                    break;
                
                case 3:
                    try{
                        hash.status();

                        ArrayList<Time> [] tabela = hash.imprimir();

                        for(int i = 0; i < tabela.length; i++){
                            if(tabela[i] != null){
                                System.out.println(tabela[i].get(i).getCodigo() + " | " + tabela[i].get(i).getNome());
                            }
                        }

                    }
                
                    catch(Exception e){
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }

                    break;
                default:
                    System.out.println("Informe uma opção válida");
            }

        }

    }
}
