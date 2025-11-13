public class App{
    public static void main(String[] args) {
        Deque deque = new Deque();

        try {
            deque.addI(1);
            deque.addI(0);
        } 
        
        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
    }
}