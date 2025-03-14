public class Node <T> {
    private Node <T> anterior;
    private Node <T> proximo;
    private T info;

    public Node(Node<T> proximo, Node<T> anterior, T info){
        this.anterior = anterior;
        this.proximo = proximo;
        this.info = info;
    }
    
    public Node(){

    }

    public Node(T info){
        this.info = info;
        this.anterior = null;
        this.proximo = null;
    }

    public Node<T> getAnterior(){
        return anterior;
    }

    public Node<T> getProximo(){
        return proximo;
    }

    public T getInfo(){
        return info;
    }

    public void setAnterior(Node<T> anterior){
        this.anterior = anterior;
    }

    public void setProximo(Node<T> proximo){
        this.proximo = proximo;
    }

    public void setInfo(T info){
        this.info = info;
    }

}
