import java.util.Random;

public class Pilha2 {
    int carta_jog2;
    int tamanho = 0;
    No topo = new No();
    int soma_jog2 = 0;
    int retirada;
    boolean foi_retirada = false;

    public int pilha_jog2() {
        Random gerador = new Random();
        carta_jog2 = gerador.nextInt(10) + 1;

            push(carta_jog2);
            soma_jog2(0,0);
        

        if(soma_jog2 > 21) {
            retirada = pop();
            System.out.println("Carta retirada " + retirada);
            soma_jog2(5, retirada);
            foi_retirada = true;
            return retirada;
        }

        return carta_jog2;


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

    public int soma_jog2(int penalidade, int retirada){
        No quebra_galho = topo.proximo;
        if(penalidade != 0){
            soma_jog2 = soma_jog2 - retirada - 5;

            return soma_jog2;
        }

        soma_jog2 = quebra_galho.elemento + soma_jog2;

        
        return soma_jog2;
    }

    public int imp_soma_jog2(){
        return soma_jog2;
    }
    
}
