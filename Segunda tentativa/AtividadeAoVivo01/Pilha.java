public class Pilha {
    int tamanho;
    No cabeca = new No();

    public void push(int elemento) throws Exception{
        No novo_elemento = new No(null, null, elemento);

        if(cabeca.proximo == null){
            cabeca.proximo = novo_elemento;
        }

        else{
            No quebra_galho = cabeca.proximo;
            cabeca.proximo = novo_elemento;
            novo_elemento.proximo = quebra_galho;
        }
    }

    public int pop() throws Exception{
        if(cabeca.proximo == null){
            throw new Exception("EMPTY");
        }

        No elemento_removido = cabeca.proximo;
        cabeca.proximo = cabeca.proximo.proximo;

        return elemento_removido.elemento;
    }

    public void imprimir(){
        No quebra_galho = cabeca;

        while(quebra_galho.proximo != null){
            quebra_galho = quebra_galho.proximo;
            System.out.println(quebra_galho.elemento);
        }
    }

    public int menor() throws Exception{
        No quebra_galho = cabeca;
        No no_menor = cabeca.proximo;

        if(cabeca.proximo == null){
            throw new Exception("EMPTY");
        }

        while(quebra_galho.proximo != null){
            quebra_galho = quebra_galho.proximo;

            if(no_menor.elemento > quebra_galho.elemento){
                no_menor = quebra_galho;
            }
            
        }

        return no_menor.elemento;
    }
}