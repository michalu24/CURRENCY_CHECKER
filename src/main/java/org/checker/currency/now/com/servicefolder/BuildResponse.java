package org.checker.currency.now.com.servicefolder;

import com.google.gson.Gson;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.checker.currency.now.com.converting.CurrencyScoopConvertResponse;

import java.io.IOException;

public class BuildResponse {
    public static final String URL = "https://api.currencyscoop.com/v1/convert";

    //    public static final String URL = "https://api.currencyscoop.com/v1/convert?api_key=168b8b2e92726eb8d6d7d9fa8d23a6c1&base=PLN&to=USD&amount=10";
    public double createResponse(String baseCurrency,String newCurrency,String amout) throws IOException {


        //dodawanie waluty zamnienonej



        OkHttpClient httpClient = new OkHttpClient();
        Gson gson = new Gson();
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("api.currencyscoop.com")
                .addPathSegment("v1")
                .addPathSegment("convert")
                .addQueryParameter("api_key", "168b8b2e92726eb8d6d7d9fa8d23a6c1")
                .addQueryParameter("base", baseCurrency.toUpperCase().trim())
                .addQueryParameter("to", newCurrency.toUpperCase().trim())
                .addQueryParameter("amount", amout)
                .build();
        Request request = new Request.Builder()
                .url(httpUrl)
                .build();
        Response response = httpClient.newCall(request).execute();
        CurrencyScoopConvertResponse currency = gson.fromJson(response.body().string(), CurrencyScoopConvertResponse.class);

        double value = currency.getResponse1().getValue();


        return value;

    }
}
