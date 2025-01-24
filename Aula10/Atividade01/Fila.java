public class Fila <Generico extends FilaBase>{
    int tamanho_a;
    int tamanho_b;
    Generico cabeca_a;
    Generico cauda_a;

    public void enfileirar_q(Generico elemento){

    }

    public void verfica(){
        if(tamanho_a > tamanho_b){
            enfileirar_b();
        }

        if(tamanho_a < tamanho_b){
            enfileirar_a();
        }

        else{
            // Lembrar de tirar isso quando for enviar //
            System.out.println("Tamanhos iguais");
        }
    }

    public void enfileirar_a(){
        if(tamanho_a == 0){
            
        }
    }

    public void enfileirar_b(){

    }
}
