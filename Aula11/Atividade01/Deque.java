public class Deque <T> {
    NoDeque<T> cabeca = new NoDeque<>();
    public int tamanho = 0;
    NoDeque<T> temp_cabeca = cabeca;


    public void addI(T nome){
        // Criando o elemento //
        NoDeque<T> novo_elemento = new NoDeque<>();
        novo_elemento.setInfo(nome);

        if(tamanho == 0){
            cabeca.setProximo(novo_elemento);
            cabeca.setAnterior(novo_elemento);
            novo_elemento.setAnterior(cabeca);
        }

        else{
            NoDeque<T> quebra_galho = cabeca.getProximo();
            cabeca.setProximo(novo_elemento);
            novo_elemento.setProximo(quebra_galho);
            quebra_galho.setAnterior(novo_elemento);
            cabeca.setAnterior(quebra_galho);
        }

        tamanho++;
    }

    public T imprimir() throws Exception{
        if(isEmpty() == true){
            throw new Exception("Lista vazia");
        }

        NoDeque<T> temporaria = cabeca.getProximo();

        temp_cabeca.setProximo(temp_cabeca.getProximo().getProximo());
        tamanho--;

        return temporaria.getInfo();
    }

    public T removeI() throws Exception{
        if(isEmpty() == true){
            throw new Exception("Lista vazia");
        }

        NoDeque<T> temporaria = cabeca.getProximo();

        cabeca.setProximo(cabeca.getProximo().getProximo());
        tamanho--;


        return temporaria.getInfo();
    }

    public boolean isEmpty(){
        if(tamanho == 0){
            return true;
        }

        else{
            return false;
        }
    }

    public void addF(T nome){
        NoDeque<T> novo_elemento = new NoDeque<>();
        novo_elemento.setInfo(nome);

        if(isEmpty() == true){
            cabeca.setProximo(novo_elemento);
            cabeca.setAnterior(novo_elemento);
        }

        else{
            NoDeque<T> temporaria = cabeca.getAnterior();
            cabeca.setAnterior(novo_elemento);
            novo_elemento.setAnterior(temporaria);
            temporaria.setProximo(novo_elemento);
            
        }

        tamanho++;
    }

    public T removeF() throws Exception{
        if(tamanho == 0){
            throw new Exception("Lista vazia");
        }

        NoDeque<T> removido = cabeca.getAnterior();

        if(tamanho == 1){
            cabeca.setAnterior(null);
            cabeca.setProximo(null);
        }

        cabeca.setAnterior(cabeca.getAnterior().getAnterior());
        

        tamanho--;



        return removido.getInfo();
    }
    
}
