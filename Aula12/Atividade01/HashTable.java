import java.util.ArrayList;
import java.util.Iterator;

public class HashTable {
    public static final int M = 5;
    private Livro [] tabela;
    public int tamanho;

    public HashTable(){
        tabela = new Livro[5];
    }

    private int hash(String chave){
        int h = 0;
        for(int i = 0; i < chave.length(); ++i){
            h = (31 * h + chave.charAt(i)) % M;
        }

        return h;
    }

    public Livro pesquisa(String ISBN){
        boolean contem = false;
        int hash = hash(ISBN);

        for(int i = 0; i < tabela.length; i++){
            if(tabela[i].getISBN().equals(ISBN)){
                contem = true;
                break;
            }
        }

        if(contem == true){
            Livro livro = tabela[hash];
            return livro;
        }

        else{
            return null;
        }
    }
    
    public void putAberto(Livro l) throws Exception{
        int hash;
        int salto;

        for(salto = 0; salto < tabela.length;salto++){
            hash = (hash(l.getISBN()) + salto) % tabela.length;

            // Se está livre o s já foi cadastrado 
            if((tabela[hash] == null) || tabela[hash].getISBN().equals(l.getISBN())){
                tabela[hash] = l;
                break;
            }
        }

        tamanho++;

        if(salto == tabela.length){
            throw new Exception("Não há espaço disponível");
        }
    }

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
            tamanho--;
            return livro;
        }
        return null;
    }


    public Livro [] imprimir(){
        return tabela;
    }
}
