package org.checker.currency.Past.ClientProvider;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

class HttpClientProviderTest {

    @Test
    void clientShouldBeReimbursable() {
        //Given
        HttpClientProvider provider = new HttpClientProvider();
        //When
        OkHttpClient client = provider.getClient();
        //then
        assertThat(client, is(equalTo(provider.getClient())));
    }
}