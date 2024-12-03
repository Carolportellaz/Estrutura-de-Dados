// A Lista terá os elementos e os métodos //
public class Lista{
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento_entrada;
    private No elemento_atual = cabeca.proximo;
    private int tamanho = 0;
    private int posicao = 0;

    public void adicionarI(Cliente c){
        elemento_entrada = new No(c, null, null);

        if(tamanho == 0){
            cabeca.proximo = elemento_entrada;
            cauda = elemento_entrada;
            tamanho++;


        }

        else{
            for(int j = 0; j < tamanho; j++){
                if(elemento_entrada.c[j]getCodigo() < c.getCodigo())
                c.getCodigo() 
            }

            for(int i = 0; i <= posicao; i++){   
                elemento_atual = elemento_atual.proximo;
                elemento_entrada = elemento_atual;
                elemento_atual = elemento_entrada;
            }
        }



        
    }
}