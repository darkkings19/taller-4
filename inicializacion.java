import javax.swing.*;

public class inicializacion {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ventanaestudiante");
        frame.setContentPane(new ventanaestudiante().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
