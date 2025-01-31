public class NoDeque <T>{
    private NoDeque<T> proximo;
    private NoDeque<T> anterior;
    private T info;

    public void NoDeque(T info){
        this.info = info;
        proximo = null;
        anterior = null;
    }

    public void NoDeque(){
    }

    public NoDeque<T> getProximo(){
        return proximo;
    }

    public void setProximo(NoDeque<T> proximo){
        this.proximo = proximo;
    }

    public NoDeque<T> getAnterior(){
        return anterior;
    }

    public void setAnterior(NoDeque<T> anterior){
        this.anterior = anterior;
    }

    public T getInfo(){
        return info;
    }

    public void setInfo(T info){
        this.info = info;
    }
}
