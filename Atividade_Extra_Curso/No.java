public class No{
    No anterior;
    No proximo;
    Candidato elemento;

    public No(Candidato elemento, No anterior,No proximo){
        this.elemento = elemento;
        this.anterior = anterior;
        this.proximo = proximo;
    }

    public No(Candidato elemento){
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }


    public No(){

    }
}