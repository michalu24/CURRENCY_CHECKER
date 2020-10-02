package org.checker.currency.now.com.guipackage;


import com.api.AllCurrenciesReflection;
import org.checker.currency.now.com.servicefolder.BuildResponse;
import org.checker.currency.now.com.servicefolder.DefaultCurrencyScannerService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.InputMethodListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Windownew extends JFrame implements ActionListener {
    ArrayList<String> str = new ArrayList<>();
    private JPanel panelglowny;
    private JButton przeliczButton;
    ;

    private JTextField wpiszpieniadze;
    private JTextField wpiszkonc;
    private JTextField wpiszpocz;
    private JLabel poczatek;
    private JLabel ilosc;
    private JLabel koniec;
    private JLabel wynik;
    private JLabel Uwagi;
    private String defaultCurrency;
    private String endCurrency;
    private String money;

    public Windownew(String title) {
        super(title);
        this.setSize(600, 350);
        this.setLocation(500, 350);
        this.setResizable(false);
        initCompontents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


    }


    public void initCompontents() {
        this.getContentPane().add(panelglowny);
        wpiszpocz.addActionListener(this);
        wpiszkonc.addActionListener(this);
        wpiszpieniadze.addActionListener(this);
        przeliczButton.addActionListener(this);


    }


    public static void main(String[] args) {
        Windownew windownew = new Windownew("Po wpisaniu wartości zatwierdź eneterem");
    }


    @Override
    public void actionPerformed(ActionEvent e) {


//        if (e.getSource() == wpiszpocz) {
//            String pocz = null;
//
//            try {
//                pocz = wpiszpocz.getText();
//            } catch (NoSuchElementException a) {
//                a.printStackTrace();
//            } catch (IllegalStateException a) {
//                a.printStackTrace();
//            }
//            boolean validate = AllCurrenciesReflection.validate(pocz);
//            if (validate) {
//
//
//                str.add(pocz);
//                Uwagi.setText("Możesz przejść dalej");
//
//
//            } else {
//                str.remove(2);
//                Uwagi.setText("Nie ma takiej waluty");
//
//
//            }
//
//        }
//        if (e.getSource() == wpiszkonc) {
//
//            String konc = null;
//
//            try {
//                konc = wpiszkonc.getText();
//            } catch (NoSuchElementException a) {
//                a.printStackTrace();
//            } catch (IllegalStateException a) {
//                a.printStackTrace();
//            }
//            boolean validate = AllCurrenciesReflection.validate(konc);
//            if (validate) {
//
//                str.add(konc);
//                Uwagi.setText("Teraz wciśnij przycisk zamiany");
//
//
//            } else {
//
//                str.remove(0);
//                Uwagi.setText("Nie ma takiej waluty");
//
//
//            }
//        }
//        if (e.getSource() == wpiszpieniadze) {
//            String money = null;
//            try {
//                money = wpiszpieniadze.getText();
//
//            } catch (IllegalStateException a) {
//                a.printStackTrace();
//            }
////
//            boolean numeric = isNumeric(money);
//
//            if (!numeric) {
//                Uwagi.setText("To nie jest liczba");
//                str.remove(1);
//
//
//            } else {
//
//
//                Uwagi.setText("Przejdź dalej");
//
//                str.add(money);
//            }
//
//        }


//

        if (e.getSource() == przeliczButton) {
            String pocz = null;

            try {
                pocz = wpiszpocz.getText();
            } catch (NoSuchElementException a) {
                a.printStackTrace();
            } catch (IllegalStateException a) {
                a.printStackTrace();
            }
            boolean validate = AllCurrenciesReflection.validate(pocz);
            if (validate) {


                str.add(pocz);


            } else {
                str.clear();
                Uwagi.setText("Nie ma takiej waluty");
                clearTextFiels();


            }
            String konc = null;

            try {
                konc = wpiszkonc.getText();
            } catch (NoSuchElementException a) {
                a.printStackTrace();
            } catch (IllegalStateException a) {
                a.printStackTrace();
            }
            boolean validate2 = AllCurrenciesReflection.validate(konc);
            if (validate2) {

                str.add(konc);


            } else {

                str.remove(0);
                Uwagi.setText("Nie ma takiej waluty");
                clearTextFiels();

            }
            String money = null;
            try {
                money = wpiszpieniadze.getText();

            } catch (IllegalStateException a) {
                a.printStackTrace();
            }
//
            boolean numeric = isNumeric(money);

            if (!numeric) {
                Uwagi.setText("To nie jest liczba");
                str.remove(1);
                clearTextFiels();

            } else {


                Uwagi.setText("Przejdź dalej");

                str.add(money);
            }


            if (str.size() == 3 && !str.contains(null)) {
                BuildResponse buildResponse = new BuildResponse();


                double response1 = 0;
                System.out.println(str);
                try {
                    response1 = buildResponse.createResponse(str.get(0), str.get(1), str.get(2));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                double roundValue = Math.round(response1);
                String wyniki = String.valueOf(roundValue);
                wynik.setText(wyniki  + " \t" + str.get(1));
//            try {
//                response = buildResponse.createResponse(str.get(0),str.get(1),str.get(2));
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//            System.out.println(response);\\\
                str.clear();

            } else {
                przeliczButton = null;
                str.clear();
//                Uwagi.setText("Nie wszyskie pola wypełnione");


            }

//        }
        }


    }

    public static boolean isNumeric(String str) {
        try {
            Double num = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void clearTextFiels() {
        wpiszpocz.setText("");
        wpiszkonc.setText("");
        wpiszpieniadze.setText("");
    }
}