// A Lista terá os elementos e os métodos //
public class Lista{
    private No cabeca = new No();
    private No cauda = cabeca;
    int tamanho = 0;

    public void adicionarI(Cliente c) throws Exception{
        No elemento = new No(c, null, null);

        if(tamanho == 0){
            System.out.println("Vazio");
            cabeca.proximo = elemento;
            elemento.anterior = cabeca;
            elemento.proximo = null;
            cauda = elemento;
            tamanho++;


        }

        else{
            No elemento_atual = cabeca.proximo;
            System.out.println("A cabeça é " + cabeca.proximo);
            // Preciso verificar se não é null se não dá erro //
            // CRESCENTE // 
            while( elemento_atual != null && c.getCodigo() > elemento_atual.elemento.getCodigo()){
                // cabeça.próximo.próximo
                elemento_atual = elemento_atual.proximo;
            }

            // Final da lista (dúvida) //
            if(elemento_atual.proximo == null){
                System.out.println("Inserindo no final");
                cauda.proximo = elemento;
                elemento.anterior = cauda;
                cauda = elemento;
            }
            
            // Inicío da lista //
            if(elemento_atual == cabeca.proximo){
                System.out.println("Inserindo no início");
                elemento.proximo = elemento_atual;
                elemento.anterior = cabeca;
                cabeca.proximo = elemento;
            }

            // Meio da lista //
            else{
                System.out.println("Inserindo no meio");
                elemento.proximo = elemento_atual;
                elemento.anterior = elemento_atual.anterior;
                elemento_atual.anterior = elemento;
                elemento_atual.anterior.proximo = elemento;

            }

            tamanho++;


        }

   
    }

    public void imprimir(){
        System.out.println("Os clientes são: ");

        for(int i = 0; i < tamanho; i++){
            System.out.println(cabeca.proximo.elemento.getCodigo() + " | " + cabeca.proximo.elemento.getNome() + " | " + cabeca.proximo.elemento.getTelefone());
            cabeca.proximo = cabeca.proximo.proximo;
        }
    }
}
