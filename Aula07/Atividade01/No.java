public class No {
    No proximo;
    int elemento;

    public No(No proximo, int elemento){
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public No(int elemento){
        this.elemento = elemento;
    }

    public No(){
    }
}
