public class Fila{
    int tamanho = 0;
    int inicio = 0;
    int fim = 0;
    // Esse vetor é circular? // 
    Pessoa [] vet_pessoa = new Pessoa[5];
    public void empilhar(Pessoa p) throws Exception{
        if(tamanho > vet_pessoa.length){
            new Exception("Lista cheia");
        }

        else{
            vet_pessoa[fim] = p;
            fim++;

            if(tamanho == fim){
                fim = 0;
            }
        
            tamanho++;
        }  
    }

    public Pessoa [] inverter() throws Exception{
        if(tamanho == 0){
            throw new Exception("Lista vazia ");
        }
        Pessoa [] vet_inverter = new Pessoa[tamanho];
        int idx = vet_pessoa.length - 1;

        for(int i = 0; i < vet_inverter.length; i++){
            vet_inverter[i] = vet_pessoa[idx];
            idx--;
        }

        return vet_inverter;
    }

    public Pessoa desempilhar() throws Exception{
        System.out.println(tamanho);
        if(tamanho == 0){
            throw new Exception("Lista vazia");
        }

        Pessoa p = vet_pessoa[inicio];

        if(tamanho == inicio){
            inicio = 0;
        }

        else{
            inicio--;
        }
        
        tamanho--;

        return p;
    }

    public Pessoa fim (){
        return vet_pessoa[fim - 1];
    }


}