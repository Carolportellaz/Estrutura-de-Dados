public class Cavaleiro {
    private String nome;
    private int qtdPoder;

    public Cavaleiro(String nome, int qtdPoder) {
        this.nome = nome;
        this.qtdPoder = qtdPoder;
    }

    public Cavaleiro(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPoder() {
        return qtdPoder;
    }

    public void setQtdPoder(int qtdPoder) {
        this.qtdPoder = qtdPoder;
    }
}
