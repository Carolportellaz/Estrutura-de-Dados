import java.util.Scanner;
public class Atividade01C{
    // LINEAR //    
    public static int [] comparacao(int vetor[]) throws Exception{
        int maior = vetor[0];
        int menor = vetor[0];
        int [] vet = new int[2];

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] >= maior){
                    maior = vetor[i];
            }
                
            if(vetor[i] <= menor){
                    menor = vetor[i];
            }

        }

        vet [0] = maior;
        vet [1] = menor;

        return vet;
        
    }

    public static void main(String[] args) {
        int [] vetor = {1, 25, 6, 18, -1, 0, -10};
        int[] vet;
        try {
            vet = comparacao(vetor);
            System.out.println("O maior número é " + vet[0]);
            System.out.println("O menor número é " + vet[1]);
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }


            

        }

    }


