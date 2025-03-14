public class ListaDuplamente<T>{
    Node <Alunos> cabeca = new Node<>();
    Node <Alunos> cauda = new Node<>();

    public void addI(Alunos alunos){
        Node <Alunos> novo_elemento = new Node<Alunos>(alunos);

        if(cabeca.getProximo() == null){
            cabeca.setProximo(novo_elemento);
            cauda.setAnterior(novo_elemento);
            novo_elemento.setAnterior(cabeca);
            novo_elemento.setProximo(cauda);
        }

        else{
            Node<Alunos> temp = cabeca.getProximo();
            cabeca.setProximo(novo_elemento);
            novo_elemento.setAnterior(cabeca);
            novo_elemento.setProximo(temp);
            temp.setAnterior(novo_elemento);
        }
    }

    public Node<Alunos> imprimir(Node<Alunos> elemento_atual){
        Node<Alunos> temp = elemento_atual.getProximo();
        return temp;
    }

    public void addF(Alunos alunos){
        

    }
}