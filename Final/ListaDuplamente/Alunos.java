public class Alunos {
    private int mat;
    private String nome;
    private String curso;

    public Alunos(int mat, String nome, String curso ){
        this.mat = mat;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMat(){
        return mat;
    }

    public String getNome(){
        return nome;
    }

    public String getCurso(){
        return curso;
    }

    public void setMat(int mat){
        this.mat = mat;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
}