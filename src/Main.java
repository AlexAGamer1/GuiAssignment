import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        JPanel panel = new JPanel();

        ImageIcon icon =  new ImageIcon("/Users/alex.gumecindo24/IdeaProjects/GuiAssignment/Images/MyFiles/fortniteOg.jpeg");
        icon.setImage(icon.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));



        JLabel picLabel = new JLabel(icon);
        JLabel label = new JLabel("Type in your username to play OG Fortnite");
        JButton button = new JButton("Login");
        JTextField textField = new JTextField(10);



        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                if (textField.getText().isEmpty()) {
                    label.setText("Your login is empty");
                    return;
                }
                label.setText("You logged in as " + textField.getText());
            }
        });





        panel.setBackground(Color.lightGray);
        panel.add(picLabel);
        panel.add(label);
        panel.add(button);
        panel.add(textField);

        frame.add(panel);
        frame.setVisible(true);
    }
}

/*textfield1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                helloLabel.setText(textfield1.getText());
            }
        });

        panel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                helloLabel.setText("(" + x + "," + y + ")");
            }
        });*/