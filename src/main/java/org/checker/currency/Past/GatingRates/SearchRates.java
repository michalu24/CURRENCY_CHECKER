package org.checker.currency.Past.GatingRates;

import java.io.IOException;
import java.time.LocalDate;

public interface SearchRates {

    double findRateOfEUR(LocalDate date) throws IOException;
    double findRateOfUSD(LocalDate date) throws IOException;
    double findRateOfGBP(LocalDate date) throws IOException;

}
