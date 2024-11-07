public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento2");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
