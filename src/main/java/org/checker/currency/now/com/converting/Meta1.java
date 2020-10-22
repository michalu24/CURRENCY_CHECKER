
package org.checker.currency.now.com.converting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta1 {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("disclaimer")
    @Expose
    private String disclaimer;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "code=" + code +
                ", disclaimer='" + disclaimer + '\'' +
                '}';
    }
}
