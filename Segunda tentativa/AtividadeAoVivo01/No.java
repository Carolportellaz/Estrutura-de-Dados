public class No {
    No proximo;
    No anterior;
    int elemento;
    public No(No proximo, No anterior, int elemento) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.elemento = elemento;
    }
    
    public No(){
        
    }


    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    public No getAnterior() {
        return anterior;
    }
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    public int getElemento() {
        return elemento;
    }
    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
}
