public class Lista {
    private No cabeca = new No();
    private No cauda = cabeca;

    int tamanho = 0;
    int espaco_1 = 0;
    int espaco_2 = 0;
    int espaco_3 = 0;
    int espaco_4 = 0;
    int espaco_5 = 0;
    boolean contem = false;
    boolean ap_rep;
    int [] vet_escolha;
    int posicao = 0;


    public void add(int chave, double nota, int [] opcao) throws Exception{
        vet_escolha = new int[20];
        // Cria o elemento //
        Candidato candidato = new Candidato(chave, nota, opcao);
        No novo_elemento = new No(candidato, null, null);
        int [] opcoes = novo_elemento.elemento.getOpcao();

    
        // Primeiro verifica se a lista está vazia //
        if(cabeca.proximo == null){
            cabeca.proximo = novo_elemento;
            novo_elemento.anterior = cabeca;
            cauda = novo_elemento;
            tamanho++;
        }

        else{
            // Ordena todo mundo por nota primeiro //
            No quebra_galho = cabeca.proximo;
            //ap_rep = verifica_curso(opcoes);

            while((quebra_galho.proximo != null) || (novo_elemento.elemento.getNota() >= quebra_galho.elemento.getNota())){
                if(novo_elemento.elemento.getNota() == quebra_galho.elemento.getNota()){
                    addMeio(quebra_galho.proximo, novo_elemento);
                }

                System.out.println("O quebra galho é " + quebra_galho);
                quebra_galho = quebra_galho.proximo;
            }

            No elemento_atual = quebra_galho;

            // Insere no início //
            if(elemento_atual.anterior == cabeca){

            }

            // Insere no final //
            if(elemento_atual == cauda){

            }

            // Insere no meio //
            else{
                addMeio(elemento_atual, novo_elemento);
            }
        }
    }

    public void addMeio(No elemento_atual, No novo_elemento){
        No quebra_galho = elemento_atual;

    }

    public boolean verifica_curso(int [] opcoes){
        for(int i = 0; i < opcoes.length; i++){
            if((opcoes[i] == 1) && (espaco_1 <= 3)){
                contem = true;
                espaco_1++;
                break;
            }

            else if((opcoes[i] == 2) && (espaco_2 <= 3)){
                contem = true;
                espaco_2++;
                break;
            }

            else if((opcoes[i] == 3) && (espaco_3 <= 3)){
                contem = true;
                espaco_3++;
                break;
            }

            else if((opcoes[i] == 4) && (espaco_4 <= 3)){
                contem = true;
                espaco_4++;
                break;
            }

            else if((opcoes[i] == 5) && (espaco_5 <= 3)){
                contem = true;
                espaco_5++;
                break;
            }

            else{
                contem = false;
            }
        }

        return contem;


    }
}
