public class App{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("P1", 1);
        Pessoa p2 = new Pessoa("P2", 2);
        Pessoa p3 = new Pessoa("P3", 3);
        Pessoa p4 = new Pessoa("P4", 4);
        Pessoa p5 = new Pessoa("P5", 5);
        Pessoa p6 = new Pessoa("P6", 6);
        Pessoa p7 = new Pessoa("P7", 7);
        Pessoa p8 = new Pessoa("P8", 8);
        Pessoa p9 = new Pessoa("P9", 9);
        Pessoa p10 = new Pessoa("P10", 10);

        Fila fila = new Fila();

        try{
            fila.enfileirar(p1);
            fila.enfileirar(p2);
            fila.enfileirar(p3);
            fila.enfileirar(p4);
            fila.enfileirar(p5);
            fila.enfileirar(p6);
            fila.enfileirar(p7);
            fila.enfileirar(p8);
            fila.enfileirar(p9);
            fila.enfileirar(p10);

            fila.desinfileirar(p1);
            fila.enfileirar(p1);

            fila.imprimir();

        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }


    }
}