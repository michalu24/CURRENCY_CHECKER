package org.checker.currency.Past.ClientProvider;

import okhttp3.OkHttpClient;

public class HttpClientProvider {
    public OkHttpClient client;
    public HttpClientProvider() {
        this.client = new OkHttpClient();
    }

    public OkHttpClient getClient() {
        return client;
    }
}
