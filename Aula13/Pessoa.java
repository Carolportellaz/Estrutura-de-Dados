public class Pessoa {
    private int mat;
    private String nome;
    private String curso;

    public Pessoa(int mat, String nome, String curso) {
        this.mat = mat;
        this.nome = nome;
        this.curso = curso;
    }
    
    public int getMat() {
        return mat;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
