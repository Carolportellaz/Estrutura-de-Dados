import java.util.Scanner;

public class App{
    static ListaDuplamente<Alunos> lista = new ListaDuplamente<>();
    public static void main(String [] args){
        int escolha = 0;
        String nome;
        int mat;
        String curso;
        Scanner teclado = new Scanner(System.in);

        while(escolha != 10){
            System.out.println("Informe a operação desejada: 1.Incluir no início | 2.Incluir no final | 3.Incluir uma posição espefíca | 4.Excluir o primeiro | 5.Excluir o último | 6.Excluir um específico | 7.Achar um elemento | 8.Ordenar de forma crescente | 9.Ordener de forma decrescente | 10.Sair");
            escolha = teclado.nextInt();

            if(escolha == 1){
                System.out.println("Informe o nome do elemento");
                nome = teclado.next();

                System.out.println("Informe a matrícula");
                mat = teclado.nextInt();

                System.out.println("Informe o curso");
                curso = teclado.next();

                Alunos alunos = new Alunos(mat, nome, curso);

                lista.addI(alunos);
                imprimir();
            }

        }

        teclado.close();
    }

    public static void imprimir(){
        Node<Alunos> temp = lista.cabeca;
        while((temp.getProximo().getInfo() != null) && (temp != null)){
            temp = lista.imprimir(temp);
            if(temp != null){
                System.out.println(temp.getInfo().getMat() + " | " + temp.getInfo().getNome() + " | " + temp.getInfo().getCurso());
            }
        }
    }

}