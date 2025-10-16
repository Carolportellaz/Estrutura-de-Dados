public class Pilha {
    int cabeca = 0;
    int cabecaRo = 0;
    int cabecaAf = 0;
    int cabecaAna = 0;

    Processo [] pilha = new Processo[10];
    Processo [] pilhaRo = new Processo[10];
    Processo [] pilhaAf = new Processo[10];
    Processo [] pilhaAna = new Processo[10];



    public void push(Processo p, Processo [] pilha, int cabeca) throws Exception{
        if(cabeca == pilha.length){
            throw new Exception("Pilha cheia!");
        }

        else{
            if(pilha[0] == null){
                pilha[cabeca] = p;
            }

            else{
                cabeca++;
                pilha[cabeca] = p;
            }
        }
    }

    public void organiza() throws Exception{
        for(int i = cabeca; i > -1; i--){
            Processo p = pilha[i];

            if(p.getResponsavel().equals("Rosemeiry")){
                push(p, pilhaRo, cabecaRo);
            }

            if(p.getResponsavel().equals("Afonso")){
                push(p, pilhaAf, cabecaAf);
            }

            if(p.getResponsavel().equals("Ana")){
                push(p, pilhaAna, cabecaAna);
            }
        }
        
    }

    public Processo pop(){
        Processo removido = pilha[cabeca];
        cabeca--;
        return removido;
    }

    public void imprimir(){
        for(int i = cabeca; i >= 0; i--){
            if(pilha[i] == null){
                break;
            }

            else{
                System.out.println(pilha[i].getCodigo() + " | " + pilha[i].getResponsavel() + " | " + pilha[i].getCliente());
            }
        }
    }
}
