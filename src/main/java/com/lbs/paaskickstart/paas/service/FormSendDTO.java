package com.lbs.paaskickstart.paas.service;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FormSendDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int transactionType;
	private String relatedPersonsName;
	private String relatedPersonSurname;
	private String eMailAddress;
	private String faxNo;

	
	public int getTransactionType()
	{
		return transactionType;
	}
	public void setTransactionType(int transactionType)
	{
		this.transactionType = transactionType;
	}
	public String getRelatedPersonsName()
	{
		return relatedPersonsName;
	}
	public void setRelatedPersonsName(String relatedPersonsName)
	{
		this.relatedPersonsName = relatedPersonsName;
	}
	public String getRelatedPersonSurname()
	{
		return relatedPersonSurname;
	}
	public void setRelatedPersonSurname(String relatedPersonSurname)
	{
		this.relatedPersonSurname = relatedPersonSurname;
	}

	public String getEMailAddress()
	{
		return eMailAddress;
	}

	public void setEMailAddress(String eMailAddress)
	{
		this.eMailAddress = eMailAddress;
	}
	public String getFaxNo()
	{
		return faxNo;
	}
	public void setFaxNo(String faxNo)
	{
		this.faxNo = faxNo;
	}
	

}
