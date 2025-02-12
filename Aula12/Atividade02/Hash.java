import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

@SuppressWarnings("unchecked")
public class Hash {
    int tamanho = 0;
    ArrayList<Time> tabela [];

    public Hash(){
        tabela = (ArrayList<Time> []) new ArrayList[10];
    }

    public int hash(String codigo){
        int h = 0;
        for(int i = 0; i < codigo.length(); i++){
            h = (codigo.charAt(i)) % 10;
        }

        return h;
    }

    public void put(Time t){
        int hash = hash(t.getCodigo());
        ArrayList<Time> times = tabela[hash];

        // Se minha tabela estiver vazia //
        if(times == null){
            times = new ArrayList<Time>();
            times.add(t);
            tabela[hash] = times;
            tamanho++;
        }

        else{
            // Olhar se já não tem na lista
            boolean achei = false;

            for(int i = 0; i < times.size(); i++){
                if(times.get(i).getCodigo().equals(t.getCodigo())){
                    achei = true;
                    break;
                }
            }

            if(achei == false){
                times.add(t);
                tamanho++;
            }
        }

    }  
    
    public ArrayList<Time> [] imprimir(){
        return tabela;
    }


    public ArrayList<Time> [] status(){
        return tabela;
    }
}
