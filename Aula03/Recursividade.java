public class Recursividade {
    static int [] vet1 = {91, 12, 33, 4};
    static int cot = 0;
    static int ultima1 = vet1.length;
    static int ultima2 = vet1.length;
    static int [] vetIn = new int[10];
    static int numero;

    // 0  1  2  3
    // 91 12 33 4
    // 4 33 12 91 
    
    public static int [] inverter(int cot){
        // 4 -1 = 3 // 
        numero = vet1[ultima2 - 1];

        // i = 3; 3 > 0; i--
        // i = 2
        // i = 1
        for(int i = ultima1 - 1; i > 1; i--){
            // vet[3] = vet[2]
            // vet[2] = vet[1]
            // vet[1] = vet[0]
            vet1[i] = vet1[i - 1];
        }


        // vet[0] = 91
        vet1[cot] = numero;

        ultima2--;
        ultima1--;
        cot++;
        

        if(ultima1 > 0){
            return inverter(cot);
        }

        return vet1;
    }

    public static void main (String []args){
        System.out.println("Os valores invertidos do vetor são: ");
        vetIn = inverter(cot);
        for(int i = 0; i < vet1.length; i++){
            System.out.print(" | " + vet1[i]);
        }
    }
}
