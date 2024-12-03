public class No {
    No proximo;
    No anterior;
    Cliente elemento;

    public No (Cliente elemento, No proximo, No anterior){
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    public No(){
        
    }
}
