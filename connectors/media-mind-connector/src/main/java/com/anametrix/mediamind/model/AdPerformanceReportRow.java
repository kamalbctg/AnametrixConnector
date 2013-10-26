package com.anametrix.mediamind.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DataRow")
public class AdPerformanceReportRow {
	
	private Integer AdID;
	private Integer PlacementID;
	private Integer PackageID;
	private Integer SiteID;	 
	private Integer AdvertiserID;
	private Integer CampaignID;	
	private String Impressions;
	private String Clicks;
	private String CTR;
	private String MediaCost;
	private String TotalRevenue;
	private String TotalInteractions;
	private String ImpressionsWithDwell;
	private String AvgDwellTime;
	private String VisibleImpressions;
	private String NonVisibleImpressions;
	private String TotalConversion;
	private String PostImpressionsConversions;
	private String PostClickConversions	;
	private String AdClassification1;
	private String AdClassification2;
	private String AdClassification3;
	private String AdClassification4;
	private String AdClassification5;
	private Date DeliveryDate;
	
	public Integer getAdID() {
		return AdID;
	}
	public void setAdID(Integer adID) {
		AdID = adID;
	}
	public Integer getPlacementID() {
		return PlacementID;
	}
	public void setPlacementID(Integer placementID) {
		PlacementID = placementID;
	}
	public Integer getPackageID() {
		return PackageID;
	}
	public void setPackageID(Integer packageID) {
		PackageID = packageID;
	}
	public Integer getSiteID() {
		return SiteID;
	}
	public void setSiteID(Integer siteID) {
		SiteID = siteID;
	}
	public Integer getAdvertiserID() {
		return AdvertiserID;
	}
	public void setAdvertiserID(Integer advertiserID) {
		AdvertiserID = advertiserID;
	}
	public String getImpressions() {
		return Impressions;
	}
	public void setImpressions(String impressions) {
		Impressions = impressions;
	}
	public String getClicks() {
		return Clicks;
	}
	public void setClicks(String clicks) {
		Clicks = clicks;
	}
	public String getCTR() {
		return CTR;
	}
	public void setCTR(String cTR) {
		CTR = cTR;
	}
	public String getMediaCost() {
		return MediaCost;
	}
	public void setMediaCost(String mediaCost) {
		MediaCost = mediaCost;
	}
	public String getTotalRevenue() {
		return TotalRevenue;
	}
	public void setTotalRevenue(String totalRevenue) {
		TotalRevenue = totalRevenue;
	}
	public String getTotalInteractions() {
		return TotalInteractions;
	}
	public void setTotalInteractions(String totalInteractions) {
		TotalInteractions = totalInteractions;
	}
	public String getImpressionsWithDwell() {
		return ImpressionsWithDwell;
	}
	public void setImpressionsWithDwell(String impressionsWithDwell) {
		ImpressionsWithDwell = impressionsWithDwell;
	}
	public String getAvgDwellTime() {
		return AvgDwellTime;
	}
	public void setAvgDwellTime(String avgDwellTime) {
		AvgDwellTime = avgDwellTime;
	}
	public String getVisibleImpressions() {
		return VisibleImpressions;
	}
	public void setVisibleImpressions(String visibleImpressions) {
		VisibleImpressions = visibleImpressions;
	}
	public String getNonVisibleImpressions() {
		return NonVisibleImpressions;
	}
	public void setNonVisibleImpressions(String nonVisibleImpressions) {
		NonVisibleImpressions = nonVisibleImpressions;
	}
	public String getTotalConversion() {
		return TotalConversion;
	}
	public void setTotalConversion(String totalConversion) {
		TotalConversion = totalConversion;
	}
	public String getPostImpressionsConversions() {
		return PostImpressionsConversions;
	}
	public void setPostImpressionsConversions(String postImpressionsConversions) {
		PostImpressionsConversions = postImpressionsConversions;
	}
	public String getPostClickConversions() {
		return PostClickConversions;
	}
	public void setPostClickConversions(String postClickConversions) {
		PostClickConversions = postClickConversions;
	}
	public Integer getCampaignID() {
		return CampaignID;
	}
	public void setCampaignID(Integer campaignID) {
		CampaignID = campaignID;
	}
	public String getAdClassification1() {
		return AdClassification1;
	}
	public void setAdClassification1(String adClassification1) {
		AdClassification1 = adClassification1;
	}
	public String getAdClassification2() {
		return AdClassification2;
	}
	public void setAdClassification2(String adClassification2) {
		AdClassification2 = adClassification2;
	}
	public String getAdClassification3() {
		return AdClassification3;
	}
	public void setAdClassification3(String adClassification3) {
		AdClassification3 = adClassification3;
	}
	public String getAdClassification4() {
		return AdClassification4;
	}
	public void setAdClassification4(String adClassification4) {
		AdClassification4 = adClassification4;
	}
	public String getAdClassification5() {
		return AdClassification5;
	}
	public void setAdClassification5(String adClassification5) {
		AdClassification5 = adClassification5;
	}
	public Date getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	
	
	

}
