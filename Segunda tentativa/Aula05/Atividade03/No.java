public class No {
    No proximo;
    No anterior;
    Cidade elemento;

    public No(){
        
    }

    public No(No proximo, No anterior, Cidade elemento){
        this.proximo = proximo;
        this.anterior = anterior;
        this.elemento = elemento;
    }
}
