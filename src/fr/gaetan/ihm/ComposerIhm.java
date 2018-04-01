package fr.gaetan.ihm;

import fr.gaetan.BLL.Composer;
import fr.gaetan.controller.ComposerController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComposerIhm extends JFrame {

    ComposerController controller = new ComposerController();

    public ComposerIhm() {
        super();

        build();//On initialise notre fenêtre
    }

    private void build() {
        setTitle("Composer"); //On donne un titre à l'application
        setSize(400, 100); //On donne une taille à notre fenêtre
        setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        setResizable(false); //On interdit la redimensionnement de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);

        JLabel label = new JLabel("Pour generer un nouveau morceau clique sur generer ");
        JButton generateBtn = new JButton("Generer");
        JButton cancelBtn = new JButton("Annuler");

        panel.add(label);
        panel.add(generateBtn);
        panel.add(cancelBtn);


        generateBtn.addActionListener(new TraitementGenerate());
        cancelBtn.addActionListener(new TraitementCloseWindow());

        return panel;
    }

    public class TraitementGenerate implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Composer newSong = null;
            newSong = controller.createASong();

            JOptionPane.showMessageDialog(ComposerIhm.this,
                    "Voici les parametres de la nouvelle chanson : \n\n\n" +
                            "Le theme : " + newSong.getTheme() + "\n"+
                            "Les accords : " + newSong.getAccord() + "\n"+
                            "Le style : " + newSong.getStyle() + "\n"+
                            "La contrainte : " + newSong.getContrainte() + "\n"+
                            "La contrainte de composition : " + newSong.getComposition() + "\n"+
                            "La contrainte d'écriture : " + newSong.getEcriture() + "\n",
                    "Ta nouvelle chanson",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    public  class   TraitementCloseWindow implements   ActionListener
    {
        public  void    actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}
