import java.util.Random;

public class Pilha {
    int carta_jog1;
    int tamanho = 0;
    No topo = new No();
    int soma_jog1 = 0;
    int retirada;
    boolean foi_retirada = false;

    public int pilha_jog1() {
        Random gerador = new Random();
        carta_jog1 = gerador.nextInt(10) + 1;

            push(carta_jog1);
            soma_jog1(0,0);
        

        if(soma_jog1 > 21) {
            retirada = pop();
            System.out.println("Carta retirada " + retirada);
            soma_jog1(5, retirada);
            foi_retirada = true;
            return retirada;
        }

        return carta_jog1;


    }

    public int pop(){
        if(topo.proximo == null){

        }

        No quebra_galho = topo.proximo;
        topo.proximo = quebra_galho.proximo;
        tamanho--;

        return quebra_galho.elemento;
    }

    public void push(int carta_jog1){
        No novo_elemento = new No(null, carta_jog1);
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

    public int soma_jog1(int penalidade, int retirada){
        No quebra_galho = topo.proximo;
        if(penalidade != 0){
            soma_jog1 = soma_jog1 - retirada - 5;

            return soma_jog1;
        }

        soma_jog1 = quebra_galho.elemento + soma_jog1;

        
        return soma_jog1;
    }

    public int imp_soma_jog1(){
        return soma_jog1;
    }
    
}
