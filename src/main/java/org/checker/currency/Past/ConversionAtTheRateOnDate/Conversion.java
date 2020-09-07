package org.checker.currency.Past.ConversionAtTheRateOnDate;

import java.io.IOException;
import java.time.LocalDate;

public interface Conversion {

    double PlnToEUR(int value, LocalDate date) throws IOException;

    double PlnToEUR(double value, LocalDate date) throws IOException;

    double PlnToUSD(int value, LocalDate date) throws IOException;

    double PlnToUSD(double value, LocalDate date) throws IOException;

    double PlnToGBP(int value, LocalDate date) throws IOException;

    double PlnToGBP(double value, LocalDate date) throws IOException;





}
