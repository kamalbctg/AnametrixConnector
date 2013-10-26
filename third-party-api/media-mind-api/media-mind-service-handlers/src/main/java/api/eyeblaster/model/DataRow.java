package api.eyeblaster.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DataRow")
public class DataRow {
	private Integer AdID;
	private Integer PlacementID;
	private Integer PackageID;
	private Integer SiteID;	 
	private Integer AdvertiserID;
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
	
	
	

}
