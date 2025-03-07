public class Selection {
    Animal vet_animal [] = new Animal[10];
    int cot = 0;
    int inicio = 0;

    public void add(Animal a1){
        vet_animal[cot] = a1;
        cot++;
    }

    public void imprimir(){
        for(int i = 0; i < vet_animal.length; i++){
            if(vet_animal[i] == null){
                break;
            }

            else{
                System.out.println(vet_animal[i].getCodigo() + " | " + vet_animal[i].getNome());
            }
        }
    }

    public void selection(){
        boolean trocar = true;
        while(trocar == true){
            trocar = false;
            // Procurando o maior valor //
            for(int i = inicio; i < vet_animal.length; i++){
                if(vet_animal[inicio] != null && vet_animal[i] != null){
                    if(vet_animal[inicio].getCodigo() > vet_animal[i].getCodigo()){
                        Animal valor1 = vet_animal[inicio];
                        Animal valor2 = vet_animal[i];
    
                        vet_animal[inicio] = valor2;
                        vet_animal[i] = valor1;
                        trocar = true;
                    }
                }
                
            }

            inicio++;
        }
    }
}
