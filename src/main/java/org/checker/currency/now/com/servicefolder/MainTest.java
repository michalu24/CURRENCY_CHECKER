package org.checker.currency.now.com.servicefolder;

import java.io.IOException;

public class MainTest {
    public static void main(String[] args) throws IOException {
        DefaultCurrencyScannerService impl = new DefaultCurrencyScannerService();

        BuildResponse buildResponse = new BuildResponse();

        double value = buildResponse.createResponse(impl);
        System.out.println(value);

    }
}
