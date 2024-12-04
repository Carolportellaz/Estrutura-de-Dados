// A Lista terá os elementos e os métodos //
public class Lista{
    public No cabeca = new No();
    public No cauda = cabeca;
    protected int tamanho = 0;

    public void adicionarI(Cliente c) throws Exception{
        No elemento =new No(c, null, null);
        if(tamanho == 0){
            System.out.println("Vazio");
            this.cabeca.proximo = elemento;
            elemento.anterior = cabeca;
            elemento.proximo = null;
            this.cauda = elemento;
            tamanho++;
            System.out.println("A cabeça é " + this.cabeca.proximo.elemento.getCodigo());
        }

        else{
            System.out.println("O tamanho no else é:" + this.tamanho);
            if(cabeca.proximo ==  null){
                System.out.println("CABEÇA TA NULA!");
            }
            System.out.println("A cabeça é " + this.cabeca.proximo);

            No elemento_atual = this.cabeca.proximo;
            System.out.println("teste 1");

            System.out.println("A cabeça é " + this.cabeca.proximo.elemento.getCodigo());
            System.out.println("teste 2");

            // Preciso verificar se não é null se não dá erro //
            // CRESCENTE //
            
            for(int i = 0; i < tamanho; i++){
                //Inserie no inicio
                if(c.getCodigo() < elemento_atual.elemento.getCodigo() && i == 0){
                    System.out.println("Inserindo no início");
                    elemento.proximo = elemento_atual;
                    elemento.anterior = cabeca;
                    elemento_atual.anterior = elemento;
                    cabeca.proximo = elemento;
                    tamanho++;
                    break;
                } 
                //Insere no meio
                if(elemento_atual.elemento.getCodigo() < c.getCodigo() && i < tamanho - 1 && i != tamanho - 1 && i != 0){
                    insereMeio(elemento_atual, elemento);
                    tamanho++;
                    break;
                }

                if (elemento_atual.elemento.getCodigo() < c.getCodigo() && i == tamanho - 1){
                    //Insere no fim
                    System.out.println("Inserindo no final");
                    elemento.anterior = cauda;
                    elemento.proximo = null;
                    cauda = elemento;
                    cauda.anterior.proximo = elemento;
                    tamanho++;
                    break;
                }
                elemento_atual = elemento_atual.proximo;
            }

        }

   
    }

    public void imprimir(){
        System.out.println("Os clientes são: ");

        No quebra_galho = cabeca.proximo;

        for(int i = 0; i < tamanho; i++){
            System.out.println(quebra_galho.elemento.getCodigo() + " | " + quebra_galho.elemento.getNome() + " | " + quebra_galho.elemento.getTelefone());
            quebra_galho = quebra_galho.proximo;
        }
    }

    public void insereMeio(No elemento_atual, No novo_elemento){
        System.out.println("Inserindo no meio");
        No temp_no = elemento_atual.proximo;
        elemento_atual.proximo = novo_elemento;
        novo_elemento.anterior = elemento_atual;
        novo_elemento.proximo = temp_no;
        temp_no.anterior = novo_elemento;
    }
}
