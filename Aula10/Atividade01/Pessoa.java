public class Pessoa extends FilaBase {
    private String nome;
    private String fila;
    Pessoa proximo;

    public Pessoa(String nome, String fila) {
        this.nome = nome;
        this.fila = fila;
        this.proximo = null;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    @Override
    public void setProximo(FilaBase elemento) {
        this.proximo = (Pessoa) elemento; 
    }

    @Override
    public FilaBase getProximo() {
        return this.proximo;
    }
    
}
