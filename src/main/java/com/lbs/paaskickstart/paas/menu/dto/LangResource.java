package com.lbs.paaskickstart.paas.menu.dto;

public class LangResource {

    /*
    "LangResources": [
      {
        "Lang": "string",
        "Value": "string",
        "Name": "string",
        "Description": "string",
        "Tooltip": "string",
        "TenantId": "string",
        "MenuId": "string",
        "InsertDate": "2019-05-06T07:11:53.346Z",
        "InsertedBy": 0,
        "IsActive": true,
        "LastUpdateDate": "2019-05-06T07:11:53.346Z",
        "LastUpdatedBy": 0,
        "Id": 0
      }
    ],
     */

    private String lang;
    private String name;
    private String description;
    private String toolTip;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getToolTip() {
        return toolTip;
    }

    public void setToolTip(String toolTip) {
        this.toolTip = toolTip;
    }
}
