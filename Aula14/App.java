public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada lst = new ListaEncadeada();
        lst.addInicio(new Pessoa("Elizabeth", 15));
        lst.addInicio(new Pessoa("Roberto Carlos", 78));
        lst.addInicio(new Pessoa("Joana", 16));
        lst.addInicio(new Pessoa("Cerberus", 12));
        lst.addInicio(new Pessoa("Paulo Henrique",39));
        lst.print();
        
        System.out.println();
        System.out.println();
        

        try{
            lst.bubbleSort();
            System.out.println("Valor com BobbleSort");
            lst.print();
        }
            

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
    }
}
