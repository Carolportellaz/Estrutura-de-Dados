import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        String escolha = "";
        Scanner teclado = new Scanner(System.in);
        String entrada = "";

        Fila filaLeste = new Fila();
        Fila filaOeste = new Fila();
        Fila filaSul = new Fila();
        Fila filaNorte = new Fila();
        Fila filaRes = new Fila();

        String aronave = "";

        while(entrada != "0"){
            try{
                entrada = teclado.nextLine();

                if(entrada.equals("-1")){
                    aronave = "O";
                }

                if(entrada.equals("-3")){
                    aronave = "N";
                }

                if(entrada.equals("-2")){
                    aronave = "S";
                }

                if(entrada.equals("-4")){
                    aronave = "L";
                }

                else{
                    if(entrada.equals("0")){
                        break;
                    }
                    if(aronave.equals("O")){
                        filaOeste.enfileirar(entrada);
                    }

                    // NORTE //
                    if(aronave.equals("N")){
                        filaNorte.enfileirar(entrada);
                    }

                    // SUL //
                    if(aronave.equals("S")){
                        filaSul.enfileirar(entrada);
                    }

                    // LESTE
                        if(aronave.equals("L")){
                        filaLeste.enfileirar(entrada);
                    }
                }
            }

            catch(Exception e){

            }

        }

        try{
            while(filaLeste.tamanho > 0 || filaNorte.tamanho > 0 || filaOeste.tamanho > 0 || filaSul.tamanho > 0 ){
                String oeste = filaOeste.desenfileirar();
                String norte = filaNorte.desenfileirar();
                String sul = filaSul.desenfileirar();
                String leste = filaLeste.desenfileirar();

                if(oeste != null){
                    System.out.println(oeste);
                }

                if(norte != null){
                    System.out.println(norte);
                }

                if(sul != null){
                    System.out.println(sul);
                }

                if(leste != null){
                    System.out.println(leste);
                }
            }
        }
        
        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }

    }
}