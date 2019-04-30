
package com.lbs.paaskickstart.paas.menu.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccessCodeDTO {

    @SerializedName("AppId")
    @Expose
    private String appId;
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("ContextId")
    @Expose
    private String contextId;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("IsActive")
    @Expose
    private boolean isActive;
    @SerializedName("AccessRightUrls")
    @Expose
    private List<AccessRightUrlDTO> accessRightUrls = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AccessCodeDTO() {
    }

    /**
     * 
     * @param isActive
     * @param accessRightUrls
     * @param contextId
     * @param appId
     * @param description
     * @param code
     */
    public AccessCodeDTO(String appId, String code, String contextId, String description, boolean isActive, List<AccessRightUrlDTO> accessRightUrls) {
        super();
        this.appId = appId;
        this.code = code;
        this.contextId = contextId;
        this.description = description;
        this.isActive = isActive;
        this.accessRightUrls = accessRightUrls;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContextId() {
        return contextId;
    }

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public List<AccessRightUrlDTO> getAccessRightUrls() {
        return accessRightUrls;
    }

    public void setAccessRightUrls(List<AccessRightUrlDTO> accessRightUrls) {
        this.accessRightUrls = accessRightUrls;
    }

}
