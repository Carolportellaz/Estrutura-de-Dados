public class App {
    static int vet [] = {15, 5, 4, 18, 12, 19, 10, 8, 20};
    static int indice;
    static int retirado;
    static int atual;

    public static void metodo(int vet[]){
        for(int i = 0 ; i < vet.length; i++){
            retirado = vet[i];
            indice = 0;

            for(int j = 0; j < i; j++){
                atual = vet[j];
           
                if(retirado < atual){
                    indice = j;

                    vet[j + 1] = atual;
                }
            }
            vet[indice] = retirado;
        }
    }

    public static void main(String[] args) {
        try {
           metodo(vet);
        } 
        
        catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " | ");
        }
    }
}
    