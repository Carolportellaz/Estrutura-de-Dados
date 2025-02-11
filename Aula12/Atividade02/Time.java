public class Time {
    private String codigo;
    private String nome;
    private String ano;
    private String presidente;
    private String tecnico;
    
    public Time(String codigo, String nome, String ano, String presidente, String tecnico) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.presidente = presidente;
        this.tecnico = tecnico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

}
