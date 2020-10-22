package EntranceGui;

import org.checker.currency.now.com.guipackage.Windownew;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Entrance extends JFrame implements ActionListener {
    private JPanel panel1;
    private JButton kursWalutyWCzasieButton1;
    private JButton kursWalutyWCzasieButton;


    public Entrance(String title) {
        super(title);
        this.setSize(600, 350);
        this.setLocation(500, 350);
        this.setResizable(false);
        initCompontents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true);


    }
    public void initCompontents() {
        this.getContentPane().add(panel1);
        kursWalutyWCzasieButton.addActionListener(this);
        kursWalutyWCzasieButton1.addActionListener(this);


    }
    public static void main(String[] args) {
        Entrance entrance = new Entrance("startMenu");
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == kursWalutyWCzasieButton){
            Windownew.showWindow();
        }
        if(a.getSource()==kursWalutyWCzasieButton1){

        }

    }
}
