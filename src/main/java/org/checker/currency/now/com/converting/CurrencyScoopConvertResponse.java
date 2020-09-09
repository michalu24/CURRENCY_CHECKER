
package org.checker.currency.now.com.converting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrencyScoopConvertResponse {

    @SerializedName("meta")
    @Expose
    private Meta1 meta;
    @SerializedName("response")
    @Expose
    private Response1 response1;

    public Meta1 getMeta() {
        return meta;
    }

    public void setMeta(Meta1 meta) {
        this.meta = meta;
    }

    public Response1 getResponse1() {
        return response1;
    }

    public void setResponse1(Response1 response1) {
        this.response1 = response1;
    }

    @Override
    public String toString() {
        return "CurrencyScoopConvertResponse{" +
                "meta=" + meta +
                ", response=" + response1 +
                '}';
    }
}
