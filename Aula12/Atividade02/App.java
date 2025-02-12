import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings("unchecked")

public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int escolha = 1; 
        String nome;
        String codigo = "";
        String ano;
        String tecnico;
        String presidente;
        Hash hash = new Hash();
        boolean correto;
        int verifica_codigo;

        
        while(escolha != 3){
            System.out.println("Informe a operação que deseja realizar: 1.Cadastrar | 2.Concultar | 3.Sair");
            escolha = teclado.nextInt();

            correto = false;

            switch(escolha){
                case 1: 
                    while (correto == false) {
                        System.out.println("Informe o codigo");
                        codigo = teclado.next(); 
                        
                        try{
                            verifica_codigo = Integer.parseInt(codigo);
                            correto = true;
                        }

                        catch(Exception e){
                            System.out.println("Informe um valor válido");
                            correto = false;
                        }
                    }

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
                        hash.status();

                        ArrayList<Time> [] tabela = hash.imprimir();

                        for(int i = 0; i < 10; i++){
                            if(tabela[i] != null){
                                for(int j = 0; j < tabela[i].size(); j++){
                                    if(tabela[i].get(j).getCodigo() != null){
                                        System.out.println(tabela[i].get(j).getCodigo() + " | " + tabela[i].get(j).getNome());
                                    }
                                    
                                }
                            }
                        }

                    }
                
                    catch(Exception e){
                        System.out.println("Ocorreu o seguinte erro " + e.getMessage());
                    }

                    break;
                case 3:
                    System.exit(0);

                default:
                    System.out.println("Informe uma opção válida");
            }

        }

        teclado.close();

    }
}
