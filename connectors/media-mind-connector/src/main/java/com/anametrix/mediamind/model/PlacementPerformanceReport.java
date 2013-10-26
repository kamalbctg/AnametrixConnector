package com.anametrix.mediamind.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PerformanceReport")
public class PlacementPerformanceReport {
	@XmlElement(name="DataRow")
	private List<PlacementPerformanceReportRow> dataRowList = new ArrayList<PlacementPerformanceReportRow>();

	public List<PlacementPerformanceReportRow> getDataRowList() {
		return dataRowList;
	}

	public void setDataRowList(List<PlacementPerformanceReportRow> dataRowList) {
		this.dataRowList = dataRowList;
	}
	
	
}
