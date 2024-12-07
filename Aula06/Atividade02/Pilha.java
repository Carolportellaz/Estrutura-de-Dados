public class Pilha {
    String [] pilha_frente = new String[10];
    String [] pilha_tras = new String[10];
    int diamentes = 0;
    String fim = "?";
    int iteracao = 0;
    int iteracao_a = 0;
    int iteracao_b = 0;
    char simbolo;
    int iteracao_pilha = 0;
    int topo1 = -1;
    int topo2 = -1;
    int topo = -1;


    public int verificar(String caractere_entrada) throws Exception{
        iteracao = 0;
        iteracao_a = 0;
        topo = -1;
        topo1 = -1;
        topo2 = -1;
        iteracao_b = 0;
        diamentes = 0;
        while (iteracao < caractere_entrada.length()){
            simbolo = caractere_entrada.charAt(iteracao);

            // Verificacar de o caracter da é igual a qual símbolo //
            // Eu ignoro a areia //
            // Pirmeira verificação //

                if(simbolo ==  '<'){
                    // 1 - < //
                    push(1, "<");
                    
                }
    
                if(simbolo == '>'){
                    push(2, ">");

                }

                iteracao++;

                

        }

        iteracao_a = 0;
                iteracao_b = 0;

        while ((iteracao_a < pilha_frente.length) && (iteracao_b < pilha_tras.length)) {
            

            // Se for diferente dá um pop //
            // Só mexo com a pilha da frente //
            if(pilha_tras[iteracao_a] != pilha_frente[iteracao_b]){
                pop();
                iteracao_a++;
                iteracao_b++;
            }

            else{
                break;
            }
        }

        // Faça a comparação das pilhas se for igual retira da maior //

        return diamentes;
    }

    public String pop() throws Exception{
            if(isVazia()){
                return "a";
            }

            else{
                diamentes++;
                return pilha_frente[topo2--];
            }
            
        
    }

    public void push(int escolha, String valor) throws Exception{
        if((topo1 == 1000) && (topo2 == 1000)){
            throw new Exception("Não ha espaço disponível");
        }

        else{
            if(escolha == 1){
                pilha_tras[++topo1] = valor;
            }

            if(escolha == 2){
                pilha_frente[++topo2] = valor;
            }
        }
    }

    public void imprimir(){
        System.out.println("A pilha da frente é ");
        for(int i = 0; i < pilha_frente.length; i++){
            System.out.println(pilha_frente[i]);

        }

        System.out.println("A pilha de trás é ");
        for(int i = 0; i < pilha_tras.length; i++){
            System.out.println(pilha_tras[i]);

        }
    }

    public boolean isVazia(){
        return topo2 == -1;
    }
}
