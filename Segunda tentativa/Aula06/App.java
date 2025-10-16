import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Pilha p = new Pilha();

        Processo p1 = new Processo(1, "Rosemeire", "Acme");
        Processo p2 = new Processo(2, "Afonso", "Sansung");
        Processo p3 = new Processo(3, "Rosimeire", "Lenovo");
        Processo p4 = new Processo(4, "Ana", "Lenovo");
        Processo p5 = new Processo(5, "Afonso", "Acme");
        Processo p6 = new Processo(6, "Rosimeire", "Lenovo");

        try{
            Processo [] vet = new Processo[10];
            p.push(p1, p.pilha, p.cabeca);
            p.push(p2, p.pilha, p.cabeca);
            p.push(p3, p.pilha, p.cabeca);
            p.push(p4, p.pilha, p.cabeca);
            p.push(p5, p.pilha, p.cabeca);
            p.push(p6, p.pilha, p.cabeca);
        }

        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("A pilha da Rosimeire é ");
        for(int i = p.cabecaRo; i > -1; i--){
            System.out.println(p.pilhaRo[i].getCodigo() + " | " + p.pilhaRo[i].getResponsavel() + " | " + p.pilhaRo[i].getCliente());
        }
    }
}


// java T < entrada.txt