// A Lista terá os elementos e os métodos //
public class Lista{
    private No cabeca = new No();
    private No elemento = new No();
    private No cauda = cabeca;
    private int tamanho = 0;
    private int posicao = 0;

    public void adicionarI(Cliente c) throws Exception{
        elemento = new No(c, null, null);

        if(tamanho == 0){
            cabeca.proximo = elemento;
            cauda = elemento;
            tamanho++;

        }

        else{
            // CRESCENTE // 
            while(c.getCodigo() > cabeca.proximo.elemento.getCodigo()){
                cabeca.proximo = cabeca.proximo.proximo;
                cabeca.anterior = cabeca.proximo;
            }

            elemento = cabeca.proximo;
            cabeca.proximo.anterior = elemento;

        }
        
    }

    public void imprimir(){
        System.out.println("Os clientes são: ");

        for(int i = 0; i < tamanho; i++){
            System.out.println(cabeca.proximo.elemento.getCodigo() + " | " + cabeca.proximo.elemento.getNome() + " | " + cabeca.proximo.elemento.getTelefone());
        }
    }
}
