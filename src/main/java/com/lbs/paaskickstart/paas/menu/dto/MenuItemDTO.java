
package com.lbs.paaskickstart.paas.menu.dto;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MenuItemDTO
{

	@SerializedName("Id")
	@Expose
	private String id;
	@SerializedName("AppId")
	@Expose
	private String appId;
	@SerializedName("AuthorizationCode")
	@Expose
	private String authorizationCode;
	@SerializedName("Url")
	@Expose
	private String url;
	@SerializedName("ParentNodeId")
	@Expose
	private String parentNodeId;
	@SerializedName("IsActive")
	@Expose
	private boolean isActive;
	@SerializedName("Icon")
	@Expose
	private String icon;
	@SerializedName("IsUrlRelative")
	@Expose
	private boolean isUrlRelative;
	@SerializedName("IsInNewTab")
	@Expose
	private boolean isInNewTab;

	@SerializedName("LangResources")
	@Expose
	private List<LangResource> langResources = null;

	@SerializedName("HasRight")
	@Expose
	private boolean hasRight;
	@SerializedName("AccessCode")
	@Expose
	private AccessCodeDTO accessCode;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public MenuItemDTO()
	{
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParentNodeId() {
		return parentNodeId;
	}

	public void setParentNodeId(String parentNodeId) {
		this.parentNodeId = parentNodeId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public boolean isUrlRelative() {
		return isUrlRelative;
	}

	public void setUrlRelative(boolean urlRelative) {
		isUrlRelative = urlRelative;
	}

	public boolean isInNewTab() {
		return isInNewTab;
	}

	public void setInNewTab(boolean inNewTab) {
		isInNewTab = inNewTab;
	}

	public List<LangResource> getLangResources() {
		return langResources;
	}

	public void setLangResources(List<LangResource> langResources) {
		this.langResources = langResources;
	}

	public boolean isHasRight() {
		return hasRight;
	}

	public void setHasRight(boolean hasRight) {
		this.hasRight = hasRight;
	}

	public AccessCodeDTO getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(AccessCodeDTO accessCode) {
		this.accessCode = accessCode;
	}
}
