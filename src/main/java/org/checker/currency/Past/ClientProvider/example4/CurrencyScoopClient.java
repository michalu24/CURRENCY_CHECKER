package org.checker.currency.Past.ClientProvider.example4;


import com.google.gson.Gson;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.checker.currency.now.com.converting.CurrencyScoopConvertResponse;

import java.io.IOException;

public class CurrencyScoopClient {

    public static final String URL = "https://api.currencyscoop.com/v1/convert";
//    public static final String URL = "https://api.currencyscoop.com/v1/convert?api_key=168b8b2e92726eb8d6d7d9fa8d23a6c1&base=PLN&to=USD&amount=10";

    public static void main(String[] args) throws IOException {
//        OkHttpClient httpClient = HttpClientProvider.INSTANCE.getClient();
        OkHttpClient httpClient = new OkHttpClient();
        Gson gson = new Gson();
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("com.api.currencyscoop.com")
                .addPathSegment("v1")
                .addPathSegment("convert")
                .addQueryParameter("api_key", "168b8b2e92726eb8d6d7d9fa8d23a6c1")
                .addQueryParameter("base", "PLN")
                .addQueryParameter("to", "AUD")
                .addQueryParameter("amount", "10")
                .build();
        Request request = new Request.Builder()
                .url(httpUrl)
                .build();
        Response response = httpClient.newCall(request).execute();
       CurrencyScoopConvertResponse httpBinGetJson = gson.fromJson(response.body().string(), CurrencyScoopConvertResponse.class);
        System.out.println("Java Pojo: " + httpBinGetJson);
        System.out.println("Http response: " + response);
        Double value = httpBinGetJson.getResponse1().getValue();
        System.out.println(value);

    }
//    Request request = chain.request();
//    HttpUrl url = request.url().newBuilder().addQueryParameter("name","value").build();
//    request = request.newBuilder().url(url).build();
//        return chain.proceed(request);
}
