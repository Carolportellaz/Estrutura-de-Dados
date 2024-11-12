public class Teste {
    static Integer[] vetor = new Integer[10];
    static boolean contem;
    static boolean verifica = false;
    static int [] vetEscolha = new int[10];
    static int pVet = 0;
    static int soma = 1;

    public static void main(String[] args) {
        vetor[0] = 1;
        vetor[3] = 3;
        vetor[4] = 5;
        vetor[9] = 10;

        System.out.println("Os valores do vetor são: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" | " + vetor[i]);
        }


        for (int i = 0; i < vetor.length; i++) {
            // VERIFICA O PRIMEIRO NULL //

            if (vetor[i] == null) {
                contem = false;
            }

            else{
                contem = true;
            }

            if (contem == verifica) {
                vetEscolha[pVet] = i + soma;
                pVet++;

                if(verifica == true){
                    verifica = false;
                    soma = 1;
                }

                if(verifica == false){
                    verifica = true;
                    soma = 0;
                }
            }
        }

        System.out.println("\nEscolha número entre ");

        for(int i = 0; i < vetEscolha.length; i++){
            System.out.print(" | " + vetEscolha[i]);
        }

    }
}
