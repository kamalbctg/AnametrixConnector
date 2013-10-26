package api.eyeblaster.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PerformanceReport")
public class PerformanceReport {
	@XmlElement(name="DataRow")
	private List<DataRow> dataRowList = new ArrayList<DataRow>();

	public List<DataRow> getDataRowList() {
		return dataRowList;
	}

	public void setDataRowList(List<DataRow> dataRowList) {
		this.dataRowList = dataRowList;
	}
	
	
}
