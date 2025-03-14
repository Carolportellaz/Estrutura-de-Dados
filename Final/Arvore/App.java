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
            Temp t1 = new Temp(7, 1901);
            Temp t2 = new Temp(6, 202);
            Temp t3 = new Temp(9, 2016);
            Temp t4 = new Temp(8, 2029);
            Temp t5 = new Temp(10, 2034);
            Temp t6 = new Temp(12, 256);
            Temp t7 = new Temp(11, 1980);
            Temp t8 = new Temp(20, 1874);

            /*while(escolha != 0){
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
            }*/
    
            arv.inserir(arv.raiz, t1);
            arv.inserir(arv.raiz, t2);
            arv.inserir(arv.raiz, t3);
            arv.inserir(arv.raiz, t4);
            arv.inserir(arv.raiz, t5);
            arv.inserir(arv.raiz, t6);
            arv.inserir(arv.raiz, t7);
            arv.inserir(arv.raiz, t8);
            arv.preOrdem(arv.raiz);

            boolean p = arv.propria(arv.raiz);
            if(p == true){
                System.out.println("A árvore é própria");
            }

            else{
                System.out.println("A árvore não é própria");
            }

            int folhas = arv.count(arv.raiz);

            System.out.println("A quantidade de folhas é " + folhas);

            System.out.println("O vetor ordenado é ");
            Node [] vet_adicionado = new Node[arv.tamanho];

            System.out.println("O tamanho da arvore é " + arv.tamanho);

            System.out.println("O vetor ordenado por grau é");
            arv.adicionar_vet(arv.raiz, vet_adicionado);
            System.out.println("O vetor ordenado por ano é");
            
            Node [] vet_insertion = arv.insertion(vet_adicionado);
            for(int i = 0; i < vet_insertion.length; i++){
                System.out.println(vet_insertion[i].t.getAno());
            }



        }
        
        
        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        teclado.close();
    }
}