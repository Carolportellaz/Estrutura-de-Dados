package Aula03;

public class Atividade05 {
    public static int crescente(int [] vet, int menor, int menorMenor, int cot){
        if(cot > vet.length - 1){
            return 0;
        }

        else{
            for(int i = 0; i < vet.length; i++){
                ///
                if((menor > vet[i]) && (menor > menorMenor)){
                    menor = vet[i];
                }
            }

            System.out.println(menor);
            menorMenor = menor;
            cot++;
            menor = vet[0];

            return crescente(vet, menor, menorMenor, cot);
        }
    }

    public static void main(String[] args) {
        int [] vet = {7, 11, 3, 10};
        crescente(vet, vet[0], -1, 0);

        
    }
}
