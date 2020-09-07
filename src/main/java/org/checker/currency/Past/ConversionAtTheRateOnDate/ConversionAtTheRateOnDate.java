package org.checker.currency.Past.ConversionAtTheRateOnDate;

import org.checker.currency.Past.GatingRates.SearchRatesByDate;

import java.io.IOException;
import java.time.LocalDate;

public class ConversionAtTheRateOnDate implements Conversion{
    @Override
    public double PlnToEUR(int value, LocalDate date) throws IOException {

        SearchRatesByDate search = new SearchRatesByDate();
        double rate = search.findRateOfEUR(date);
        return rate*value;
    }

    @Override
    public double PlnToEUR(double value, LocalDate date) throws IOException {

        SearchRatesByDate search = new SearchRatesByDate();
        double rate = search.findRateOfEUR(date);
        return value*rate;
    }

    @Override
    public double PlnToUSD(int value, LocalDate date) throws IOException {
        SearchRatesByDate search = new SearchRatesByDate();
        double rate = search.findRateOfUSD(date);
        return value*rate;
    }

    @Override
    public double PlnToUSD(double value, LocalDate date) throws IOException {
        SearchRatesByDate search = new SearchRatesByDate();
        double rate = search.findRateOfUSD(date);
        return value*rate;
    }

    @Override
    public double PlnToGBP(int value, LocalDate date) throws IOException {
        SearchRatesByDate search = new SearchRatesByDate();
        double rate = search.findRateOfGBP(date);
        return value*rate;
    }

    @Override
    public double PlnToGBP(double value, LocalDate date) throws IOException {
        SearchRatesByDate search = new SearchRatesByDate();
        double rate = search.findRateOfGBP(date);
        return value*rate;
    }
}
