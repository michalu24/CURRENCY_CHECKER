package org.checker.currency.Past.GatingRates;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class SearchRatesByDateTest {
    SearchRatesByDate search;

    @BeforeEach
    void init() {
        search = new SearchRatesByDate();
    }

    @Test
    void findRateOfEUR() throws IOException {
        //given
        double result = search.findRateOfEUR(LocalDate.of(2010, 3, 3));
        //when
        //then
        assertThat(result, is(closeTo(0.2, 0.1)));

    }

    @Test
    void findRateOfUSD() {
    }

    @Test
    void findRateOfGBP() {
    }
}