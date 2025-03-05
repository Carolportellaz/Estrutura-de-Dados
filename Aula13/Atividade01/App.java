public class App{
    public static void main(String[] args) {
        Arvore arv = new Arvore();
        
        System.out.println("Adicionando os elementos");
        Pessoa p1 = new Pessoa(1, "Marcelo", "SI");
        arv.inserir(arv.raiz, p1);

        Pessoa p2 = new Pessoa(11, "Joyce", "Agronomia");
        arv.inserir(arv.raiz, p2);

        Pessoa p3 = new Pessoa(17, "Flávio", "Agronomia");
        arv.inserir(arv.raiz, p3);

        Pessoa p4 = new Pessoa(0, "Ana", "SI");
        arv.inserir(arv.raiz, p4);

        Pessoa p5 = new Pessoa(21, "Barbara", "Agronomia");
        arv.inserir(arv.raiz, p5);

        Pessoa p6 = new Pessoa(12, "Antonio", "SI");
        arv.inserir(arv.raiz, p6);

        Pessoa p7 = new Pessoa(10, "Pedro", "SI");
        arv.inserir(arv.raiz, p7);

        Pessoa p8 = new Pessoa(19, "Simone", "Agronomia");
        arv.inserir(arv.raiz, p8);

        Pessoa p9 = new Pessoa(123, "Laura", "SI");
        arv.inserir(arv.raiz, p9);

        Pessoa p10 = new Pessoa(122, "Matheus", "SI");
        arv.inserir(arv.raiz, p10);

        System.out.println("Imprimindo em pre-ordem");
        arv.preOrdem(arv.raiz);

        System.out.println("Imprimindo em ordem");
        arv.inOrdem(arv.raiz);

        System.out.println("Imprimindo em pós-ordem");
        arv.posOrdem(arv.raiz);

        try{
            System.out.println("Removendo valor"); 
            Node no_removido = arv.remover(12);
            
            System.out.println("Removendo valor"); 
            no_removido = arv.remover(0);

            System.out.println("Imprimindo em pós-ordem");
            arv.posOrdem(arv.raiz);      
            
            Node maior = arv.maximo(arv.raiz);
            System.out.println("O aluno com a maior matricula é " + maior.p.getMat() + " | " + maior.p.getNome() + " | " + maior.p.getCurso());

            System.out.println("Pesquisando");
            Node no_pesquisa = arv.pesquisa(123, arv.raiz);
        
            if(no_pesquisa != null){
                System.out.println(no_pesquisa.p.getMat() + " | " + no_pesquisa.p.getNome() + " | " + no_pesquisa.p.getCurso());
            }
        }

        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro " + e.getMessage());
        }
    }
}