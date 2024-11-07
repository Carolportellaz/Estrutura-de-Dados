public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        try {
            vetor.adiciona(3);
            vetor.adiciona(4);
            vetor.adiciona(5);


            Contato c1 = new Contato("Contato 1", "123-111", "contato1@email.com"  );
            Contato c2 = new Contato("Contato 2", "123-222", "contato2@email.com"  );
            Contato c3 = new Contato("Contato 3", "123-333", "contato3@email.com"  );

            Contato c4 = new Contato("Contato 4", "123-444", "contato4@email.com"  );


            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);

            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);

            int posicao = vetor.busca(c4);
            if(posicao > -1){
                System.out.println("Elemento existe no vetor");
            }

            else{
                System.out.println("Elemento não existe no vetor");
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
