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

            // Por que aqui o tamanho não está sendo atualizado 
            // Tipo quando eu rodo o a primeira vez o valor fica igual a zero quando é tamanho++;
            tamanho++;

            System.out.println(vet_pessoa[inicio]);
        }  
    }

    public Pessoa desempilhar() throws Exception{
        System.out.println(tamanho);
        if(tamanho == 0){
            throw new Exception("Lista vazia");
        }

        System.out.println("Início " + vet_pessoa[inicio] );

        Pessoa p = vet_pessoa[inicio];

        if(tamanho == inicio){
            inicio = 0;
        }

        else{
            inicio--;
        }

        return p;
    }

    public Pessoa fim (){
        return vet_pessoa[fim - 1];
    }


}