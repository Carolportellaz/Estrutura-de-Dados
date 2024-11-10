import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Atividade03E extends JFrame {
    private JLabel lNm = new JLabel("Nome");
    private JTextField txtNm = new JTextField(10);

    private JLabel lVaga = new JLabel("Vagas");
    private JTextField txtVaga = new JTextField(10);

    private JButton bntInserir = new JButton("Inserir");
    private JButton bntSalvar = new JButton("Salvar");
    private JButton bntExcluir = new JButton("Excluir");
    private JButton bntProx = new JButton("Próximo");
    private JButton bntAnt = new JButton("Anterior");

    private static String[] vetor = new String[10];
    private int ultima = 0;
    private int posicao = 0;

    public Atividade03E() {
        setTitle("Cadastro");
        setLayout(new GridLayout(0, 4));

        add(lNm);
        add(txtNm);
        add(lVaga);
        add(txtVaga);
        add(bntInserir);
        add(bntSalvar);
        add(bntExcluir);
        add(bntProx);
        add(bntAnt);

        try {   
            qtd();
            ver(0);
        } 
        
        catch (Exception e) {
            // TODO: handle exception
        }

        pack();
        setVisible(true);

        bntAnt.addActionListener(new Eventos());
        bntProx.addActionListener(new Eventos());
        bntInserir.addActionListener(new Eventos());
        bntSalvar.addActionListener(new Eventos());
        bntExcluir.addActionListener(new Eventos());


    }

    public void desativado(boolean f, boolean v) {
        txtNm.setEnabled(f);
        txtVaga.setEnabled(f);
        bntAnt.setEnabled(v);
        bntProx.setEnabled(v);
        bntExcluir.setEnabled(v);
        bntInserir.setEnabled(v);
        bntSalvar.setEnabled(f);

    }

    public void ativado(boolean f, boolean v) {
        txtNm.setEnabled(v);
        txtVaga.setEnabled(v);
        bntAnt.setEnabled(f);
        bntProx.setEnabled(f);
        bntExcluir.setEnabled(f);
        bntInserir.setEnabled(f);
        bntSalvar.setEnabled(v);

    }

    public void salvar(String n) {
        try {
            if (posicao == 0) {
                vetor[0] = n;
                ultima++;
                posicao++;
            }

            else {
                if (ultima < vetor.length) {
                    vetor[ultima] = n;
                    ultima++;
                    posicao++;
                }

                else {
                    JOptionPane.showMessageDialog(null, "Não há mais vagas disponíveis");
                }
            }

            ver(posicao);
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu o seguinte erro ao tentar inserir um novo local " + e.getMessage());
        }

    }

    public void inserir() {
        txtNm.setText("");
        ativado(false, true);

    }

    public void apagar(int posicao){
        try {
            System.out.println("Atual posição" + posicao);
            System.out.println("Ultima posição " + ultima);

            if(vetor[0] != null){    
                for(int i = posicao; i < ultima; i++){
                    vetor[i - 1] = vetor[i];
                }
    
                vetor[ultima - 1] = null;

                ultima--;

                ver(posicao);
            }
    
            else{
                JOptionPane.showMessageDialog(null, "Não há nomes cadastrados");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro ao tentar excluir o elemento " + e.getMessage());

        }       
        
    }

    public void ver(int posicao) throws Exception {

        System.out.println("Os valores do vetor é ");

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        desativado(false, true);
        if (posicao > 0) {
            txtNm.setText(String.valueOf(vetor[posicao - 1]));
            qtd();
        }
    }

    public void qtd() throws Exception {
        txtVaga.setText(String.valueOf(vetor.length - ultima));
    }

    private class Eventos implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == bntAnt) {
                if (posicao != 1) {
                    try {
                        posicao--;
                        ver(posicao);
                    }

                    catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Ocorreu o seguinte erro ao tentar exibir a posição anterior " + e.getMessage());
                    }
                }
            }

            if (event.getSource() == bntProx) {
                if (posicao != ultima) {
                    try {
                        posicao++;
                        ver(posicao);
                    }

                    catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Ocorreu o seguinte erro ao tentar exibir a próxima posição " + e.getMessage());
                    }
                }
            }

            if (event.getSource() == bntSalvar) {
                salvar(txtNm.getText());
            }

            if (event.getSource() == bntInserir) {
                inserir();
            }

            if (event.getSource() == bntExcluir) {
                apagar(posicao);
            }

        }
    }

    public static void main(String[] args) {
        try {
            Atividade03E atividade03e = new Atividade03E();
            atividade03e.ver(0);
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro " + e.getMessage());
        }
    }
}
