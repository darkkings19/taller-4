import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaestudiante{
   public JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton nuevoEstudianteButton;
    private JComboBox Rut_Estudiante_ICC264;

    public ventanaestudiante() {
        nuevoEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("se a pulsado el bottom");
                JFrame frame = new JFrame("ventanagregarestudiante");
                frame.setContentPane(new ventanagregarestudiante().panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

