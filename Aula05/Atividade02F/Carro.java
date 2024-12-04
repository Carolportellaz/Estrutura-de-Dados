public class Carro {
    private String placa;
    private String modelo;
    private String marca;
    private double preco;
    public Carro(String placa, String modelo, String marca, double preco) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }


}
