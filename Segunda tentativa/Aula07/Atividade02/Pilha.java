public class Pilha{   
    static int cot = 1; 
    static int topo = -1;
    static int [] minhaPilha = new int[6];

    // Testando //
    public static void main(String[] args) {
        int vet [] = {1,3,2,5,4,6};
        boolean r = logica(vet);

        if(r == true){
            System.out.println("Funcionou!");
        }

        else{
            System.out.println("Não funcionou");
        }
    }

    public static boolean logica(int [] vetUsuario){
        for(int i = 0; i < vetUsuario.length; i++){
            int valorUsuario = vetUsuario[i];

            if(valorUsuario == cot){
                push(valorUsuario);
                pop();
                cot++;
            }

            else{
                push(valorUsuario);
            }

        }

        for(int i = topo; i > -1; i--){
            int valorUsuario = minhaPilha[i];
            if(valorUsuario == cot){
                pop();
                cot++;
            }

            else{
                System.out.println("Não funciona");
                return false;
            }
        }

        return true;
    }

    public static void push(int valorUsuario){
        topo++;
        minhaPilha[topo] = valorUsuario;
    }

    public static int pop(){
        int valor_removido = minhaPilha[topo];
        topo--;

        return valor_removido;
    }

}