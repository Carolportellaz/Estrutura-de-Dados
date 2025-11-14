public class Deque{
    No cabeca = new No();
    No cauda = cabeca;


    public void addI(Cavaleiro c){
        No novo_elemento = new No(null, null, c);

        if(cabeca.proximo == null){
            // LISTA VAZIA //
            cabeca.proximo = novo_elemento;
            cauda = novo_elemento;
        }

        else{
            No quebra_galho = cabeca.proximo;
            cabeca.proximo = novo_elemento;

            novo_elemento.proximo = quebra_galho;
        }
    }

    public void addF(Cavaleiro c){
        No novo_elemento = new No(null, null, c);

        if(cabeca.proximo == null){
            addI(c);
        }

        else{
            cauda.proximo = novo_elemento;
            cauda = novo_elemento;
        }
    }

    public Cavaleiro [] remover(int rodada){
        No quebra_galho = cabeca;
        Cavaleiro [] vet = new Cavaleiro[2];

        while(rodada > 1){
            quebra_galho = quebra_galho.proximo;
            rodada--;
        }

        vet[0] = quebra_galho.proximo.elemento;
        vet[1] = quebra_galho.proximo.proximo.elemento;


        quebra_galho.proximo = quebra_galho.proximo.proximo.proximo;
        

        return vet;
        
    }
}