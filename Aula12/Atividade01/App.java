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
        ht.putAberto(new Livro("958-0-7234-2609-4","Recomeço","Lobão",1200));
        

        // Removendo
        try{
            System.out.println("Removendo");
            removido = ht.remove("958-0-7234-2609-4");
            System.out.println("O livro " + removido.getTitulo() + " foi removido");
        }
        
        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        // Imprimindo
        try{
            vet_livros = ht.imprimir();

            for(int i = 0; i < ht.tamanho; i++){
                System.out.println(vet_livros[i].getISBN() + " | " + vet_livros[i].getTitulo() + " | " + vet_livros[i].getAutor() + " | " + vet_livros[i].getPreco());
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

    }
}