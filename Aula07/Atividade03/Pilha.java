public class Pilha {
    No topo = new No();
    int iteracao_entrada = 0;
    int iteracao_saida = 0;
    int iteracao_IR;
    int iteracao_pilha = 0;
    int tamanho = 0;
    String [] vetor_IR; 
    public boolean add(String [] entrada, String [] saida) throws Exception{
        vetor_IR = new String [entrada.length * 2];
        // Adiciona na pilha //
        while((iteracao_entrada < entrada.length) && (iteracao_saida < saida.length)){
            // Verifica se entrada é igual a saída //
            if(entrada[iteracao_entrada] != saida[iteracao_saida]){
                push(entrada[iteracao_entrada]);
            }

            // Se for igual empilha e desempilha // 
            if(entrada[iteracao_entrada].equals(saida[iteracao_saida])){
                push(entrada[iteracao_entrada]);
                pop();
                iteracao_entrada++;
            }

            iteracao_saida++;
        }

        No quebra_galho = topo.proximo;
        iteracao_entrada = 0;

        System.out.println("Os valores são: ");
        for(int i =0; i < entrada.length; i++){
            System.out.println(entrada[i]);
        }

        System.out.println("Os valores do q são: ");
        for(int i =0; i < entrada.length; i++){
            System.out.println(quebra_galho.elemento);
        }

        // Verifica com a pilha //
        while(quebra_galho.proximo != null){
            if(entrada[iteracao_entrada] == quebra_galho.elemento){
                System.out.println("Os valore" + entrada[iteracao_entrada] + " + " + quebra_galho.elemento);
                pop();
                quebra_galho = quebra_galho.proximo;
                tamanho--;
            }

            else{
                iteracao_entrada++;

            }
        }

        if(tamanho == 0){
            return true;
        }

        else{
            return false;
        }
    }

    public boolean isVazia() throws Exception{
        System.out.println("O tamanho é " + tamanho);
        if(tamanho == 0){
            return true;
        }

        else{
            return false;
        }
    }

    public void push(String letra) throws Exception{
        No novo_elemento = new No(null, letra);

        if(tamanho == 0){
            topo.proximo = novo_elemento;
        }

        else{
            // Se já tiver letra //
            No quebra_galho = topo.proximo;
            topo.proximo = novo_elemento;
            novo_elemento.proximo = quebra_galho;
        }

        vetor_IR[iteracao_IR] = "I";

        tamanho++;
    }

    public void pop() throws Exception{
        topo.proximo = topo.proximo.proximo;
        tamanho--;

        vetor_IR[iteracao_IR] = "R";


    }
}
