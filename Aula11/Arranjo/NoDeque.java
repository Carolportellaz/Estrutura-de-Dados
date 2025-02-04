public class NoDeque<T> {
    private NoDeque<T> proximo;
    private NoDeque<T> anterior;
    private T info;

    public NoDeque(T info){
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public NoDeque(){
        this(null);
    }

    public NoDeque<T> getProximo(){
        return proximo;
    }

    public NoDeque<T> getAnterior(){
        return anterior;
    }

    public T getInfo(){
        return info;
    }

    public void setInfo(T info){
        this.info = info;
    }

    public void setProximo(NoDeque<T> proximo){
        this.proximo = proximo;
    }

    public void setAnterior(NoDeque<T> anterior){
        this.anterior = anterior;
    }
}
