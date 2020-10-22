
package com.api.currencies;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KRW {

    @SerializedName("currency_name")
    @Expose
    private String currencyName;
    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    @SerializedName("decimal_units")
    @Expose
    private String decimalUnits;
    @SerializedName("countries")
    @Expose
    private List<String> countries = null;

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDecimalUnits() {
        return decimalUnits;
    }

    public void setDecimalUnits(String decimalUnits) {
        this.decimalUnits = decimalUnits;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

}
