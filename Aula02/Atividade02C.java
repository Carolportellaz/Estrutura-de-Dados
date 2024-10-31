public class Atividade02C {
    static int resultado [] = new int[3];
    // LINEAR // 

    public static int [] func(int vetor[]) throws Exception{
        int m1 = resultado[0];
        int m2 = resultado[1];
        int m3 = resultado[2];

        for(int i = 0; i < vetor.length; i++){
            int nUser = vetor[i]; 
            // SE O MAIOR TIVER NO 1º //
            if(nUser >= m1){
                m3 = m2;
                m2 = m1;
                m1 = nUser;
            }

            else{
                // SE O MAIOR ESTIVER NO 2º //
                if(nUser >= m2){
                    m3 = m2;
                    m2 = nUser;
                }

                else{
                    // SE O MAIOR ESTIVER NO 3º //
                    if(nUser >= m3){
                    m3 = nUser;
                    }
                }
            }
        }

        resultado[0] = m1;
        resultado[1] = m2;
        resultado[2] = m3;

        return resultado;

    }

    public static void main(String[] args) {
        int vetor [] = {300, 20, 1000, 20, 30, 500};

        int resultado[];
        try {
            resultado = func(vetor);
            System.out.println("Os maiores números são " + resultado[0] + ", " + resultado[1] + ", " + resultado[2]);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
