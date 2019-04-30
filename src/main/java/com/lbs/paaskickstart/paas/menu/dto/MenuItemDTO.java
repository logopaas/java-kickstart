
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
	@SerializedName("Name")
	@Expose
	private String name;
	@SerializedName("NameId")
	@Expose
	private String nameId;
	@SerializedName("ToolTip")
	@Expose
	private String toolTip;
	@SerializedName("ToolTipId")
	@Expose
	private String toolTipId;
	@SerializedName("Description")
	@Expose
	private String description;
	@SerializedName("DescriptionId")
	@Expose
	private String descriptionId;
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
	@SerializedName("SupportCode")
	@Expose
	private String supportCode;
	@SerializedName("IsUrlRelative")
	@Expose
	private boolean isUrlRelative;
	@SerializedName("IsInNewTab")
	@Expose
	private boolean isInNewTab;
	@SerializedName("TenantId")
	@Expose
	private String tenantId;
	@SerializedName("Names")
	@Expose
	private List<NameDTO> names = null;
	@SerializedName("ToolTips")
	@Expose
	private List<ToolTipDTO> toolTips = null;
	@SerializedName("Descriptions")
	@Expose
	private List<DescriptionDTO> descriptions = null;
	@SerializedName("Childs")
	@Expose
	private List<MenuItemDTO> childs = null;
	@SerializedName("IconSrc")
	@Expose
	private String iconSrc;
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

	/**
	 * 
	 * @param tenantId
	 * @param icon
	 * @param iconSrc
	 * @param appId
	 * @param parentNodeId
	 * @param toolTip
	 * @param toolTipId
	 * @param hasRight
	 * @param accessCode
	 * @param descriptionId
	 * @param isInNewTab
	 * @param authorizationCode
	 * @param descriptions
	 * @param nameId
	 * @param url
	 * @param toolTips
	 * @param id
	 * @param isActive
	 * @param isUrlRelative
	 * @param supportCode
	 * @param names
	 * @param description
	 * @param name
	 * @param childs
	 */
	public MenuItemDTO(String id, String appId, String name, String nameId, String toolTip, String toolTipId, String description,
			String descriptionId, String authorizationCode, String url, String parentNodeId, boolean isActive, String icon,
			String supportCode, boolean isUrlRelative, boolean isInNewTab, String tenantId, List<NameDTO> names,
			List<ToolTipDTO> toolTips, List<DescriptionDTO> descriptions, List<MenuItemDTO> childs, String iconSrc, boolean hasRight,
			AccessCodeDTO accessCode)
	{
		super();
		this.id = id;
		this.appId = appId;
		this.name = name;
		this.nameId = nameId;
		this.toolTip = toolTip;
		this.toolTipId = toolTipId;
		this.description = description;
		this.descriptionId = descriptionId;
		this.authorizationCode = authorizationCode;
		this.url = url;
		this.parentNodeId = parentNodeId;
		this.isActive = isActive;
		this.icon = icon;
		this.supportCode = supportCode;
		this.isUrlRelative = isUrlRelative;
		this.isInNewTab = isInNewTab;
		this.tenantId = tenantId;
		this.names = names;
		this.toolTips = toolTips;
		this.descriptions = descriptions;
		this.childs = childs;
		this.iconSrc = iconSrc;
		this.hasRight = hasRight;
		this.accessCode = accessCode;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getAppId()
	{
		return appId;
	}

	public void setAppId(String appId)
	{
		this.appId = appId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getNameId()
	{
		return nameId;
	}

	public void setNameId(String nameId)
	{
		this.nameId = nameId;
	}

	public String getToolTip()
	{
		return toolTip;
	}

	public void setToolTip(String toolTip)
	{
		this.toolTip = toolTip;
	}

	public String getToolTipId()
	{
		return toolTipId;
	}

	public void setToolTipId(String toolTipId)
	{
		this.toolTipId = toolTipId;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDescriptionId()
	{
		return descriptionId;
	}

	public void setDescriptionId(String descriptionId)
	{
		this.descriptionId = descriptionId;
	}

	public String getAuthorizationCode()
	{
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode)
	{
		this.authorizationCode = authorizationCode;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getParentNodeId()
	{
		return parentNodeId;
	}

	public void setParentNodeId(String parentNodeId)
	{
		this.parentNodeId = parentNodeId;
	}

	public boolean isIsActive()
	{
		return isActive;
	}

	public void setIsActive(boolean isActive)
	{
		this.isActive = isActive;
	}

	public String getIcon()
	{
		return icon;
	}

	public void setIcon(String icon)
	{
		this.icon = icon;
	}

	public String getSupportCode()
	{
		return supportCode;
	}

	public void setSupportCode(String supportCode)
	{
		this.supportCode = supportCode;
	}

	public boolean isIsUrlRelative()
	{
		return isUrlRelative;
	}

	public void setIsUrlRelative(boolean isUrlRelative)
	{
		this.isUrlRelative = isUrlRelative;
	}

	public boolean isIsInNewTab()
	{
		return isInNewTab;
	}

	public void setIsInNewTab(boolean isInNewTab)
	{
		this.isInNewTab = isInNewTab;
	}

	public String getTenantId()
	{
		return tenantId;
	}

	public void setTenantId(String tenantId)
	{
		this.tenantId = tenantId;
	}

	public List<NameDTO> getNames()
	{
		return names;
	}

	public void setNames(List<NameDTO> names)
	{
		this.names = names;
	}

	public List<ToolTipDTO> getToolTips()
	{
		return toolTips;
	}

	public void setToolTips(List<ToolTipDTO> toolTips)
	{
		this.toolTips = toolTips;
	}

	public List<DescriptionDTO> getDescriptions()
	{
		return descriptions;
	}

	public void setDescriptions(List<DescriptionDTO> descriptions)
	{
		this.descriptions = descriptions;
	}

	public List<MenuItemDTO> getChilds()
	{
		return childs;
	}

	public void setChilds(List<MenuItemDTO> childs)
	{
		this.childs = childs;
	}

	public String getIconSrc()
	{
		return iconSrc;
	}

	public void setIconSrc(String iconSrc)
	{
		this.iconSrc = iconSrc;
	}

	public boolean isHasRight()
	{
		return hasRight;
	}

	public void setHasRight(boolean hasRight)
	{
		this.hasRight = hasRight;
	}

	public AccessCodeDTO getAccessCode()
	{
		return accessCode;
	}

	public void setAccessCode(AccessCodeDTO accessCode)
	{
		this.accessCode = accessCode;
	}

}
