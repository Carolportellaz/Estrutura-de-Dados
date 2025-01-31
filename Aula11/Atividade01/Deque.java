public class Deque <T> {
    NoDeque<T> cabeca = new NoDeque<>();
    public int tamanho = 0;

    public void addI(T nome){
        // Criando o elemento //
        NoDeque<T> novo_elemento = new NoDeque<>();
        novo_elemento.setInfo(nome);

        if(tamanho == 0){
            cabeca.setProximo(novo_elemento);
            cabeca.setAnterior(null);
        }

        else{
            NoDeque<T> quebra_galho = cabeca.getProximo();
            cabeca.setProximo(novo_elemento);
            novo_elemento.setProximo(quebra_galho);
            cabeca.setAnterior(quebra_galho);
        }

        tamanho++;

        System.out.println("Adicionado no incio");
    }

    public T removeI() throws Exception{
        if(isEmpty() == true){
            throw new Exception("Lista início");
        }

        NoDeque<T> temporaria = cabeca.getProximo();

        cabeca.setProximo(cabeca.getProximo().getProximo());
        System.out.println("Remover no incio");
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
    
}
