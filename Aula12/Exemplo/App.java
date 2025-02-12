import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        HashTable ht = new HashTable();
        Livro removido = new Livro();
        Livro [] vet_livros;
        Livro livro = new Livro();
        String isbn;

        // Adicionando 
        ht.putAberto(new Livro("978-0-7334-2609-4","A volta","Lobão",1200));
        ht.putAberto(new Livro("378-0-7334-2609-4","A ida","Lobão",1200));
        ht.putAberto(new Livro("978-0-7234-2609-4","Não volto","Lobão",1200));
        ht.putAberto(new Livro("178-0-7234-2609-4","Sentirei saudades","Lobão",1200));
        ht.putAberto(new Livro("278-0-7234-2609-4","Voltei","Lobão",1200));
        ht.putAberto(new Livro("478-0-7234-2609-4","Democracia","Lobão",1200));
        ht.putAberto(new Livro("578-0-7234-2609-4","O grito","Lobão",1200));
        ht.putAberto(new Livro("678-0-7234-2609-4","O silêncio","Lobão",1200));
        ht.putAberto(new Livro("878-0-7234-2609-4","O crime","Lobão",1200));
        ht.putAberto(new Livro("929-0-7234-2609-4","A vingança","Lobão",1200));
        ht.putAberto(new Livro("998-0-7234-2609-4","A vingança II","Lobão",1200));


        // Removendo
        try{
            System.out.println("Removendo");
            removido = ht.remove("978-0-7234-2609-4");
            System.out.println("O livro " + removido.getTitulo() + " foi removido");

            removido = ht.remove("678-0-7234-2609-4");
            System.out.println("O livro " + removido.getTitulo() + " foi removido");

        }
        
        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        // Imprimindo
        try{
            vet_livros = ht.imprimir();

            for(int i = 0; i < vet_livros.length; i++){
                if(vet_livros[i] != null){
                    System.out.println(vet_livros[i].getISBN() + " | " + vet_livros[i].getTitulo() + " | " + vet_livros[i].getAutor() + " | " + vet_livros[i].getPreco());
                }
            }
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        // Procurando 
        System.out.println("Informe o ISBN do livro que você quer encontrar");
        isbn = teclado.next();

        try{
            livro = ht.pesquisa(isbn);

            if(livro == null){
                System.out.println("O livro já foi removido");
            }

            else{
                System.out.println(livro.getISBN() + " | " + livro.getTitulo() + " | " + livro.getAutor() + " | " + livro.getPreco());
            }
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        teclado.close();

    }
}
