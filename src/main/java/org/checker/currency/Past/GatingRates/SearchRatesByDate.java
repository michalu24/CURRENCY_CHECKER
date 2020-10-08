package org.checker.currency.Past.GatingRates;

import okhttp3.Request;
import okhttp3.Response;
import org.checker.currency.Past.Classes.Example;
import org.checker.currency.Past.ClientProvider.HttpClientProvider;
import org.checker.currency.Past.Converter.JsonDataConverter;
import org.checker.currency.Past.DateConverter.DateToString;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

public class SearchRatesByDate implements SearchRates {

    public SearchRatesByDate() {
    }

    @Override
    public double findRateOfEUR(LocalDate date) throws IOException {
        HttpClientProvider provider = new HttpClientProvider();

        DateToString getString = new DateToString();
        String newDate = getString.convertLocalDateToString(date);


        Request request = new Request.Builder()
                .url("https://api.currencyscoop.com/v1/historical"+
                        "?api_key=14707854aef3b9afe4c2a61c04f6314c"+
                        "&date="+newDate+"&base=PLN")
                .get()
                .build();
        Response response = provider.getClient().newCall(request).execute();
        String jsonstring = Objects.requireNonNull(response.body()).string();
        JsonDataConverter dataConverter = new JsonDataConverter();

        Example example = dataConverter.convert(jsonstring);

        return example.getResponse().getRates().getEUR();
    }

    @Override
    public double findRateOfUSD(LocalDate date) throws IOException {
        HttpClientProvider provider = new HttpClientProvider();

        DateToString getString = new DateToString();
        String newDate = getString.convertLocalDateToString(date);


        Request request = new Request.Builder()
                .url("https://api.currencyscoop.com/v1/historical"+
                        "?api_key=14707854aef3b9afe4c2a61c04f6314c"+
                        "&date="+newDate+"&base=PLN")
                .get()
                .build();
        Response response = provider.getClient().newCall(request).execute();
        String jsonstring = Objects.requireNonNull(response.body()).string();
        JsonDataConverter dataConverter = new JsonDataConverter();

        Example example = dataConverter.convert(jsonstring);

        return example.getResponse().getRates().getUSD();

    }

    @Override
    public double findRateOfGBP(LocalDate date) throws IOException {
        HttpClientProvider provider = new HttpClientProvider();

        DateToString getString = new DateToString();
        String newDate = getString.convertLocalDateToString(date);


        Request request = new Request.Builder()
                .url("https://api.currencyscoop.com/v1/historical"+
                        "?api_key=14707854aef3b9afe4c2a61c04f6314c"+
                        "&date="+newDate+"&base=PLN")
                .get()
                .build();
        Response response = provider.getClient().newCall(request).execute();
        String jsonstring = Objects.requireNonNull(response.body()).string();
        JsonDataConverter dataConverter = new JsonDataConverter();

        Example example = dataConverter.convert(jsonstring);

        return example.getResponse().getRates().getGBP();

    }
}
