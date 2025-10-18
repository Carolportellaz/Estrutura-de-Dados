
public class Pilha {

    int topo = -1;
    String[] minhaPilha = new String[10];
    String elemento_guardado = "";
    String elemento_atual;

    public void push(String elemento) throws Exception {
        if (topo == minhaPilha.length) {
            throw new Exception("Pilha cheia");
        } else {
            topo++;
            minhaPilha[topo] = elemento;
        }
    }

    public String pop() {
        String removido = minhaPilha[topo];
        topo--;

        return removido;
    }

    public int logica(String entrada_Usuario) throws Exception {
        int qtdDiamante = 0;

        for (int i = 0; i < entrada_Usuario.length(); i++) {
            elemento_atual = String.valueOf(entrada_Usuario.charAt(i));

            System.out.println("Elemento atual " + elemento_atual);

            // SE FOR . //
            if (elemento_atual.equals(".")) {
                push(elemento_atual);
                pop();
            } 
            
            // SE FOR A PRIMEIRA VEZ QUE ESTOU RODANDO //
            else {
                if (elemento_guardado.equals("")) {
                    elemento_guardado = elemento_atual;
                } 
                
                else {
                    if (elemento_atual.equals(">") && elemento_guardado.equals("<")) {
                        qtdDiamante++;
                        pop();

                        if (minhaPilha[0] == null) {
                            elemento_guardado = "";
                        } 
                        
                        else {
                            elemento_guardado = minhaPilha[topo];
                        }
                    } 
                    
                    else {
                        push(elemento_atual);
                        elemento_guardado = elemento_atual;
                    }
                }
            }
        }
        
        return qtdDiamante;
    }
}
