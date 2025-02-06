public class Deque <T>{
    double total;
    double valor_parcela;
    double juros;
    int mes = 1;
    int tamanho = 0;
    int tamanho_imp = 0;

    NodeDeque<Valor> cabeca = new NodeDeque<>();
    NodeDeque<Valor> cauda = new NodeDeque<>();
    NodeDeque<Valor> temp_cabeca = cabeca;

    public double calcular(int tempo, double valor){
        valor_parcela = valor / tempo;

        while(tempo != 0){
            juros = valor_parcela*(0.01)*mes;

            System.out.println("O valor da parcela é " + valor_parcela);
            System.out.println("O valor do mes é " + mes);
            System.out.println("O valor do juros é " + juros);
            addF(valor_parcela, juros);
            mes++;
            tempo--;
        }

        return total;
    }

    public void addF(double valor_parcela, double valor_juros){
        NodeDeque<Valor> novo_elemento = new NodeDeque<>();
        Valor novo_valor = new Valor(valor_parcela, valor_juros);
        novo_elemento.setInfo(novo_valor);

        if(tamanho == 0){
            cabeca.setProximo(novo_elemento);
            cauda = novo_elemento;
            novo_elemento.setAnterior(cabeca);
            tamanho++;
            tamanho_imp++;
        }

        else{
            NodeDeque<Valor> temporaria = cauda;

            novo_elemento.setAnterior(temporaria);
            temporaria.setProximo(novo_elemento);
            cauda = novo_elemento;
            tamanho++;
            tamanho_imp++;
        }
    }

    public Valor removeI() throws Exception{
        NodeDeque <Valor> removido = cabeca.getProximo();
        if(tamanho == 0){
            throw new Exception("Lista vazia");
        }

        else{
            cabeca.setProximo(cabeca.getProximo().getProximo());
            tamanho--;
        }

        return removido.getInfo();
    }

    public Valor removeF() throws Exception{
        NodeDeque <Valor> removido = cauda;
        if(tamanho == 0){
            throw new Exception("Lista vazia");
        }

        else{
            cauda = cauda.getAnterior();
            tamanho--;
        }

        return removido.getInfo();
    }


    public Valor imprimir() throws Exception{
        if(isEmpty() == true){
            throw new Exception("Lista vazia");
        }

        NodeDeque<Valor> temporaria = temp_cabeca.getProximo();

        if(temp_cabeca.getProximo().getProximo() != null){
            temp_cabeca.setProximo(temp_cabeca.getProximo().getProximo());
        }

        tamanho_imp--;

        if(tamanho_imp == 0){
            temp_cabeca = cabeca;
        }

        return temporaria.getInfo();
    }

    public boolean isEmpty(){
        if(tamanho == 0){
            return true;
        }

        else{
            return false;
        }
    }
}
