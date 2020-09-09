package org.checker.currency.now.com.servicefolder;



import com.api.AllCurrenciesReflection;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class DefaultCurrencyScannerService implements CurrencyScannerService {

    private Scanner scanner = new Scanner(System.in);
    private String currency = null;
    private String input = null;
    private String previous = "Wybierz walutę którą chciałbyć zamiennić";




    @Override
    public String chooseCurrency() {


        try {
            System.out.println(previous);
            currency = scanner.nextLine();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        boolean validate = AllCurrenciesReflection.validate(currency);
        if (validate) {
            System.out.println("nazwy waluty " + currency);
            return currency;
        } else {

            System.out.println("Podaj poprawną nazwę");
            return chooseCurrency();
        }
    }

    @Override
    public String chooseAmoutOfMoney() {
        System.out.println("Napisz ile pieniędzy zamierzasz przeliczyć");
        try {
            input = scanner.nextLine();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
//        boolean numeric = isNumeric(input);
        boolean numeric= isNumeric(input);
        if (!numeric) {
            System.out.println("Wpisana przez ciebie watość nie jest liczbą");
            chooseAmoutOfMoney();
        }
        return input;
    }




public static boolean isNumeric(String str) {
    try {
        Double.parseDouble(str);
        return true;
    } catch(NumberFormatException e){
        return false;
    }
}
}
