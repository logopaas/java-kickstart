
package com.lbs.paaskickstart.paas.menu.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccessRightUrlDTO {

    @SerializedName("Operation")
    @Expose
    private String operation;
    @SerializedName("Url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AccessRightUrlDTO() {
    }

    /**
     * 
     * @param operation
     * @param url
     */
    public AccessRightUrlDTO(String operation, String url) {
        super();
        this.operation = operation;
        this.url = url;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
