public class Pilha {
    static int topo = -1;
    static int iteracao_a = 0;
    static int iteracao_b = 0;
    static int[] pilha;

    public boolean verifica(int[] vet_a, int[] vet_b) throws Exception {
        pilha = new int[vet_a.length];
        iteracao_a = 0;
        iteracao_b = 0;
        topo = -1;

        while (iteracao_a < vet_a.length) {

            // Não deixa passar de b //
            if (iteracao_b < vet_b.length) {
                // Verifica o primeiro elemento //
                if (vet_a[iteracao_a] != vet_b[iteracao_b]) {
                    // Empilha //
                    push(vet_b[iteracao_b]);
                }

                
                // Se for igual //
                else {
                    // Primeiro insiro depois removo //
                    push(vet_b[iteracao_b]);
                    imprimir();
                    pop();
                    // Não esquece de incrementar as variáveis //
                    iteracao_a++;
                }

                iteracao_b++;
            }

            if (iteracao_b >= vet_a.length) {
                // Terminou todo o vetor b //
                // Se for igual ao que já tem na pilha//
                iteracao_b = 0;
                while (iteracao_a < vet_a.length) {
                    if (vet_a[iteracao_a] == pilha[topo]) {
                        pop();
                        iteracao_a++;
                    }

                    else {
                        break;
                    }

                }
            }

        }

        imprimir();

        if (isVazia()) {
            return true;
        }

        else {
            return false;
        }

    }

    // Adiciona o objeto no topo da pilha //
    public void push(int valor_b) throws Exception {
        // Não esquece de tratar quando a pilha está cheia //
        if(topo == pilha.length - 1){
            System.out.println("Essa combinação não é possível");
        }
        
        pilha[++topo] = valor_b;
    }

    public int pop() throws Exception {
        if (topo == -1) {
            throw new Exception("Vazio");
        }

        else {
            return pilha[topo--];
        }
    }

    public boolean isVazia() {
        return topo == -1;
    }

    public void imprimir() {
        System.out.println("");
        System.out.println("-----------------------------");
        for (int i = 0; i < pilha.length; i++) {
            System.out.println("Os valores da pilha são " + pilha[i]);
        }
    }

}
