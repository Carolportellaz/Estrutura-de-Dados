public class No {
    No proximo;
    No anterior;
    Cavaleiro elemento;

    public No(){

    }

    public No(No proximo, No anterior, Cavaleiro elemento) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.elemento = elemento;
    }
}
