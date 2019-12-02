package Tobago;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlBouton implements ActionListener {
    private Vue vue;
    private Model model;

    public ControlBouton(Model mod, Vue vue) {
        this.vue = vue;
        this.model = mod;
        this.vue.setControlBouton(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (vue.Quitter == e.getSource()){
            vue.quitter();
        }
        if (vue.Option == e.getSource()){
            vue.afficherOption();
        }
        if (vue.Start == e.getSource()){
            vue.afficherJeu();
        }
    }

}
