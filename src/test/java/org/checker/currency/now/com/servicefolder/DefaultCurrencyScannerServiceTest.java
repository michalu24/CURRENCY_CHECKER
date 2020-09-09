package org.checker.currency.now.com.servicefolder;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DefaultCurrencyScannerServiceTest {
    @Test
    public void does_idNumericMethod_work_true() {
        //give
        String input = "543534";

        //when
        boolean numeric = DefaultCurrencyScannerService.isNumeric(input);

        //then
        assertTrue(numeric);


    }

    @Test
    public void does_idNumericMethod_work_false() {
        //give
        String iput = "jfsdgklja";
        //when
        boolean numeric = DefaultCurrencyScannerService.isNumeric(iput);
        //then
        assertFalse(numeric);


    }
}