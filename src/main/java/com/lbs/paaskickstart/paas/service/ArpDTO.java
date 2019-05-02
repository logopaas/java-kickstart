package com.lbs.paaskickstart.paas.service;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lbs.controls.datedit.JLbsTimeDuration;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArpDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String code;
	private String gstin;
	private String title;
	private String searchText;
	private String parentLevelARP;
	//private String UpperLevelAssociation;
	private String orgUnit;
	private int arptype;
	private int regtype;
	private String auxCode;
	private String authCode;
	private String tradingGroup;
	private String glconnectionGroup;
	private int approvalStatus;
	private boolean potential;
	private boolean contractor;
	private boolean assignable;
	//private boolean Central;
	private String address;
	private String district;
	private String town;
	private String city;
	private String stateRegion;
	private String country;
	private String district2;
	private String town2;
	private String city2;
	private String stateRegion2;
	private String country2;
	private String zipCode;
	private String phoneNo;
	private String mobilePhoneNo;
	private String mobilePhone;
	private String faxNo;
	private String addressCode;
	private String mailAddress;
	private String webSite;
	private int language;
	private int subscriberStatus;
	private String subscriberAdditionalInfo;
	private String autoPaymentBank;
	private String storeCardNo;
	private String deliveryType;
	private String shippingAgent;
	private String companyCode;
	private String priceGroupCode;
	private int currency;
	private int erateDiff;
	private boolean foreignNational;
	private boolean privateCompany;
	private String tridentificationNo;
	private String taxNo;
	private String taxOffice;
	private String tocode;
	//private String VATNo;
	private String name;
	private String surname;
	private String paymentPlan;
	private double discountRate;
	private int paymentType;
	private String pplanGroupCode;
	private String associationTitle;
	private String registryNumber;
	private String salesRepresentativeCode;
	private boolean eInvoiceUser;
	private int labelInfo;
	private int labelInfoDispatch;
	private String postboxLabel;
	private String senderUnitLabel;
	private int scenario;
	private int scenarioDispatch;
	private int intermediaryFirm;
	private String transitionDate;
	private String transitionDateDispatch;
	private boolean eDispatchUser;
	private String eBusinessCode;
	private int sendingMethod;
	private int batchDispatchReceiptBillingRule;
	private int numberInvoicePrint;
	private int partialOrderShipment;
	private int orderFrequency;
	private int batchOrderBillingRule;
	private int batchDispRecptGenerationRule;
	private int debitCreditTracking;
	private int equalizingDebitCreditBalances;
	//private int ExemptVAT;
	//private int DeductionNotApply;
	private boolean purchaseManagement = true;
	private boolean salesManagement = true;
	private boolean financeManagement = true;
	private boolean importManagement = true;
	private boolean exportManagement = true;
	private boolean tenderManagement = true;
	private String notes;
	private String zipCode2;
	private String postboxDescription;
	private String postboxZipCodeField;
	private String postboxCity;
	private String auxCode2;
	private String auxCode3;
	private String auxCode4;
	private String auxCode5;
	//private String IncomeTaxNumber;
	//private String AN;
	private String region;
	private double distance;
	private String contactType;
	//private String Tour;
	private String priceRank;
	//private boolean CalculateShipmentCost;
	private int sendReminder4DelayPayment;
	private int sendReminder4ShipmentDelays;
	private boolean warnWhenSelecting;
	private boolean insure;
	private String supplierEvaluationSet;
	private String riskGroup;
	private int riskControls;
	private String startHourOne;
	private String endHourOne;
	private JLbsTimeDuration startHour;
	private JLbsTimeDuration endHour;
	private String startHourTwo;
	private String endHourTwo;
	private JLbsTimeDuration startHour2;
	private JLbsTimeDuration endHour2;
	private String startHourThree;
	private String endHourThree;
	private JLbsTimeDuration startHour3;
	private JLbsTimeDuration endHour3;
	private String startHourFour;
	private String endHourFour;
	private JLbsTimeDuration startHour4;
	private JLbsTimeDuration endHour4;
	private String startHourFive;
	private String endHourFive;
	private JLbsTimeDuration startHour5;
	private JLbsTimeDuration endHour5;
	private String startHourSix;
	private String endHourSix;
	private JLbsTimeDuration startHour6;
	private JLbsTimeDuration endHour6;
	private String startHourSeven;
	private String endHourSeven;
	private JLbsTimeDuration startHour7;
	private JLbsTimeDuration endHour7;
	private boolean monday;
	private boolean tuesday;
	private boolean wednesday;
	private boolean thursday;
	private boolean friday;
	private boolean saturday;
	private boolean sunday;
	private boolean monday2;
	private boolean tuesday2;
	private boolean wednesday2;
	private boolean thursday2;
	private boolean friday2;
	private boolean saturday2;
	private boolean sunday2;
	//private boolean SalesOrders;
	//private boolean SalesDispatches;
	//private boolean SalesInvoices;
	//private boolean SalesReturnDispatches;
	//private boolean SalesReturnInvoices;
	//private String ExpenseCode;
	private String pan;
	private int eInvoiceType;
	private int reverseChargeNotApplied;
	private int tdsnotApplied;
	private ArrayList<FormSendDTO> formSend = new ArrayList<FormSendDTO>();


	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getGSTIN()
	{
		return gstin;
	}

	public void setGSTIN(String gSTIN)
	{
		this.gstin = gSTIN;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getSearchText()
	{
		return searchText;
	}

	public void setSearchText(String searchText)
	{
		this.searchText = searchText;
	}

	public String getParentLevelARP()
	{
		return parentLevelARP;
	}

	public void setParentLevelARP(String parentLevelARP)
	{
		this.parentLevelARP = parentLevelARP;
	}

	//	public String getUpperLevelAssociation()
	//	{
	//		return UpperLevelAssociation;
	//	}
	//	public void setUpperLevelAssociation(String upperLevelAssociation)
	//	{
	//		UpperLevelAssociation = upperLevelAssociation;
	//	}
	public String getOrgUnit()
	{
		return orgUnit;
	}

	public void setOrgUnit(String orgUnit)
	{
		this.orgUnit = orgUnit;
	}

	public int getARPType()
	{
		return arptype;
	}

	public void setARPType(int aRPType)
	{
		this.arptype = aRPType;
	}

	public int getRegType()
	{
		return regtype;
	}

	public void setRegType(int regType)
	{
		this.regtype = regType;
	}

	public String getAuxCode()
	{
		return auxCode;
	}

	public void setAuxCode(String auxCode)
	{
		this.auxCode = auxCode;
	}

	public String getAuthCode()
	{
		return authCode;
	}

	public void setAuthCode(String authCode)
	{
		this.authCode = authCode;
	}

	public String getTradingGroup()
	{
		return tradingGroup;
	}

	public void setTradingGroup(String tradingGroup)
	{
		this.tradingGroup = tradingGroup;
	}

	public String getGLConnectionGroup()
	{
		return glconnectionGroup;
	}

	public void setGLConnectionGroup(String gLConnectionGroup)
	{
		this.glconnectionGroup = gLConnectionGroup;
	}

	public int getApprovalStatus()
	{
		return approvalStatus;
	}

	public void setApprovalStatus(int approvalStatus)
	{
		this.approvalStatus = approvalStatus;
	}

	public boolean getPotential()
	{
		return potential;
	}

	public void setPotential(boolean potential)
	{
		this.potential = potential;
	}

	public boolean getContractor()
	{
		return contractor;
	}

	public void setContractor(boolean contractor)
	{
		this.contractor = contractor;
	}

	public boolean getAssignable()
	{
		return assignable;
	}

	public void setAssignable(boolean assignable)
	{
		this.assignable = assignable;
	}

	//	public boolean getCentral()
	//	{
	//		return Central;
	//	}
	//
	//	public void setCentral(boolean central)
	//	{
	//		Central = central;
	//	}
	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getDistrict()
	{
		return district;
	}

	public void setDistrict(String district)
	{
		this.district = district;
	}

	public String getTown()
	{
		return town;
	}

	public void setTown(String town)
	{
		this.town = town;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getStateRegion()
	{
		return stateRegion;
	}

	public void setStateRegion(String stateRegion)
	{
		this.stateRegion = stateRegion;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getZipCode()
	{
		return zipCode;
	}

	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}

	public String getPhoneNo()
	{
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}

	public String getMobilePhoneNo()
	{
		return mobilePhoneNo;
	}

	public void setMobilePhoneNo(String mobilePhoneNo)
	{
		this.mobilePhoneNo = mobilePhoneNo;
	}

	public String getMobilePhone()
	{
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone)
	{
		this.mobilePhone = mobilePhone;
	}

	public String getFaxNo()
	{
		return faxNo;
	}

	public void setFaxNo(String faxNo)
	{
		this.faxNo = faxNo;
	}

	public String getAddressCode()
	{
		return addressCode;
	}

	public void setAddressCode(String addressCode)
	{
		this.addressCode = addressCode;
	}

	public String getMailAddress()
	{
		return mailAddress;
	}

	public void setMailAddress(String mailAddress)
	{
		this.mailAddress = mailAddress;
	}

	public String getWebSite()
	{
		return webSite;
	}

	public void setWebSite(String webSite)
	{
		this.webSite = webSite;
	}

	public int getLanguage()
	{
		return language;
	}

	public void setLanguage(int language)
	{
		this.language = language;
	}

	public int getSubscriberStatus()
	{
		return subscriberStatus;
	}

	public void setSubscriberStatus(int subscriberStatus)
	{
		this.subscriberStatus = subscriberStatus;
	}

	public String getSubscriberAdditionalInfo()
	{
		return subscriberAdditionalInfo;
	}

	public void setSubscriberAdditionalInfo(String subscriberAdditionalInfo)
	{
		this.subscriberAdditionalInfo = subscriberAdditionalInfo;
	}

	public String getAutoPaymentBank()
	{
		return autoPaymentBank;
	}

	public void setAutoPaymentBank(String autoPaymentBank)
	{
		this.autoPaymentBank = autoPaymentBank;
	}

	public String getStoreCardNo()
	{
		return storeCardNo;
	}

	public void setStoreCardNo(String storeCardNo)
	{
		this.storeCardNo = storeCardNo;
	}

	public String getDeliveryType()
	{
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType)
	{
		this.deliveryType = deliveryType;
	}

	public String getShippingAgent()
	{
		return shippingAgent;
	}

	public void setShippingAgent(String shippingAgent)
	{
		this.shippingAgent = shippingAgent;
	}

	public String getCompanyCode()
	{
		return companyCode;
	}

	public void setCompanyCode(String companyCode)
	{
		this.companyCode = companyCode;
	}

	public String getPriceGroupCode()
	{
		return priceGroupCode;
	}

	public void setPriceGroupCode(String priceGroupCode)
	{
		this.priceGroupCode = priceGroupCode;
	}

	public int getCurrency()
	{
		return currency;
	}

	public void setCurrency(int currency)
	{
		this.currency = currency;
	}

	public int getERateDiff()
	{
		return erateDiff;
	}

	public void setERateDiff(int eRateDiff)
	{
		this.erateDiff = eRateDiff;
	}

	public boolean getForeignNational()
	{
		return foreignNational;
	}

	public void setForeignNational(boolean foreignNational)
	{
		this.foreignNational = foreignNational;
	}

	public boolean getPrivateCompany()
	{
		return privateCompany;
	}

	public void setPrivateCompany(boolean privateCompany)
	{
		this.privateCompany = privateCompany;
	}

	public String getTRIdentificationNo()
	{
		return tridentificationNo;
	}

	public void setTRIdentificationNo(String tRIdentificationNo)
	{
		this.tridentificationNo = tRIdentificationNo;
	}

	public String getTaxNo()
	{
		return taxNo;
	}

	public void setTaxNo(String taxNo)
	{
		this.taxNo = taxNo;
	}

	public String getTaxOffice()
	{
		return taxOffice;
	}

	public void setTaxOffice(String taxOffice)
	{
		this.taxOffice = taxOffice;
	}

	public String getTOCode()
	{
		return tocode;
	}

	public void setTOCode(String tOCode)
	{
		this.tocode = tOCode;
	}

	//	public String getVATNo()
	//	{
	//		return VATNo;
	//	}
	//	public void setVATNo(String vATNo)
	//	{
	//		VATNo = vATNo;
	//	}
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getPaymentPlan()
	{
		return paymentPlan;
	}

	public void setPaymentPlan(String paymentPlan)
	{
		this.paymentPlan = paymentPlan;
	}

	public double getDiscountRate()
	{
		return discountRate;
	}

	public void setDiscountRate(double discountRate)
	{
		this.discountRate = discountRate;
	}

	public int getPaymentType()
	{
		return paymentType;
	}

	public void setPaymentType(int paymentType)
	{
		this.paymentType = paymentType;
	}

	public String getPPlanGroupCode()
	{
		return pplanGroupCode;
	}

	public void setPPlanGroupCode(String pPlanGroupCode)
	{
		this.pplanGroupCode = pPlanGroupCode;
	}

	public String getAssociationTitle()
	{
		return associationTitle;
	}

	public void setAssociationTitle(String associationTitle)
	{
		this.associationTitle = associationTitle;
	}

	public String getRegistryNumber()
	{
		return registryNumber;
	}

	public void setRegistryNumber(String registryNumber)
	{
		this.registryNumber = registryNumber;
	}

	public String getSalesRepresentativeCode()
	{
		return salesRepresentativeCode;
	}

	public void setSalesRepresentativeCode(String salesRepresentativeCode)
	{
		this.salesRepresentativeCode = salesRepresentativeCode;
	}

	public boolean isEInvoiceUser()
	{
		return eInvoiceUser;
	}

	public void setEInvoiceUser(boolean eInvoiceUser)
	{
		this.eInvoiceUser = eInvoiceUser;
	}

	public int getLabelInfo()
	{
		return labelInfo;
	}

	public void setLabelInfo(int labelInfo)
	{
		this.labelInfo = labelInfo;
	}

	public String getPostboxLabel()
	{
		return postboxLabel;
	}

	public void setPostboxLabel(String postboxLabel)
	{
		this.postboxLabel = postboxLabel;
	}

	public String getSenderUnitLabel()
	{
		return senderUnitLabel;
	}

	public void setSenderUnitLabel(String senderUnitLabel)
	{
		this.senderUnitLabel = senderUnitLabel;
	}

	public int getScenario()
	{
		return scenario;
	}

	public void setScenario(int scenario)
	{
		this.scenario = scenario;
	}

	public int getIntermediaryFirm()
	{
		return intermediaryFirm;
	}

	public void setIntermediaryFirm(int intermediaryFirm)
	{
		this.intermediaryFirm = intermediaryFirm;
	}

	public String getTransitionDate()
	{
		return transitionDate;
	}

	public void setTransitionDate(String transitionDate)
	{
		this.transitionDate = transitionDate;
	}

	public boolean isEDispatchUser()
	{
		return eDispatchUser;
	}

	public void setEDispatchUser(boolean eDispatchUser)
	{
		this.eDispatchUser = eDispatchUser;
	}

	public String getEBusinessCode()
	{
		return eBusinessCode;
	}

	public void setEBusinessCode(String eBusinessCode)
	{
		this.eBusinessCode = eBusinessCode;
	}

	public int getSendingMethod()
	{
		return sendingMethod;
	}

	public void setSendingMethod(int sendingMethod)
	{
		this.sendingMethod = sendingMethod;
	}

	public int getBatchDispatchReceiptBillingRule()
	{
		return batchDispatchReceiptBillingRule;
	}

	public void setBatchDispatchReceiptBillingRule(int batchDispatchReceiptBillingRule)
	{
		this.batchDispatchReceiptBillingRule = batchDispatchReceiptBillingRule;
	}

	public int getNumberInvoicePrint()
	{
		return numberInvoicePrint;
	}

	public void setNumberInvoicePrint(int numberInvoicePrint)
	{
		this.numberInvoicePrint = numberInvoicePrint;
	}

	public int getPartialOrderShipment()
	{
		return partialOrderShipment;
	}

	public void setPartialOrderShipment(int partialOrderShipment)
	{
		this.partialOrderShipment = partialOrderShipment;
	}

	public int getOrderFrequency()
	{
		return orderFrequency;
	}

	public void setOrderFrequency(int orderFrequency)
	{
		this.orderFrequency = orderFrequency;
	}

	public int getBatchOrderBillingRule()
	{
		return batchOrderBillingRule;
	}

	public void setBatchOrderBillingRule(int batchOrderBillingRule)
	{
		this.batchOrderBillingRule = batchOrderBillingRule;
	}

	public int getBatchDispRecptGenerationRule()
	{
		return batchDispRecptGenerationRule;
	}

	public void setBatchDispRecptGenerationRule(int batchDispRecptGenerationRule)
	{
		this.batchDispRecptGenerationRule = batchDispRecptGenerationRule;
	}

	public int getDebitCreditTracking()
	{
		return debitCreditTracking;
	}

	public void setDebitCreditTracking(int debitCreditTracking)
	{
		this.debitCreditTracking = debitCreditTracking;
	}

	public int getEqualizingDebitCreditBalances()
	{
		return equalizingDebitCreditBalances;
	}

	public void setEqualizingDebitCreditBalances(int equalizingDebitCreditBalances)
	{
		this.equalizingDebitCreditBalances = equalizingDebitCreditBalances;
	}

	public boolean isPurchaseManagement()
	{
		return purchaseManagement;
	}

	public void setPurchaseManagement(boolean purchaseManagement)
	{
		this.purchaseManagement = purchaseManagement;
	}

	public boolean isSalesManagement()
	{
		return salesManagement;
	}

	public void setSalesManagement(boolean salesManagement)
	{
		this.salesManagement = salesManagement;
	}

	public boolean isFinanceManagement()
	{
		return financeManagement;
	}

	public void setFinanceManagement(boolean financeManagement)
	{
		this.financeManagement = financeManagement;
	}

	public boolean isImportManagement()
	{
		return importManagement;
	}

	public void setImportManagement(boolean importManagement)
	{
		this.importManagement = importManagement;
	}

	public boolean isExportManagement()
	{
		return exportManagement;
	}

	public void setExportManagement(boolean exportManagement)
	{
		this.exportManagement = exportManagement;
	}

	public boolean isTenderManagement()
	{
		return tenderManagement;
	}

	public void setTenderManagement(boolean tenderManagement)
	{
		this.tenderManagement = tenderManagement;
	}

	public String getNotes()
	{
		return notes;
	}

	public void setNotes(String notes)
	{
		this.notes = notes;
	}

	public String getZipCode2()
	{
		return zipCode2;
	}

	public void setZipCode2(String zipCode2)
	{
		this.zipCode2 = zipCode2;
	}

	public String getPostboxDescription()
	{
		return postboxDescription;
	}

	public void setPostboxDescription(String postboxDescription)
	{
		this.postboxDescription = postboxDescription;
	}

	public String getPostboxZipCodeField()
	{
		return postboxZipCodeField;
	}

	public void setPostboxZipCodeField(String postboxZipCodeField)
	{
		this.postboxZipCodeField = postboxZipCodeField;
	}

	public String getPostboxCity()
	{
		return postboxCity;
	}

	public void setPostboxCity(String postboxCity)
	{
		this.postboxCity = postboxCity;
	}

	public String getAuxCode2()
	{
		return auxCode2;
	}

	public void setAuxCode2(String auxCode2)
	{
		this.auxCode2 = auxCode2;
	}

	public String getAuxCode3()
	{
		return auxCode3;
	}

	public void setAuxCode3(String auxCode3)
	{
		this.auxCode3 = auxCode3;
	}

	public String getAuxCode4()
	{
		return auxCode4;
	}

	public void setAuxCode4(String auxCode4)
	{
		this.auxCode4 = auxCode4;
	}

	public String getAuxCode5()
	{
		return auxCode5;
	}

	public void setAuxCode5(String auxCode5)
	{
		this.auxCode5 = auxCode5;
	}

	public String getRegion()
	{
		return region;
	}

	public void setRegion(String region)
	{
		this.region = region;
	}

	public double getDistance()
	{
		return distance;
	}

	public void setDistance(double distance)
	{
		this.distance = distance;
	}

	public String getContactType()
	{
		return contactType;
	}

	public void setContactType(String contactType)
	{
		this.contactType = contactType;
	}

	//	public String getTour()
	//	{
	//		return Tour;
	//	}
	//	public void setTour(String tour)
	//	{
	//		Tour = tour;
	//	}
	public String getPriceRank()
	{
		return priceRank;
	}

	public void setPriceRank(String priceRank)
	{
		this.priceRank = priceRank;
	}

	//	public boolean getCalculateShipmentCost()
	//	{
	//		return CalculateShipmentCost;
	//	}
	//
	//	public void setCalculateShipmentCost(boolean calculateShipmentCost)
	//	{
	//		CalculateShipmentCost = calculateShipmentCost;
	//	}
	public int getSendReminder4DelayPayment()
	{
		return sendReminder4DelayPayment;
	}

	public void setSendReminder4DelayPayment(int sendReminder4DelayPayment)
	{
		this.sendReminder4DelayPayment = sendReminder4DelayPayment;
	}

	public int getSendReminder4ShipmentDelays()
	{
		return sendReminder4ShipmentDelays;
	}

	public void setSendReminder4ShipmentDelays(int sendReminder4ShipmentDelays)
	{
		this.sendReminder4ShipmentDelays = sendReminder4ShipmentDelays;
	}

	public boolean getWarnWhenSelecting()
	{
		return warnWhenSelecting;
	}

	public void setWarnWhenSelecting(boolean warnWhenSelecting)
	{
		this.warnWhenSelecting = warnWhenSelecting;
	}

	public String getSupplierEvaluationSet()
	{
		return supplierEvaluationSet;
	}

	public void setSupplierEvaluationSet(String supplierEvaluationSet)
	{
		this.supplierEvaluationSet = supplierEvaluationSet;
	}

	public String getRiskGroup()
	{
		return riskGroup;
	}

	public void setRiskGroup(String riskGroup)
	{
		this.riskGroup = riskGroup;
	}

	public int getRiskControls()
	{
		return riskControls;
	}

	public void setRiskControls(int riskControls)
	{
		this.riskControls = riskControls;
	}

	public String getStartHourOne()
	{
		return startHourOne;
	}

	public void setStartHourOne(String startHourOne)
	{
		this.startHourOne = startHourOne;
	}

	public String getEndHourOne()
	{
		return endHourOne;
	}

	public void setEndHourOne(String endHourOne)
	{
		this.endHourOne = endHourOne;
	}

	public JLbsTimeDuration getStartHour()
	{
		return startHour;
	}

	public void setStartHour(JLbsTimeDuration startHour)
	{
		this.startHour = startHour;
	}

	public JLbsTimeDuration getEndHour()
	{
		return endHour;
	}

	public void setEndHour(JLbsTimeDuration endHour)
	{
		this.endHour = endHour;
	}

	public String getStartHourTwo()
	{
		return startHourTwo;
	}

	public void setStartHourTwo(String startHourTwo)
	{
		this.startHourTwo = startHourTwo;
	}

	public String getEndHourTwo()
	{
		return endHourTwo;
	}

	public void setEndHourTwo(String endHourTwo)
	{
		this.endHourTwo = endHourTwo;
	}

	public JLbsTimeDuration getStartHour2()
	{
		return startHour2;
	}

	public void setStartHour2(JLbsTimeDuration startHour2)
	{
		this.startHour2 = startHour2;
	}

	public JLbsTimeDuration getEndHour2()
	{
		return endHour2;
	}

	public void setEndHour2(JLbsTimeDuration endHour2)
	{
		this.endHour2 = endHour2;
	}

	public String getStartHourThree()
	{
		return startHourThree;
	}

	public void setStartHourThree(String startHourThree)
	{
		this.startHourThree = startHourThree;
	}

	public String getEndHourThree()
	{
		return endHourThree;
	}

	public void setEndHourThree(String endHourThree)
	{
		this.endHourThree = endHourThree;
	}

	public JLbsTimeDuration getStartHour3()
	{
		return startHour3;
	}

	public void setStartHour3(JLbsTimeDuration startHour3)
	{
		this.startHour3 = startHour3;
	}

	public JLbsTimeDuration getEndHour3()
	{
		return endHour3;
	}

	public void setEndHour3(JLbsTimeDuration endHour3)
	{
		this.endHour3 = endHour3;
	}

	public String getStartHourFour()
	{
		return startHourFour;
	}

	public void setStartHourFour(String startHourFour)
	{
		this.startHourFour = startHourFour;
	}

	public String getEndHourFour()
	{
		return endHourFour;
	}

	public void setEndHourFour(String endHourFour)
	{
		this.endHourFour = endHourFour;
	}

	public JLbsTimeDuration getStartHour4()
	{
		return startHour4;
	}

	public void setStartHour4(JLbsTimeDuration startHour4)
	{
		this.startHour4 = startHour4;
	}

	public JLbsTimeDuration getEndHour4()
	{
		return endHour4;
	}

	public void setEndHour4(JLbsTimeDuration endHour4)
	{
		this.endHour4 = endHour4;
	}

	public String getStartHourFive()
	{
		return startHourFive;
	}

	public void setStartHourFive(String startHourFive)
	{
		this.startHourFive = startHourFive;
	}

	public String getEndHourFive()
	{
		return endHourFive;
	}

	public void setEndHourFive(String endHourFive)
	{
		this.endHourFive = endHourFive;
	}

	public JLbsTimeDuration getStartHour5()
	{
		return startHour5;
	}

	public void setStartHour5(JLbsTimeDuration startHour5)
	{
		this.startHour5 = startHour5;
	}

	public JLbsTimeDuration getEndHour5()
	{
		return endHour5;
	}

	public void setEndHour5(JLbsTimeDuration endHour5)
	{
		this.endHour5 = endHour5;
	}

	public String getStartHourSix()
	{
		return startHourSix;
	}

	public void setStartHourSix(String startHourSix)
	{
		this.startHourSix = startHourSix;
	}

	public String getEndHourSix()
	{
		return endHourSix;
	}

	public void setEndHourSix(String endHourSix)
	{
		this.endHourSix = endHourSix;
	}

	public JLbsTimeDuration getStartHour6()
	{
		return startHour6;
	}

	public void setStartHour6(JLbsTimeDuration startHour6)
	{
		this.startHour6 = startHour6;
	}

	public JLbsTimeDuration getEndHour6()
	{
		return endHour6;
	}

	public void setEndHour6(JLbsTimeDuration endHour6)
	{
		this.endHour6 = endHour6;
	}

	public String getStartHourSeven()
	{
		return startHourSeven;
	}

	public void setStartHourSeven(String startHourSeven)
	{
		this.startHourSeven = startHourSeven;
	}

	public String getEndHourSeven()
	{
		return endHourSeven;
	}

	public void setEndHourSeven(String endHourSeven)
	{
		this.endHourSeven = endHourSeven;
	}

	public JLbsTimeDuration getStartHour7()
	{
		return startHour7;
	}

	public void setStartHour7(JLbsTimeDuration startHour7)
	{
		this.startHour7 = startHour7;
	}

	public JLbsTimeDuration getEndHour7()
	{
		return endHour7;
	}

	public void setEndHour7(JLbsTimeDuration endHour7)
	{
		this.endHour7 = endHour7;
	}

	public boolean getMonday()
	{
		return monday;
	}

	public void setMonday(boolean monday)
	{
		this.monday = monday;
	}

	public boolean getTuesday()
	{
		return tuesday;
	}

	public void setTuesday(boolean tuesday)
	{
		this.tuesday = tuesday;
	}

	public boolean getWednesday()
	{
		return wednesday;
	}

	public void setWednesday(boolean wednesday)
	{
		this.wednesday = wednesday;
	}

	public boolean getThursday()
	{
		return thursday;
	}

	public void setThursday(boolean thursday)
	{
		this.thursday = thursday;
	}

	public boolean getFriday()
	{
		return friday;
	}

	public void setFriday(boolean friday)
	{
		this.friday = friday;
	}

	public boolean getSaturday()
	{
		return saturday;
	}

	public void setSaturday(boolean saturday)
	{
		this.saturday = saturday;
	}

	public boolean getSunday()
	{
		return sunday;
	}

	public void setSunday(boolean sunday)
	{
		this.sunday = sunday;
	}

	public boolean getMonday2()
	{
		return monday2;
	}

	public void setMonday2(boolean monday2)
	{
		this.monday2 = monday2;
	}

	public boolean getTuesday2()
	{
		return tuesday2;
	}

	public void setTuesday2(boolean tuesday2)
	{
		this.tuesday2 = tuesday2;
	}

	public boolean getWednesday2()
	{
		return wednesday2;
	}

	public void setWednesday2(boolean wednesday2)
	{
		this.wednesday2 = wednesday2;
	}

	public boolean getThursday2()
	{
		return thursday2;
	}

	public void setThursday2(boolean thursday2)
	{
		this.thursday2 = thursday2;
	}

	public boolean getFriday2()
	{
		return friday2;
	}

	public void setFriday2(boolean friday2)
	{
		this.friday2 = friday2;
	}

	public boolean getSaturday2()
	{
		return saturday2;
	}

	public void setSaturday2(boolean saturday2)
	{
		this.saturday2 = saturday2;
	}

	public boolean getSunday2()
	{
		return sunday2;
	}

	public void setSunday2(boolean sunday2)
	{
		this.sunday2 = sunday2;
	}

	public int getLabelInfoDispatch()
	{
		return labelInfoDispatch;
	}

	public void setLabelInfoDispatch(int labelInfoDispatch)
	{
		this.labelInfoDispatch = labelInfoDispatch;
	}

	public int getScenarioDispatch()
	{
		return scenarioDispatch;
	}

	public void setScenarioDispatch(int scenarioDispatch)
	{
		this.scenarioDispatch = scenarioDispatch;
	}

	public String getTransitionDateDispatch()
	{
		return transitionDateDispatch;
	}

	public void setTransitionDateDispatch(String transitionDateDispatch)
	{
		this.transitionDateDispatch = transitionDateDispatch;
	}

	public String getPAN()
	{
		return pan;
	}

	public void setPAN(String pAN)
	{
		this.pan = pAN;
	}

	public int isEInvoiceType()
	{
		return eInvoiceType;
	}

	public void setEInvoiceType(int eInvoiceType)
	{
		this.eInvoiceType = eInvoiceType;
	}

	public int getReverseChargeNotApplied()
	{
		return reverseChargeNotApplied;
	}

	public void setReverseChargeNotApplied(int reverseChargeNotApplied)
	{
		this.reverseChargeNotApplied = reverseChargeNotApplied;
	}

	public int getTDSNotApplied()
	{
		return tdsnotApplied;
	}

	public void setTDSNotApplied(int tDSNotApplied)
	{
		this.tdsnotApplied = tDSNotApplied;
	}

	/**
	 * @return the district2
	 */
	public String getDistrict2()
	{
		return district2;
	}

	/**
	 * @param district2 the district2 to set
	 */
	public void setDistrict2(String district2)
	{
		this.district2 = district2;
	}

	/**
	 * @return the town2
	 */
	public String getTown2()
	{
		return town2;
	}

	/**
	 * @param town2 the town2 to set
	 */
	public void setTown2(String town2)
	{
		this.town2 = town2;
	}

	/**
	 * @return the city2
	 */
	public String getCity2()
	{
		return city2;
	}

	/**
	 * @param city2 the city2 to set
	 */
	public void setCity2(String city2)
	{
		this.city2 = city2;
	}

	/**
	 * @return the stateRegion2
	 */
	public String getStateRegion2()
	{
		return stateRegion2;
	}

	/**
	 * @param stateRegion2 the stateRegion2 to set
	 */
	public void setStateRegion2(String stateRegion2)
	{
		this.stateRegion2 = stateRegion2;
	}

	/**
	 * @return the country2
	 */
	public String getCountry2()
	{
		return country2;
	}

	/**
	 * @param country2 the country2 to set
	 */
	public void setCountry2(String country2)
	{
		this.country2 = country2;
	}

	public ArrayList<FormSendDTO> getFormSend()
	{
		return formSend;
	}

	public void setFormSend(ArrayList<FormSendDTO> formSend)
	{
		this.formSend = formSend;
	}
	

	public boolean isInsure()
	{
		return insure;
	}

	public void setInsure(boolean insure)
	{
		this.insure = insure;
	}
}

