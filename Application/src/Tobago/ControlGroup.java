package Tobago;

public class ControlGroup {

    private Model model;
    private Vue vue;
    private ControlBouton cb;

    public ControlGroup(Model model) {

        this.model = model;

        this.vue = new Vue(model);

        this.vue.display();

        cb = new ControlBouton(model, vue);
    }
}