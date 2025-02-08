import java.util.ArrayList;
import java.util.Iterator;

public class HashTable {
    public static final int M = 13;
    private ArrayList<Livro>[] tabela;

    public HashTable(){
        // Aqui só está criando o Array?
        tabela = (ArrayList<Livro>[]) new  ArrayList[M];
    }

    // O que esse método faz?
    // Ele gera um valor entre zero e um para que como se fosse um id 
    // A única parte obrigatória é chave.charAt(i) % M
    // Enquanto maior for o os valores da opereção menor será a colisão 
    private int hash(String chave){
        int h = 0;
        // Aqui é só um cálculo aletório que estou fazendo para gerar uma chave?
        for(int i = 0; i < chave.length(); ++i){
            h = (chave.charAt(i)) % M;
        }

        return h;
    }

    public Livro get(String chave){
        int hash = hash(chave);
        ArrayList<Livro> livros = tabela[hash];

        if(livros == null){
            return null;
        }
        
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getISBN().equals(chave)){
                return livros.get(i);
            }
        }

        return null;
    }

    public void put(Livro l){
        int hash = hash(l.getISBN());
        ArrayList<Livro> livros = tabela[hash];

        if(livros == null){
            livros = new ArrayList<Livro>();
            livros.add(l);
            tabela[hash] = livros;
        }

        else{
            // Confere se já existe na lista 
            boolean achei = false;

            for(Livro livro : livros){
                if(livro.getISBN().equals(l.getISBN())){
                    achei = true;
                }
            }

            if(achei == true){
                livros.add(l);
            }
        }
    }

    public Livro remove(String chave){
        int hash = hash(chave);

        // Por que eu uso o this nesse caso?
        // Só implemenntação de código não é obrigatório
        ArrayList<Livro> livros = this.tabela[hash];

        Iterator<Livro> it = livros.iterator();
        Livro atual = null;

        while(it.hasNext()){
            atual = it.next();

            if(atual.getISBN().equals(chave)){
                it.remove();
                return atual;
            }
        }
        return null;
    }

    // Posso fazer essa impressão no back-end?
    // Não para fazer isso no front é só retorna a tabela // 
    public void status(){
        for(int i = 0; i < M; i++){
            if(tabela[i] != null){
                ArrayList<Livro> liv = tabela[i];

                System.out.println("A posição " + i + " possui " + liv.size());
            }

            else{
                System.out.println("A posição " + i + " não possui livros cadastrados");
            }
        }
    }
}
