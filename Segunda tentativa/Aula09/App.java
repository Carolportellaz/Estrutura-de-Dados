public class App {
    public static void main (String args[]){
        FilaPilha<Pessoa> pilha = new FilaPilha<>();
        FilaPilha<Pessoa> fila = new FilaPilha<>();

        Pessoa p1 = new Pessoa("A1", 1);
        Pessoa p2 = new Pessoa("A2", 2);
        Pessoa p3 = new Pessoa("A3", 3);
        Pessoa p4 = new Pessoa("A4", 4);
        Pessoa p5 = new Pessoa("A5", 5);

        fila.enfileira(p1);
        fila.enfileira(p2);
        fila.enfileira(p3);
        fila.enfileira(p4);
        fila.enfileira(p5);

        try{
            while(fila.cabeca != null){
                Pessoa p = fila.desenfileira();
                pilha.push(p);
            }

            
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro ao tentar desenfileirar " + e.getMessage());
        }

    }
}
