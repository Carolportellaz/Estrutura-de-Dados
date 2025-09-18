package Aula02;
public class Exercicio01{
    static int  metade;
    int inicio;
    int fim; 
    static boolean p = true;

    public static Integer contem(int [] vet, int n, int inicio, int fim, int meio){
        if(fim <= inicio){
            if(vet[meio] == n){
                return n;
            }

            else{
                return null;
            }
        }

        // if(meio == 0){
        //     if(vet[meio] == n){
        //         return n;
        //     }

        //     else{
        //         return null;
        //     }
        // }

        if(vet[meio] == n){
            return n;
        }

            
        else{
            if(vet[meio] < n){
                inicio = meio+1;
            }

            else{
                fim = meio-1;
            }
            
            meio = ((fim + inicio) / 2);



            return contem(vet, n, inicio, fim, meio);
        }

    }

    public static void main(String args[]){
        int [] vet = {12,14,15,20,30};

        Integer r = contem(vet, 18, 0, vet.length - 1, vet.length/2);

        if(r == null){
            System.out.println("O número não existe no vetor");
        }

        else{
            System.out.println("O número existe no vetor");
        }


    }
}