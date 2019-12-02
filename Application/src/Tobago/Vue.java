package Tobago;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class Vue extends JFrame {

    protected Model model;

    private JPanel All;
    private JLabel NomJeu;
    private JLabel Spacing1;
    private JLabel Spacing2;
    private JPanel Menu;
    protected JButton Start;
    protected JButton Option;
    protected JButton Quitter;


    private JPanel Plateau;
    private JLabel Plateau_lb;

    private JPanel Option_p;
    private JLabel Option_lb;

    private JButton Retour;

    public Vue(Model model) {

        this.model = model;

        initMenu();
        creerMenu();

        pack();

        // titre, icon, position initiale et non redimensionable
        setTitle("Tobago");
        setLocation(700,400);
        setSize(800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void display() {
        setVisible(true);
    }

    public void initMenu(){
        All = new JPanel();

        Spacing1 = new JLabel("");
        Spacing2 = new JLabel("");

        NomJeu = new JLabel();
        NomJeu.setHorizontalAlignment(JLabel.CENTER);
        NomJeu.setVerticalAlignment(JLabel.CENTER);
        NomJeu.setText("TOBAGO");

        Menu = new JPanel();

        Start = new JButton("Start");
        Option = new JButton("Option");
        Quitter = new JButton("Quitter");

        Start.setPreferredSize(new Dimension(400,50));
        Option.setPreferredSize(new Dimension(400,50));
        Quitter.setPreferredSize(new Dimension(400,50));

        Menu.setLayout(new GridLayout(6,1));
    }

    public void creerMenu(){
        Menu.add(NomJeu);
        Menu.add(Start);
        Menu.add(Spacing1);
        Menu.add(Option);
        Menu.add(Spacing2);
        Menu.add(Quitter);

        All.add(Menu);

        setContentPane(All);
    }

    public void initJeu(){
        Plateau = new JPanel();
        Plateau_lb = new JLabel(new ImageIcon("IMAGE/plateau.png"));
    }

    public void creerJeu(){
        Plateau.add(Plateau_lb);

        All.add(Plateau);

        setContentPane(All);
    }

    public void initOption(){
        Option_p = new JPanel();
        Option_lb = new JLabel("OPTION");

        Option.setLayout(new GridLayout(6,1));
    }

    public void creerOption(){
        Option_p.add(Option_lb);

        All.add(Option_p);

        setContentPane(All);
    }

    public void setControlBouton(ActionListener cb){
        Start.addActionListener(cb);
        Option.addActionListener(cb);
        Quitter.addActionListener(cb);
    }

    public void afficherJeu(){
        Menu.removeAll();
        initJeu();
        creerJeu();
        pack();

        setTitle("Tobago");

        ControlBouton cb;

        cb = new ControlBouton(this.model, this);

    }

    public void afficherOption(){
        Menu.removeAll();
        initOption();
        creerOption();
        pack();

        setTitle("Tobago");
        setSize(800,400);

        ControlBouton cb;

        cb = new ControlBouton(this.model, this);
    }

    public void quitter() {
        exit(0);
    }

    public void restart() {
        Menu.removeAll();
        initMenu();
        creerMenu();
        pack();

        setTitle("Tobago");
        setSize(800,400);

        ControlBouton cb;

        cb = new ControlBouton(this.model, this);
    }
}