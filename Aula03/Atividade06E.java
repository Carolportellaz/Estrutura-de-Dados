
import java.util.Random;

public class Atividade06E {
    Random gerador = new Random();
    int escolha;
    int p1 = 0;
    int p2 = 0;
    int posicao = 0;
    Integer[] vet3;
    int ultima = 0;
    int valor;

    

    public Integer[] sorteio(Integer[] vet1, Integer[] vet2) throws Exception{
        // DEFINIR O TAMANHO DO VETOR // 
        if(vet1.length > vet2.length){
            vet3 = new Integer[vet1.length];
        }

        else{
            vet3 = new Integer[vet2.length];
        }

        while ((posicao < vet1.length) && (posicao < vet2.length)) {
            // ESCOLHE O NÚMERO //
            escolha = gerador.nextInt(100);
            System.out.println("A escolha foi " + escolha);
                   
            // VERIFICA SE É PAR OU ÍMPAR // 
            if (escolha % 2 == 0) {        
                valor = vet1[p1];   
                p1++;                                        
            }

            else{
                valor = vet2[p2];
                p2++;
            }

            // VERIFICAÇÃO SE TIVER VAZIO //
            if(vet3[0] == null){
                vet3[0] = valor;
            }

            // MUDA O VETOR DE LUGAR //
            else{
                vet3[ultima] = valor;

            } 

            ultima++;
            posicao++;
        }

        return vet3;

    }

    public static void main(String[] args) {
        Atividade06E atividade06e = new Atividade06E();

        Integer [] vet1 = {11, 22, 33, 99};
        Integer [] vet2 = {1, 7, 3, 18};


        try{
            Integer [] vet3 = atividade06e.sorteio(vet1, vet2);
            for(int i = 0; i < vet3.length; i++){
                System.out.println(vet3[i]);
            }

        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
    }

}
