public class FilaPilha<T extends FilaBase>{
    T cabeca;
    T cauda;

    public void enfileira(T el){
        if(cabeca == null){
            cabeca = el;
            cauda = el;
        }

        else{
            cauda.setProximo(el);
            cauda = el;
        }
    }  

    @SuppressWarnings("unchecked")
    public T desenfileira() throws Exception{
        if(cabeca == null){
            throw new Exception("Fila vazia!");
        }

        T removido = cabeca;

        cabeca = (T) cabeca.getProximo();

        return removido;
    }

    public void push(T el){
        if(cabeca == null){
            cabeca = el;
            cauda = el;
        }

        else{
            el.setProximo(cabeca);
            cabeca = el;
        }
    }

    @SuppressWarnings("unchecked")
    public T pop() throws Exception{
        if(cabeca == null){
            throw new Exception("Fila vazia!");
        }

        T removido = cabeca;

        cabeca = (T) cabeca.getProximo();

        return removido;
    }
}
