public class AtividadeE05 {

    public void crescente(Integer[] vetor) {
        
        boolean[] usados = new boolean[vetor.length];

        System.out.println("O vetor em ordem crescente é:");
        for (int i = 0; i < vetor.length; i++) {
            int idxMenor = -1;
            for (int j = 0; j < vetor.length; j++) {
                if (!usados[j] && (idxMenor == -1 || vetor[j] < vetor[idxMenor])) {
                    idxMenor = j;
                }
            }
            usados[idxMenor] = true;
            System.out.print(vetor[idxMenor] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AtividadeE05 atividadeE05 = new AtividadeE05();
        Integer[] vetor = {22, 5, 6, 11, 9};
        atividadeE05.crescente(vetor);
    }
}

