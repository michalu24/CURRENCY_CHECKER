package org.checker.currency.Past.ConversionAtTheRateOnDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

class ConversionAtTheRateOnDateTest {

    ConversionAtTheRateOnDate conversion;

    @BeforeEach
    void init() {
        conversion = new ConversionAtTheRateOnDate();
    }

//    @Disabled("Error on Server, Showing all rates at 0.0!")
    @Test
    void ofConversionFromPLN_To_EUR() throws IOException {
        //given
        double value = conversion.PlnToEUR(400, LocalDate.of(2011, 3, 3));
        //when
        //then
        assertThat(value, is(not(nullValue())));
        assertThat(value,closeTo(100D,5D));

    }
//    @Disabled("Error on Server, Showing all rates at 0.0!")
    @Test
    void ofConversionFromPLN_To_EUR_DOUBLE_Input() throws IOException {
        //given
        double value = conversion.PlnToEUR(400.1213, LocalDate.of(2011, 3, 3));
        //when
        //then
        assertThat(value, is(not(nullValue())));
        assertThat(value,closeTo(100,5D));
    }
//    @Disabled("Error on Server, Showing all rates at 0.0!")
    @Test
    void ofConversionFromPLN_To_USD() throws IOException {
        //given
        double value = conversion.PlnToUSD(400, LocalDate.of(2011, 3, 3));
        //when
        //then
        assertThat(value, is(not(nullValue())));
        assertThat(value,closeTo(140D,5D));
    }
//    @Disabled("Error on Server, Showing all rates at 0.0!")
    @Test
    void ofConversionFromPLN_To_USD_DOUBLE_Input() throws IOException {
        //given
        double value = conversion.PlnToUSD(400.1312, LocalDate.of(2010, 3, 3));
        //when
        //then
        assertThat(value, is(not(nullValue())));
        assertThat(value,closeTo(140D,5D));
    }
//    @Disabled("Error on Server, Showing all rates at 0.0!")
    @Test
    void ofConversionFromPLN_To_GBP() throws IOException {
        //given
        double value = conversion.PlnToGBP(400, LocalDate.of(2010, 3, 3));
        //when
        //then
        assertThat(value, is(not(nullValue())));
        assertThat(value,closeTo(90D,5D));
    }
//    @Disabled("Error on Server, Showing all rates at 0.0!")
    @Test
    void ofConversionFromPLN_To_GBP_DOUBLE_Input() throws IOException {
        //given
        double value = conversion.PlnToGBP(400.1231, LocalDate.of(2003, 3, 3));
        //when
        //then
        assertThat(value, is(not(nullValue())));
        assertThat(value,closeTo(65D,5D));
    }
}