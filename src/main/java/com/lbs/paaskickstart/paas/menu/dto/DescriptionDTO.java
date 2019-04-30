
package com.lbs.paaskickstart.paas.menu.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DescriptionDTO {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("NameId")
    @Expose
    private String nameId;
    @SerializedName("Lang")
    @Expose
    private String lang;
    @SerializedName("Value")
    @Expose
    private String value;
    @SerializedName("TenantId")
    @Expose
    private String tenantId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DescriptionDTO() {
    }

    /**
     * 
     * @param tenantId
     * @param id
     * @param value
     * @param lang
     * @param nameId
     */
    public DescriptionDTO(int id, String nameId, String lang, String value, String tenantId) {
        super();
        this.id = id;
        this.nameId = nameId;
        this.lang = lang;
        this.value = value;
        this.tenantId = tenantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

}
