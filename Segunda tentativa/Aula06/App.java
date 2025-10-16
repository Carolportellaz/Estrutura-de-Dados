import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Pilha pilhaR = new Pilha();
        Pilha pilhaAf = new Pilha();
        Pilha pilhaAn = new Pilha();

        Processo p1 = new Processo(1, "Rosimeire", "Acme");
        Processo p2 = new Processo(2, "Afonso", "Sansung");
        Processo p3 = new Processo(3, "Rosimeire", "Lenovo");
        Processo p4 = new Processo(4, "Ana", "Lenovo");
        Processo p5 = new Processo(5, "Afonso", "Acme");
        Processo p6 = new Processo(6, "Rosimeire", "Lenovo");

        try{
            pilha.push(p1);
            pilha.push(p2);
            pilha.push(p3);
            pilha.push(p4);
            pilha.push(p5);
            pilha.push(p6);

        }

        catch(Exception e){
            System.out.println(e);
        }

        try{
            // Adicionando nas pilhas //
            for(int i = pilha.cabeca; i > -1; i--){
                Processo processo = pilha.vet[i];

                if(processo.getResponsavel().equals("Rosimeire")){
                    pilhaR.push(processo);
                }

                if(processo.getResponsavel().equals("Afonso")){
                    pilhaAf.push(processo);
                }

                if(processo.getResponsavel().equals("Ana")){
                    pilhaAn.push(processo);
                }
            }
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro ao tentar adicionar nas pilhas " + e.getMessage());
        }
        

        System.out.println("A pilha da Rosimeire é ");
        for(int i = pilhaR.cabeca; i > -1; i--){
            System.out.println(pilhaR.vet[i].getCodigo() + " | " + pilhaR.vet[i].getResponsavel() + " | " + pilhaR.vet[i].getCliente());
        }

        System.out.println("A pilha da Afonse é ");
        for(int i = pilhaAf.cabeca; i > -1; i--){
            System.out.println(pilhaAf.vet[i].getCodigo() + " | " + pilhaAf.vet[i].getResponsavel() + " | " + pilhaAf.vet[i].getCliente());
        }

         System.out.println("A pilha da Ana é ");
        for(int i = pilhaAn.cabeca; i > -1; i--){
            System.out.println(pilhaAn.vet[i].getCodigo() + " | " + pilhaAn.vet[i].getResponsavel() + " | " + pilhaAn.vet[i].getCliente());
        }
    }


    public void organiza() throws Exception{
        
    }
}


// java T < entrada.txt