package Tobago;

class Application {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                Model model = new Model();
                ControlGroup controler = new ControlGroup(model);
            }
        });

    }
}
