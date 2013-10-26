package com.anametrix.mediamind.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DataRow")
public class PlacementPerformanceReportRow {

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
	private String PostClickConversions;
	private String PlacementClassification1;
	private String PlacementClassification2;
	private String PlacementClassification3;
	private String PlacementClassification4;
	private String PlacementClassification5;
	private Date DeliveryDate;

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

	public Integer getCampaignID() {
		return CampaignID;
	}

	public void setCampaignID(Integer campaignID) {
		CampaignID = campaignID;
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

	public String getPlacementClassification1() {
		return PlacementClassification1;
	}

	public void setPlacementClassification1(String placementClassification1) {
		PlacementClassification1 = placementClassification1;
	}

	public String getPlacementClassification2() {
		return PlacementClassification2;
	}

	public void setPlacementClassification2(String placementClassification2) {
		PlacementClassification2 = placementClassification2;
	}

	public String getPlacementClassification3() {
		return PlacementClassification3;
	}

	public void setPlacementClassification3(String placementClassification3) {
		PlacementClassification3 = placementClassification3;
	}

	public String getPlacementClassification4() {
		return PlacementClassification4;
	}

	public void setPlacementClassification4(String placementClassification4) {
		PlacementClassification4 = placementClassification4;
	}

	public String getPlacementClassification5() {
		return PlacementClassification5;
	}

	public void setPlacementClassification5(String placementClassification5) {
		PlacementClassification5 = placementClassification5;
	}

	public Date getDeliveryDate() {
		return DeliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		DeliveryDate = deliveryDate;
	}

}
