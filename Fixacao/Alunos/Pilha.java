public class Pilha {
    No topo = new No();
    int tamanho = 0;

    public void push(int mat, String nome, String curso) throws Exception{
        Alunos a = new Alunos(mat, nome, curso);
        No novo_elemento = new No(null, a);

        if(tamanho == 0){
            topo.proximo = novo_elemento;
        }

        else{
            No quebra_galho = topo.proximo;
            topo.proximo = novo_elemento;
            novo_elemento.proximo = quebra_galho;
        }
    }

    public Alunos pop() throws Exception{
        if(tamanho == 0){
            System.out.println("Lista vazia");
        }

        No quebra_galho = topo.proximo;

        topo.proximo = topo.proximo.proximo;

        return quebra_galho.elemento;
    }

    public Alunos topo() throws Exception{
        return topo.proximo.elemento;
    }

    public Alunos imprimir(int iteracao) throws Exception{
        int iteracao_imp = 0;
        No quebra_galho = topo.proximo;

        while(iteracao > iteracao_imp){
            quebra_galho = quebra_galho.proximo;
            iteracao_imp++;
        }

        return quebra_galho.elemento;


    }
}
