public class Lista {
    public No cabeca = new No();
    public No cauda = cabeca;
    public int tamanho = 0;
    public int posicao = 0;
    public int posicao2;
    public boolean contem = false;
    No novo_elemento;

    public void add(Cidade c) {
        novo_elemento = new No(c, null, null);

        // Se a lista tá vazia //
        if (tamanho == 0) {
            cabeca.proximo = novo_elemento;
            novo_elemento.anterior = cabeca;
            cauda = novo_elemento;
            tamanho++;
        }

        else {
            No quebra_galho = cauda;

            while ((quebra_galho != cabeca) && (quebra_galho.elemento.getNota() <= novo_elemento.elemento.getNota())) {
                quebra_galho = quebra_galho.anterior;
                posicao++;
            }
           
            // Adicionar no inicio //
            if (quebra_galho == cabeca) {
                if (quebra_galho != null && quebra_galho.elemento != null){
                    if(quebra_galho.elemento.getNota()>novo_elemento.elemento.getNota()){
                        adicionarM(novo_elemento, quebra_galho);
                    }
                }
                    else
                adcionarI(novo_elemento);
                
            }

            else {
                if (quebra_galho == cauda) {
                    adicionarF(novo_elemento);
                }

                else {
                    adicionarM(novo_elemento, quebra_galho);
                }
            }

        }

    }

    public void adcionarI(No novo_elemento) {
        novo_elemento.proximo = cabeca.proximo;

        if (cabeca.proximo != null) {
            cabeca.proximo.anterior = novo_elemento;
        }

        cabeca.proximo = novo_elemento;
        novo_elemento.anterior = cabeca;

        if (cauda == cabeca) {
            cauda = novo_elemento;
        }

        tamanho++;
    }

    public void adicionarF(No novo_elemento) {
        novo_elemento.anterior = cauda;
        cauda.proximo = novo_elemento;
        cauda = novo_elemento;
        tamanho++;
    }

    public void adicionarM(No novo_elemento, No elemento_atual) {
        No quebra_galho = elemento_atual.proximo;
        elemento_atual.proximo = novo_elemento;
        novo_elemento.anterior = elemento_atual;
        novo_elemento.proximo = quebra_galho;

        if (quebra_galho != null) {
            quebra_galho.anterior = novo_elemento;
        }

        tamanho++;
    }

    public void imprimirD() {
        No quebra_galho = cabeca.proximo;
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Todos os valores são: " + quebra_galho.elemento.getNome() + " | "
                    + quebra_galho.elemento.getAtrativos()
                    + "| " + quebra_galho.elemento.getNota() + " | " + quebra_galho.elemento.getPais());

            quebra_galho = quebra_galho.proximo;
        }
    }

    // Próximo //1
    public No proximo(boolean comeco, int iteracao) throws Exception {
        No quebra_galho2 = cabeca.proximo;

        System.out.println(iteracao);
        quebra_galho2 = cabeca.proximo;

        if (comeco == true) {
            quebra_galho2 = cabeca.proximo;
            return cabeca.proximo;
        }

        for (int i = 0; i < iteracao; i++) {
            quebra_galho2 = quebra_galho2.proximo;
        }

        return quebra_galho2;
    }

    // Anterior //1
    public No anterior(boolean comeco2, int iteracao2) throws Exception {
        No quebra_galho2 = cabeca.proximo;

        if (comeco2 == true) {
            return quebra_galho2;
        }
        for (int i = 0; i < iteracao2 - 1; i++) {
            quebra_galho2 = quebra_galho2.proximo;
        }

        return quebra_galho2;
    }


    public void remover2(String pais,String cidade) throws Exception{
        No quebra_galho=cabeca;
        for(int i =0; i <tamanho;i++){
            if(quebra_galho.proximo.elemento.getNome().equals(cidade)&& quebra_galho.proximo.elemento.getPais().equals(pais)){
                if(i==0){
                    if(quebra_galho.proximo==cauda){
                        quebra_galho.proximo=null;
                        cauda=quebra_galho;
                        quebra_galho.anterior=cabeca;
                    }else{
                        try {
                             removeInicio();
                        } catch (Exception e) {
                            // TODO: handle exception
                        }

                    }
                }
                else if(quebra_galho.proximo==cauda){
                    quebra_galho.proximo=null;
                    if(quebra_galho.anterior!=cabeca)
                        quebra_galho.anterior=quebra_galho.anterior.anterior;
                    cauda=quebra_galho;
                }else  
                {
                    quebra_galho.proximo=quebra_galho.proximo.proximo;
                    quebra_galho.proximo.anterior=quebra_galho.anterior;
                    quebra_galho.proximo.proximo=quebra_galho;
                    tamanho--;
                break;
                }
            }else
                 quebra_galho=quebra_galho.proximo;
            System.out.println("dois");
        }
        
    }
    // Remover por nome e país //
    public void remove(String pais, String cidade) throws Exception{
        No quebra_galho = cabeca.proximo;

        for(int i = 0; i < tamanho; i++){
            if(quebra_galho.elemento.getPais().equals(pais) && (quebra_galho.elemento.getNome().equals(cidade))){
                posicao = i;
                contem = true;
                break;
            }
            quebra_galho = quebra_galho.proximo;
        }

        if(contem == false){
            throw new Exception();
        }

        if(contem == true){
            if(posicao == 0){
                System.out.println("Início");
                removeInicio();
            }

            else if(posicao == tamanho-1){
                System.out.println("Fim");
                removeFim();
            }

            else{
                System.out.println("Meio");
                No el = cabeca.proximo;

                for(int i = 1; i < posicao - 1; i++){
                    el = el.proximo;
                }

                el.proximo = el.proximo.proximo;

                if(el.proximo != null){
                    el.proximo.anterior = el;
                }

                tamanho--;
            }
        }

        else{
            System.out.println("Não existe");
        }


    }

    public void removeInicio() throws Exception{
        if (tamanho == 0) {
            throw new Exception("Lista vazia");
        }

        cabeca.proximo = cabeca.proximo.proximo;

        if (cabeca.proximo != null) {
            cabeca.proximo.anterior = cabeca;
        }

        tamanho--;

        if (tamanho == 0) {
            cauda = null;
        }
    }

    public void removeFim() throws Exception {
        if (tamanho == 0) {
            throw new Exception("Lista vazia");
        }

        if (tamanho == -1) {
            removeInicio();
        }

        else {
            No el = cabeca.proximo;
            while (el.proximo != null) {
                el = el.proximo;
            }
            el.anterior.proximo=cauda;
            // Atualiza o último nó //
            if (el.anterior != null) {
                novo_elemento.anterior.proximo = null;


            }
            cauda = el.anterior.anterior;
            tamanho--;
        }

    }
    

}