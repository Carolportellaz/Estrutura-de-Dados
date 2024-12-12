public class Candidato {
    private int chave;
    private double nota;
    private int [] opcao;

    public Candidato(int chave, double nota, int[] opcao) {
        this.chave = chave;
        this.nota = nota;
        this.opcao = opcao;
    }
    
    public int getChave() {
        return chave;
    }
    public void setChave(int chave) {
        this.chave = chave;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public int[] getOpcao() {
        return opcao;
    }
    public void setOpcao(int[] opcao) {
        this.opcao = opcao;
    }
}
