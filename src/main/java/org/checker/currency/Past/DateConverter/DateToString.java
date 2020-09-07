package org.checker.currency.Past.DateConverter;

import java.time.LocalDate;

public class DateToString implements DateConverter {
    @Override
    public String convertLocalDateToString(LocalDate date) {
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        String result = "";

        result += year+"-";
        if (month < 10) {
            result += "0" + month + "-";
        }else result += month+"-";

        if (day < 10) {
            result += "0"+day;
        }else result+=day;

        return result;
    }

}
