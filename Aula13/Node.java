public class Node {
    Pessoa p;
    Node esquerda;
    Node direita;

    public Node(Pessoa p){
        this.p = p;
        this.esquerda = null;
        this.direita = null;
    }
}
