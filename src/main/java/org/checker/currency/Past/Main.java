package org.checker.currency.Past;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.checker.currency.Past.Classes.Example;
import org.checker.currency.Past.Classes.Rates;
import org.checker.currency.Past.Converter.JsonDataConverter;
import org.checker.currency.Past.GatingRates.SearchRates;
import org.checker.currency.Past.GatingRates.SearchRatesByDate;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
//        OkHttpClient client = new OkHttpClient();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj date kursu:\n");
//
//        String date= scanner.next();
//        Request request = new Request.Builder()
//                .url("https://api.currencyscoop.com/v1/historical"+
//                        "?api_key=14707854aef3b9afe4c2a61c04f6314c"+
//                        "&date="+date+"&base=PLN")
//                .get()
//                .build();
//
//        Response response = client.newCall(request).execute();
//        String jsonstring = Objects.requireNonNull(response.body()).string();
//        JsonDataConverter dataConverter = new JsonDataConverter();
//        Example example = dataConverter.convert(jsonstring);
//        System.out.println(example.getResponse().getRates().getEUR());

        SearchRatesByDate newSearch = new SearchRatesByDate();

        System.out.println(newSearch.findRateOfEUR(LocalDate.of(2020, 3, 3)));

        System.out.println(newSearch.findRateOfEUR(LocalDate.of(2020, 3, 3)));

    }

}
