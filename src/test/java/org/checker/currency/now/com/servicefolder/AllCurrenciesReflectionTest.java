package org.checker.currency.now.com.servicefolder;

import com.api.AllCurrenciesReflection;
import org.junit.Test;

import static org.junit.Assert.assertFalse;


public class AllCurrenciesReflectionTest {


    @Test
    public void invalid_currency_insert(){
        //give
        String invalidCurrency = "sks";

        //when
        boolean validate = AllCurrenciesReflection.validate(invalidCurrency);

        //then

        assertFalse(validate);


    }

    @Test
    public void valid_currency_insert() {
        //give
        String invalidCurrency = "pln";

        //when
        boolean validate = AllCurrenciesReflection.validate(invalidCurrency);

        //then

        assertFalse(validate);


    }


}