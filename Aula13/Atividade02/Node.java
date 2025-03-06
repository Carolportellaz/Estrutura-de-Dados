public class Node {
    private int altura;
    private Node direita;
    private Node esquerda;
    public Node(int altura) {
        this.altura = altura;
        this.direita = null;
        this.esquerda = null;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public Node getDireita() {
        return direita;
    }
    public void setDireita(Node direita) {
        this.direita = direita;
    }
    public Node getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }
    
}
