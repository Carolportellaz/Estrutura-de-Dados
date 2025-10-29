import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App extends JFrame {
    JLabel lN = new JLabel("Nome");
    JTextField txtN = new JTextField(20);

    JLabel lPais = new JLabel("País");
    JTextField txtPais = new JTextField(20);

    JLabel lAtrat = new JLabel("Principais atrativos");
    JTextField txtAtrat = new JTextField(20);

    JLabel lNota = new JLabel("Nota");
    JTextField txtNota = new JTextField(20);

    JLabel lPos = new JLabel("Posicao");
    JTextField txtPos = new JTextField(20);

    JButton bntAddI = new JButton("AddI");
    JButton bntAddF = new JButton("AddF");
    JButton bntAddP = new JButton("AddP");

    JButton bntExI = new JButton("ExI");
    JButton bntExF = new JButton("ExF");
    JButton bntExP = new JButton("ExP");

    JButton bntAnt = new JButton("<<");
    JButton bntProx = new JButton(">>");
    JButton bntSair = new JButton("Sair");

    public static void main(String[] args) {
        App app = new App();
    }

    public App() {
        setLayout(new GridLayout(2, 1));
        setTitle("Cadastro de cidades");

        JPanel panelCont = new JPanel();
        panelCont.setLayout(new GridLayout(10, 5));

        panelCont.add(lN);
        panelCont.add(txtN);

        panelCont.add(lPais);
        panelCont.add(txtPais);

        panelCont.add(lAtrat);
        panelCont.add(txtAtrat);

        panelCont.add(lNota);
        panelCont.add(txtNota);

        panelCont.add(lPos);
        panelCont.add(txtPos);

        add(panelCont);
        setVisible(true);
        pack();
    }
}
