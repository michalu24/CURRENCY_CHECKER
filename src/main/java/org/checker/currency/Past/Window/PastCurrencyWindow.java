package org.checker.currency.Past.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PastCurrencyWindow extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton EURButton;
    private JButton DOLButton;
    private JButton GBPButton;
    private JLabel Label1;




    public PastCurrencyWindow() {

        super("Okno");
        this.setSize(300, 300);
        this.setLocation(500, 500);
        initComponents();

        EURButton.addActionListener(this);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void initComponents() {
        this.getContentPane().add(panel1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == EURButton) {

        }
    }

    public static void main(String[] args) {
        PastCurrencyWindow window = new PastCurrencyWindow();
    }
}
