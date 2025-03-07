public class App{
    public static void main (String [] args){
        Selection s = new Selection();

        Animal a1 = new Animal(29, "Toto", "Cachorro");
        Animal a2 = new Animal(72, "Mia", "Gato");
        Animal a3 = new Animal(98, "Antonio", "Cachorro");
        Animal a4 = new Animal(14, "Jessy", "Cachorro");
        Animal a5 = new Animal(19, "Toto", "Gato");
        Animal a6 = new Animal(13, "Mila", "Cachorro");
        Animal a7 = new Animal(129, "Mika", "Gato");
        Animal a8 = new Animal(9, "Marrie", "Cachorro");
        Animal a9 = new Animal(90, "Mary", "Passáro");
        Animal a10 = new Animal(199, "Tomas", "Cachorro");


        s.add(a1);
        s.add(a2);
        s.add(a3);
        s.add(a4);
        s.add(a5);
        s.add(a6);
        s.add(a7);
        s.add(a8);
        s.add(a9);
        s.add(a10);

        s.imprimir();

        System.out.println("Com o selection sort");
        s.selection();
        s.imprimir();

    }
}