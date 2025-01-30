public class Aviao {
    private String nome;
    private int direcao;
    Aviao proximo;

    public Aviao(){

    }

    public Aviao(String nome){
        this.nome = nome;
    }

    public Aviao(String nome, int direcao, Aviao proximo) {
        this.nome = nome;
        this.direcao = direcao;
        this.proximo = proximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }
}
