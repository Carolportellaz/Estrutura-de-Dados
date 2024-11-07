public class Aula04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento2");
            vetor.adiciona("elemento3");

            System.out.println(vetor.toString());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
