public class Lista {
    public No cabeca = new No();
    public No cauda = cabeca;
    public int tamanho = 0;
    public int posicao = 0;

    public void add(Cidade c){
        No novo_elemento = new No(c, null, null);

        // Se a lista tá vazia //
        if(tamanho == 0){
            cabeca.proximo = novo_elemento;
            novo_elemento.anterior = cabeca;
            cauda = novo_elemento;
            tamanho++;
        }

        else{
            novo_elemento.proximo = cabeca.proximo;
            cabeca.proximo = novo_elemento;  
            tamanho++;          
        }

    }

    public void imprimirC(){
        No quebra_galho = cabeca.proximo;
        for(int i = 0; i < tamanho; i++){
            System.out.println("Todos os valores são: " + quebra_galho.elemento.getNome() + " | " + quebra_galho.elemento.getAtrativos() 
            + "| " + quebra_galho.elemento.getNota() + " | " + quebra_galho.elemento.getPais());

            quebra_galho = quebra_galho.proximo;
        }
    }

    // Lembrar de colocar próxima e anterior //
    public void imprimirD(int iteracao) throws Exception{
        No quebra_galho = cabeca.proximo;
        No maior = new No();

        int inicio;
        inicio = cabeca.proximo.elemento.getNota();
        maior = quebra_galho;

        int maior2 = cabeca.proximo.elemento.getNota();
        No no_maior = cabeca.proximo;
        No no_incio = cabeca.proximo;


        // Preciso encontrar o maior valor da lista //
        if(iteracao == 1){
            while(no_maior.proximo != null){
                if(no_maior.elemento.getNota() > no_incio.elemento.getNota()){
                    no_incio = no_maior.proximo;
                    no_maior = no_incio;
                }
                no_maior = no_maior.proximo;
            }
        }

        /*if(iteracao == 1){
            System.out.println("O maior é " + maior.elemento.getNota());
            System.out.println("Os valores são: " + maior.elemento.getNome() + " | " + maior.elemento.getNota() + " | " 
            + maior.elemento.getPais() + " | " + maior.elemento.getAtrativos());
        }

        else{
            quebra_galho = cabeca.proximo;
            while (quebra_galho.proximo != null) {
                if(quebra_galho.elemento.getNota() >=  inicio){
                    inicio = quebra_galho.elemento.getNota();
                    maior = quebra_galho;
                }
    
                System.out.println("Os valores são: " + maior.elemento.getNome() + " | " + maior.elemento.getNota() + " | " 
                + maior.elemento.getPais() + " | " + maior.elemento.getAtrativos());
                
                quebra_galho = quebra_galho.proximo;
            }
        }*/
    }

}