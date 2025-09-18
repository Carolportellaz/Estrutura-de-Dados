package Aula03;

import java.util.Random;

public class Atividade01 {
    static int  inicio;
    static int fim;
    public static int [] gerar(int tamanho){
        Random gerardor = new Random();

        int [] vet = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            vet[i] = gerardor.nextInt(1000);
        }

        return vet;
    }

    public static int [] impar (int [] vet){
        for(int i = 0; i < vet.length; i++){
            if(vet[i] % 2 == 0){
                inicio = i;

                for(int j = inicio; i < vet.length; i++){
                    vet[j] = vet[j + 1];
                }

                fim--;
            }
        }

        return vet;
    }

    public static void main(String[] args) {
        //int [] vet = gerar(10);

        int [] vetE = {12, 5, 3, 8, 9};

        int [] vet = impar(vetE);

        for(int i = 0; i < fim; i++){
            System.out.println(vet[i]);
        }
    }
}
