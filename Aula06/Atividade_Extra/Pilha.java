public class Pilha {
    int top;
    int iteracao_a;
    int iteracao_b;
    String[] pilha;

    public boolean verifica(String[] vet_a, String[] vet_b) throws Exception {
        // Reseta os valores //
        iteracao_a = 0;
        iteracao_b = 0;
        top = -1;
        pilha = new String[vet_a.length];

        while (iteracao_b < vet_b.length) {
            // Verifica todos os valores de b //
            if (iteracao_a < vet_a.length) {
                if (!vet_a[iteracao_a].equals(vet_b[iteracao_b])) {

                    // Vou dar um push para a pilha //
                    push(vet_a[iteracao_a]);                    
                }

                // Se for igual eu coloco na pilha e tiro dela //
                else{
                    push(vet_b[iteracao_b]);
                    imprimir();
                    pop();
                    imprimir();
                    iteracao_a++;
                }

                iteracao_b++;
            }

            // Acabou  o vetor a //
            else{
                // Verfica agora com a pilha //
                if(iteracao_b < vet_b.length){
                    if(vet_a[iteracao_a - 1].equals(pilha[top])){
                        pop();
                        iteracao_a++;
                    }

                    else{
                        break;
                    }
                }
            }   
        }

        if(isVazia()){
            return true;
        }

        else{
            return false;
        }

    }

    public String pop() throws Exception {
        if (isVazia()) {
            throw new Exception("Pilha vazia");
        }

        else {
            System.out.println("I");
            return pilha[top--];
        }
    }

    public void push(String valor_a) throws Exception{
        if(top == pilha.length - 1){
            System.out.println("Essa combinação não é possível");
        }

        else{
            pilha[++top] = valor_a;
            System.out.println("I");
        }
    }

    public boolean isVazia() {
        return top == -1;
    }

    public void imprimir(){
        System.out.println("O valor do top é " + top);
        for(int i = 0; i <= top; i++){
            System.out.println(pilha[i]);
        }
    }
}
