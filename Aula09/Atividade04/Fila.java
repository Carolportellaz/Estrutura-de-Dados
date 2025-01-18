public class Fila {
    int id;
    Processo [] vet_p = new Processo[1000];
    public Processo inserir(String titulo){
        id++;
        Processo novo_p = new Processo(id, titulo);
        
    }
}
