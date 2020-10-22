
package com.api.currencies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("fiats")
    @Expose
    private Fiats fiats;

    public Fiats getFiats() {
        return fiats;
    }

    public void setFiats(Fiats fiats) {
        this.fiats = fiats;
    }

}
