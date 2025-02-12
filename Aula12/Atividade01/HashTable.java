public class HashTable {
    public static final int M = 11;
    private Livro [] tabela;

    public HashTable(){
        tabela = new Livro[M];
    }

    private int hash(String chave){
        int h = 0;
        for(int i = 0; i < chave.length(); ++i){
            h = (31 * h + chave.charAt(i)) % M;
        }

        return h;
    }

    public Livro pesquisa(String ISBN){
        int hash = hash(ISBN);
        int salto;
        int posicao;

        for(salto = 0; salto < tabela.length; salto++){
            posicao = (hash + salto) % tabela.length;

            if(tabela[posicao] == null){
                return null;
            }

            if(tabela[posicao].getISBN().equals(ISBN)){
                return tabela[posicao];
            }
        }

        return null;

    }
    
    public void putAberto(Livro l) throws Exception{
        int hash;
        int salto;


        for(salto = 0; salto < tabela.length; salto++){
            hash = (hash(l.getISBN()) + salto) % tabela.length;


            // Se está livre o s já foi cadastrado 
            if((tabela[hash] == null) || tabela[hash].getISBN().equals(l.getISBN())){
                tabela[hash] = l;
                break;
            }
        }


        if(salto == tabela.length){
            throw new Exception("Não há espaço disponível");
        }
    }

    public Livro remove(String chave){
        int hash = hash(chave);

        // Vê se tá na posição certa sem salto
        if(tabela[hash] != null && tabela[hash].getISBN().equals(chave)){
            Livro livro = tabela[hash];
            tabela[hash] = null;
            return livro;
        }

        else{
            // Se teve salto //
            for(int i = 0; i < tabela.length; i++){
                if(tabela[i] != null && tabela[i].getISBN().equals(chave)){
                    Livro livro = tabela[i];
                    tabela[i] = null;
                    return livro;
                }
            }

            return null;


        }

    }

    public Livro [] imprimir(){
        return tabela;
    }
}
