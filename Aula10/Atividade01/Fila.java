public class Fila<T extends FilaBase> {
    int tamanho_a;
    T cabeca_a;
    T cauda_a;

    int tamanho_b;
    T cabeca_b;
    T cauda_b;
    
    int tamanho_q;
    T cabeca_q;
    T cauda_q;

    public void enfileirar_q(T elemento) throws Exception {
        if (tamanho_q != 0) {
            cauda_q.setProximo(elemento);
        }

        else {
            cabeca_q = elemento;
        }

        cauda_q = elemento;
        tamanho_q++;

    }

    @SuppressWarnings("unchecked")
    public T desenfilera() throws Exception {
        if (tamanho_q == 0) {
            throw new Exception("Lista vazia");
        }

        T quebra_galho = cabeca_q;
        cabeca_q = (T) cabeca_q.getProximo();
        tamanho_q--;

        Pessoa parametro = (Pessoa) quebra_galho;

        // Envia para o método de verificação //
        verfica(parametro);

        return quebra_galho;
    }

    public boolean isVazia() {
        if (tamanho_q == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public void verfica(Pessoa elemento) {
        // FILA A //
        if (elemento.getFila().equals("a") || elemento.getFila().equals("A")) {
            enfilera_a(elemento);
        }

        else {
            if (elemento.getFila().equals("b") || (elemento.getFila().equals("B"))) {
                enfilera_b(elemento);
            }

            else {
                if (tamanho_a > tamanho_b) {
                    enfilera_b(elemento);
                }

                if (tamanho_a < tamanho_b) {
                    enfilera_a(elemento);
                }
            }

        }

    }

    @SuppressWarnings("unchecked")
    public void enfilera_a(Pessoa el) {
        T elemento = (T) el;

        if (tamanho_a != 0) {
            cauda_a.setProximo(elemento);
        }

        else {
            cabeca_a = elemento;
        }

        cauda_a = elemento;
        tamanho_a++;

    }

    @SuppressWarnings("unchecked")
    public T desenfilera_a() throws Exception {
        if (tamanho_a == 0) {
            throw new Exception("Lista vazia");
        }

        else {
            T quebra_galho = cabeca_a;
            cabeca_a = (T) cabeca_a.getProximo();
            tamanho_a--;
            return quebra_galho;
        }
    }

    public boolean isVazia_a() {
        if (tamanho_a == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public void enfilera_b(Pessoa el) {
        T elemento = (T) el;

        if(tamanho_b != 0){
            cauda_b.setProximo(elemento);
        }

        else{
            cabeca_b = elemento;
        }

        cauda_b = elemento;
        tamanho_b++;
    }

    @SuppressWarnings("unchecked")
    public T desenfilera_b() throws Exception{
        if(tamanho_b == 0){
            throw new Exception("Lista vazia");
        }

        else{
            T quebra_galho = cabeca_b;
            cabeca_b = (T) cabeca_b.getProximo();
            tamanho_b--;
            return quebra_galho;
        }
    }

    public boolean isVazia_b(){
        if(tamanho_b == 0){
            return true;
        }

        else{
            return false;
        }
    }
}
