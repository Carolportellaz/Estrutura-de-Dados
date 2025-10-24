public class Lista {
    No cabeca = new No();
    No cauda = new No();

    public void add(Cidade c, String escolha, int posicao){
        No novo_elemento = new No(null, null, c);

        if(cabeca.proximo == null){
            cabeca.proximo = novo_elemento;
            novo_elemento.anterior = cabeca;
            cauda = novo_elemento;
        }

        else{
            if(escolha.equals("INICIO")){
                addI(novo_elemento);
            }
        }
    }

    public void addI(No novo_elemento){
        No quebra_galho = cabeca.proximo;
            
        // ATUALIZANDO O CABEÇA //
        cabeca.proximo = novo_elemento;

        // ATUALIZANDO O ELEMENTO //
        novo_elemento.anterior = cabeca;
        novo_elemento.proximo = quebra_galho;

        // ATUALIZANDO O QUEBRA-GALHO //
        quebra_galho.anterior = novo_elemento;
    }

    public void addF(No novo_elemento){
        cauda.proximo = novo_elemento;
        cauda = novo_elemento;
    }

    public void addP(No novo_elemento, int posicao){
        No quebra_galho = cabeca;

        while(posicao > 0){
            quebra_galho = quebra_galho.proximo;

            posicao--;
        }

        if(quebra_galho.proximo == null){
            
        }
    }
}
