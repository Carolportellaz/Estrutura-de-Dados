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

            System.out.println("O valor de hash é " + hash);

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

    // Contém erro//
    public Livro remove(String chave){
        int hash = hash(chave);
        boolean contem = false;
        Livro livro = new Livro(); 

        for(int i = 0; i < tabela.length; i++){
            livro = tabela[hash];

            if(livro.getISBN().equals(chave)){
                contem = true;
                break;
            }
        }

        if(contem == true){
            tabela[hash] = null;
            return livro;
        }

        else{
            // Dando o salto e procurando
            int salto = 0;
            for(salto = 0; salto < tabela.length; salto++){
                if(tabela[salto].getISBN().equals(chave)){
                    contem = true;
                    break;
                }
            }

            if(contem == true){
                livro = tabela[salto];
                tabela[salto] = null;
                return livro;
            }
        }

        return null;
    }


    public Livro [] imprimir(){
        return tabela;
    }
}
