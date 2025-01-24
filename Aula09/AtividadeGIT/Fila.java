public class Fila {
    int [] vet_cartas = new int[51];
    int inicio = 0;
    int fim = 0;
    int [] vet_removidos = new int[51];
    int cot_removidos = 0;
    int tamanho;

    public int addP(int valor) throws Exception{
        vet_cartas[inicio] = valor;
        inicio++;
        tamanho++;
        
        return valor;
    }


    public void remover(){
        if(tamanho != 1){
            vet_removidos[cot_removidos] = vet_cartas[inicio - 1];
            tamanho--;
            cot_removidos++;
            inicio--;
            trocar(inicio);
        } 
    }

    public void trocar(int inicio){
        int carta_trocada = vet_cartas[inicio];
        System.out.println("O valor trocado foi " + vet_cartas[inicio - 1]);


        vet_cartas[inicio] = carta_trocada;
        inicio++;
        
    }

    public int [] imprimir_r(){
        return vet_removidos;
    }

    public int carta_r(){
        return vet_cartas[inicio];
    }

    public void imprimir(){
        for(int i = 0; i < vet_cartas.length; i++){
            System.out.println("Os valores são " + vet_cartas[i]);
        }
    }

    
}
