package emailapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailDataFormGUI extends JFrame{

    private JTextField firstname;
    private JTextField lastname;
    private JTextField department;
    private JButton submitButton;
    private JLabel labelFirstName;
    private JLabel labelLastName;
    private JLabel labelDepartment;
    private JPanel mainPanel;
    private JLabel genderLabel;
    private JRadioButton male;
    private JRadioButton female;
    private JLabel headerMessage;
    private JLabel actionMessage;


    public void setMainPanel(JPanel mainPanel) {
        this.add(firstname);
        this.add(lastname);
        this.add(department);
        this.add(submitButton);
        this.add(labelFirstName);
        this.add(labelLastName);
        this.add(labelDepartment);
        this.add(genderLabel);
        this.add(male);
        this.add(female);
        this.add(headerMessage);
        this.add(actionMessage);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    EmailDataFormGUI(String title) {

        this.add(mainPanel);
        this.setTitle(title);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.blue);
        this.setSize(400,400);
        this.setLocationRelativeTo(null);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}


