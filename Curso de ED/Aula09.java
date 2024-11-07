public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        try{
            vetor.adiciona("B");
            vetor.adiciona("C");
            vetor.adiciona("E");
            vetor.adiciona("F");
            vetor.adiciona("G");

            System.out.println(vetor);

            vetor.remove(1);
            System.out.println(vetor);

            System.out.println("Remover o elemento E");
            int posicao = vetor.busca("E");
            if(posicao > -1){
                vetor.remove(posicao);
                System.out.println(vetor);
            }

            else{
                System.out.println("Elemento não existe no vetor");
            }

        }

        catch(Exception e){

        }
        
    }
}
