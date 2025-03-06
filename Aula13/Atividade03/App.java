import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtd;
        int ano;
        double graus;
        Arvore arv = new Arvore();
        int escolha = 1;
        Node maior_valor;
        boolean vet [];
        int cot = 0;

        
        
        try{
            while(escolha != 0){
                System.out.println("Informe o número de anos");
                qtd = teclado.nextInt();
                cot = 0;
                escolha = 1;


                arv = new Arvore();
                while(qtd > 0){
                    System.out.println("Informe o ano");
                    ano = teclado.nextInt();
        
                    System.out.println("Informe a temperatura");
                    graus = teclado.nextDouble();
        
                    Temp p = new Temp(graus, ano);
        
                    arv.inserir(arv.raiz, p);
                    qtd--;
                }
        
                //arv.preOrdem(arv.raiz);
        
                maior_valor = arv.maior(arv.raiz);
        
                System.out.println("Informe a quantidade de consultas");
                qtd = teclado.nextInt();
        
                vet = new boolean [qtd];
        
                while(qtd > 0){
                    System.out.println("Informe o ano que você quer: ");
                    escolha = teclado.nextInt();
        
                    if(maior_valor.t.getAno() == escolha){
                        vet[cot] = true;
                        cot++;
                    }
        
                    else{
                        vet[cot] = false;
                        cot++;
                    }
        
                    qtd--;
                }
                
                for(int i = 0; i < vet.length; i++){
                    if(vet[i] == true){
                        System.out.println("Correto");
                    }
        
                    else{
                        System.out.println("Incorreto");
                    }
                }
            }
        }
        
        
        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        teclado.close();
    }
}