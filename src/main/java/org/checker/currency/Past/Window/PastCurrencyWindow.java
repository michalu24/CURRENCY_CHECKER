package org.checker.currency.Past.Window;

import org.checker.currency.Past.ConversionAtTheRateOnDate.Conversion;
import org.checker.currency.Past.ConversionAtTheRateOnDate.ConversionAtTheRateOnDate;
import org.checker.currency.Past.Exceptions.WrongArgumentException;
import org.checker.currency.Past.GatingRates.SearchRatesByDate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;

public class PastCurrencyWindow extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextPane textPane1;
    private JTextField amountPLN;
    private JTextField rok;
    private JTextField miesiac;
    private JTextField dzien;
    private JButton EURButton;
    private JButton USDButton;
    private JButton GBPButton;
    private JLabel Label1;


    public PastCurrencyWindow() {

        super("Okno");
        this.setSize(450, 350);
        this.setLocation(500, 350);
        this.setResizable(false);
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void initComponents() {
        this.getContentPane().add(panel1);
        textPane1.setEditable(false);
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        EURButton.addActionListener(this);
        USDButton.addActionListener(this);
        GBPButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ConversionAtTheRateOnDate conversion = new ConversionAtTheRateOnDate();
        SearchRatesByDate search = new SearchRatesByDate();

        if (e.getSource() == EURButton) {
            textPane1.setText("");
            int year = 0;
            try{
                year = Integer.parseInt(rok.getText());

            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
                textPane1.setText("Podano niepoprawny rok! Rok musi być podany\n w formie numerycznej !");
            }


            if (year < 2002 || year > LocalDate.now().getYear()) {
                try {
                    throw new WrongArgumentException("Year must be within range of 2002 and present year!");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Rok musi być w przedziale od roku 2002 do obecnego!");
                }
            }

            int month = 0;
            try{
                month = Integer.parseInt(miesiac.getText());

            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
                textPane1.setText("Podano niepoprawny miesiąc! Musi być podany\n w formie numerycznej od 1-12!");
            }

            if (month < 1 || month > 12) {
                try {
                    throw new WrongArgumentException("Year must be numeric value between 1 - 12");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Miesiąc musi być podany w wartości numerycznej od 1 - 12!");
                }
            }

            int day = 0;
            try{
                day = Integer.parseInt(dzien.getText());

            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
            }

            if (day < 0 || day > 31) {
                try {
                    throw new WrongArgumentException("Day must be numeric value between 1 - 31");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Dzień musi być wartością numeryczną od 1-31!");
                }
            }
            int value = 0;
            try {
                value = Integer.parseInt(amountPLN.getText());

            } catch (NumberFormatException e1) {
                e1.printStackTrace();
                textPane1.setText("\nWartość do przeliczenia musi być większa niż 0!");
            }

            if (value < 0) {
                try {
                    throw new WrongArgumentException("Arguments must be numerical and higher than 0!");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Wartość musi być numeryczna większa od 0!");
                }
            }
            double result = 0.0D;
            try {
               result = conversion.PlnToEUR(value, LocalDate.of(year, month, day));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            double rateResult = 0;
            try {
                rateResult = search.findRateOfEUR(LocalDate.of(year, month, day));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            textPane1.setText("\n Wartość w EUR = " + result+"\n" +
                    "1 PLN to w przeliczeniu = " + rateResult+" EUR");




        }

        if (e.getSource() == USDButton) {
            textPane1.setText("");
            int year = 0;
            try{
                year = Integer.parseInt(rok.getText());

            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
                textPane1.setText("Podano niepoprawny rok! Rok musi być podany\n w formie numerycznej !");
            }


            if (year < 2002 || year > LocalDate.now().getYear()) {
                try {
                    throw new WrongArgumentException("Year must be within range of 2002 and present year!");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Rok musi być w przedziale od roku 2002 do obecnego!");
                }
            }

            int month = 0;
            try{
                month = Integer.parseInt(miesiac.getText());

            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
                textPane1.setText("Podano niepoprawny miesiąc! Musi być podany\n w formie numerycznej od 1-12!");
            }

            if (month < 1 || month > 12) {
                try {
                    throw new WrongArgumentException("Year must be numeric value between 1 - 12");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Miesiąc musi być podany w wartości numerycznej od 1 - 12!");
                }
            }

            int day = 0;
            try{
                day = Integer.parseInt(dzien.getText());

            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
            }

            if (day < 0 || day > 31) {
                try {
                    throw new WrongArgumentException("Day must be numeric value between 1 - 31");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Dzień musi być wartością numeryczną od 1-31!");
                }
            }
            int value = 0;
            try {
                value = Integer.parseInt(amountPLN.getText());

            } catch (NumberFormatException e1) {
                e1.printStackTrace();
                textPane1.setText("\nWartość do przeliczenia musi być większa niż 0!");
            }

            if (value < 0) {
                try {
                    throw new WrongArgumentException("Arguments must be numerical and higher than 0!");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Wartość musi być numeryczna większa od 0!");
                }
            }
            double result = 0.0D;
            try {
               result = conversion.PlnToUSD(value, LocalDate.of(year, month, day));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            double rateResult = 0;
            try {
                rateResult = search.findRateOfUSD(LocalDate.of(year, month, day));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            textPane1.setText("\n Wartość w USD = " + result+"\n" +
                    "1 PLN to w przeliczeniu = " + rateResult+" USD");




        }
        if (e.getSource() == GBPButton) {
            textPane1.setText("");
            int year = 0;
            try{
                year = Integer.parseInt(rok.getText());

            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
                textPane1.setText("Podano niepoprawny rok! Rok musi być podany\n w formie numerycznej !");
            }


            if (year < 2002 || year > LocalDate.now().getYear()) {
                try {
                    throw new WrongArgumentException("Year must be within range of 2002 and present year!");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Rok musi być w przedziale od roku 2002 do obecnego!");
                }
            }

            int month = 0;
            try{
                month = Integer.parseInt(miesiac.getText());

            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
                textPane1.setText("Podano niepoprawny miesiąc! Musi być podany\n w formie numerycznej od 1-12!");
            }

            if (month < 1 || month > 12) {
                try {
                    throw new WrongArgumentException("Year must be numeric value between 1 - 12");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Miesiąc musi być podany w wartości numerycznej od 1 - 12!");
                }
            }

            int day = 0;
            try{
                day = Integer.parseInt(dzien.getText());

            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
            }

            if (day < 0 || day > 31) {
                try {
                    throw new WrongArgumentException("Day must be numeric value between 1 - 31");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Dzień musi być wartością numeryczną od 1-31!");
                }
            }
            int value = 0;
            try {
                value = Integer.parseInt(amountPLN.getText());

            } catch (NumberFormatException e1) {
                e1.printStackTrace();
                textPane1.setText("\nWartość do przeliczenia musi być większa niż 0!");
            }

            if (value < 0) {
                try {
                    throw new WrongArgumentException("Arguments must be numerical and higher than 0!");
                } catch (WrongArgumentException wrongArgumentException) {
                    wrongArgumentException.printStackTrace();
                    textPane1.setText("Wartość musi być numeryczna większa od 0!");
                }
            }
            double result = 0.0D;
            try {
               result = conversion.PlnToGBP(value, LocalDate.of(year, month, day));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            double rateResult = 0;
            try {
                rateResult = search.findRateOfGBP(LocalDate.of(year, month, day));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            textPane1.setText("\n Wartość w GBP = " + result+"\n" +
                    "1 PLN to w przeliczeniu = " + rateResult+" GBP");




        }
    }

    public static void main(String[] args) {
        PastCurrencyWindow window = new PastCurrencyWindow();
    }
}
