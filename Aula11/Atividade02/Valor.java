public class Valor {
    private double valor;
    private double juros;

    public Valor(double valor, double juros) {
        this.valor = valor;
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
