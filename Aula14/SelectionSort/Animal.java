public class Animal {
    private int codigo;
    private String nome;
    private String raca;

    public Animal(int codigo, String nome, String raca) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
}
