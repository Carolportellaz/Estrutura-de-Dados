import java.util.Random;

public class Pilha {
    int carta_jog1;
    int tamanho;
    No topo;

    public void pilha_jog1() {
        topo = new No();

        Random gerador = new Random();
        carta_jog1 = gerador.nextInt(10);

        push(carta_jog1);
    }

    public void push(int carta_jog1){
        No novo_elemento = new No(carta_jog1);
        if(tamanho == 0){
            topo.proximo = novo_elemento;
            tamanho++;
        }

        else{
            No quebra_galho = topo.proximo;
            topo.proximo = novo_elemento;
            novo_elemento.proximo = quebra_galho;
            tamanho++;
        }
    }

    
}
