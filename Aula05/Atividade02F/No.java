public class No {
    public No proximo;
    public Carro carro;
    public No anterior;

    public No (Carro carro, No proximo, No anterior){
        this.carro = carro;
        this.proximo = proximo;
    }

    public No(){
        this.carro = null;
        this.proximo = null;
        this.anterior = null;

    }

    public No(No elemento){
        this.carro = elemento.carro;
        this.proximo = elemento.proximo;
        this.anterior = elemento.anterior;

    }
}