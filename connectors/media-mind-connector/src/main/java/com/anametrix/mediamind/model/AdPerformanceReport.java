package com.anametrix.mediamind.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PerformanceReport")
public class AdPerformanceReport {
	
	@XmlElement(name="DataRow")
	private List<AdPerformanceReportRow> dataRowList = new ArrayList<AdPerformanceReportRow>();

	public List<AdPerformanceReportRow> getDataRowList() {
		return dataRowList;
	}

	public void setDataRowList(List<AdPerformanceReportRow> dataRowList) {
		this.dataRowList = dataRowList;
	}
	
	
}
