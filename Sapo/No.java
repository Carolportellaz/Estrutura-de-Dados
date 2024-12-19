public class No{
    int elemento;
    No proximo;
    No anterior;

    public No(No proximo, No anterior, int elemento){
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public No(){

    }

    public No(int elemento){
        this.elemento = elemento;
    }
}