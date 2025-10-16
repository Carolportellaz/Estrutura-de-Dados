public class Pilha {
    int cabeca = 0;
    Processo [] vet = new Processo[10];

    public void push(Processo p) throws Exception{
        if(cabeca == vet.length){
            throw new Exception("Pilha cheia!");
        }

        else{
            if(vet[0] == null){
                vet[cabeca] = p;
            }

            else{
                cabeca++;
                vet[cabeca] = p;
            }
        }
    }

    public Processo pop(){
        Processo removido = vet[cabeca];
        cabeca--;
        return removido;
    }

    public void imprimir(){
        for(int i = cabeca; i >= 0; i--){
            if(vet[i] == null){
                break;
            }

            else{
                System.out.println(vet[i].getCodigo() + " | " + vet[i].getResponsavel() + " | " + vet[i].getCliente());
            }
        }
    }
}
