package org.checker.currency.Past.GatingRates;

import okhttp3.Request;
import okhttp3.Response;
import org.checker.currency.Past.Classes.Example;
import org.checker.currency.Past.ClientProvider.HttpClientProvider;
import org.checker.currency.Past.Converter.JsonDataConverter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

public class SearchRatesByDate implements SearchRates {

    public SearchRatesByDate() {
    }

    @Override
    public double findRateOfEUR(LocalDate date) throws IOException {
        return 0;
    }

    @Override
    public double findRateOfDOL(LocalDate date) {
        return 0;
    }

    @Override
    public double findRateOfGBP(LocalDate date) {
        return 0;
    }
}
