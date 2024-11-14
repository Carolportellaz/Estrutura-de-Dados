public class AtividadeE05 {
    int cot = 0;
    int ultima;
    int inicio;
    int n1;
    int idxMenor = 0;

    public void crescente(Integer[] vetor) {
        System.out.println("O novo vetor é ");
        for (int j = 0; j < vetor.length; j++) {
            n1 = vetor[j];

            for (int i = j + 1; i < vetor.length; i++) {
                if (vetor[j] > vetor[i] && n1 > idxMenor) {
                    idxMenor = i;
                }

                if ((vetor[j] < vetor[i]) || (n1 < idxMenor)) {
                    idxMenor = j;
                }
            }

            System.out.println(vetor[idxMenor]);

        }

    }

    public static void main(String[] args) {
        AtividadeE05 atividadeE05 = new AtividadeE05();
        Integer[] vetor = { 22, 5, 6, 11, 9 };
        atividadeE05.crescente(vetor);
    }
}
