public class Pilha {
    No topo;
    int tamanho = 0;
    int elemento_numero1;
    int elemento_numero2;
    int soma;
    int [] vet;
    int iteracao = 0;

    public void add(int tamanho_user) throws Exception{
        topo = new No();
        vet = new int[tamanho_user];
        if(tamanho_user == 1){
            push1();
        }

        if(tamanho_user <= 2){
            push1();
            push2();
        }

        else{
                push1();
                push2();
                while (iteracao < tamanho_user - 2) {
                    push();
                    iteracao++;
            }
            
        }
    }

    public int push1() throws Exception{
        No elemento_numero = new No(null, 1);
        topo.proximo = elemento_numero;
        tamanho++;

        return elemento_numero.elemento;

    }

    public int push2() throws Exception{
        No quebra_galho = topo.proximo;
        No elemento_numero = new No(null, 1);
        topo.proximo = elemento_numero;
        elemento_numero.proximo = quebra_galho;
        tamanho++;

        return elemento_numero.elemento;

    }

    public int push() throws Exception{
        elemento_numero1 = topo.proximo.elemento;
        elemento_numero2 = topo.proximo.proximo.elemento;
        soma = elemento_numero1 + elemento_numero2;

        No novo_elemento = new No(null, soma);
        No quebra_galho = topo.proximo;
        topo.proximo = novo_elemento;
        novo_elemento.proximo = quebra_galho;
        tamanho++;

        return novo_elemento.elemento;
    }

    public int [] imprimir() throws Exception{
        No quebra_galho = topo.proximo;
        for(int i = 0; i < tamanho; i++){
            vet[i] = quebra_galho.elemento;

            quebra_galho = quebra_galho.proximo;
        }

        return vet;
    }
}
