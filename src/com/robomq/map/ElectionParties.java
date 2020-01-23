package com.robomq.map;

public class ElectionParties implements Comparable {
	
	
	private int electionId;
	private String name;
	private String electionDate;
	private String district;
	private String consistuency;
	private String countingDate;
	
	public ElectionParties(int electionId, String name, String electionDate, String district, String consistuency,
			String countingDate) {
		super();
		this.electionId = electionId;
		this.name = name;
		this.electionDate = electionDate;
		this.district = district;
		this.consistuency = consistuency;
		this.countingDate = countingDate;
		
	}

	public int getElectionId() {
		return electionId;
	}

	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getElectionDate() {
		return electionDate;
	}

	public void setElectionDate(String electionDate) {
		this.electionDate = electionDate;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getConsistuency() {
		return consistuency;
	}

	public void setConsistuency(String consistuency) {
		this.consistuency = consistuency;
	}

	public String getCountingDate() {
		return countingDate;
	}

	public void setCountingDate(String countingDate) {
		this.countingDate = countingDate;
	}
	
	public String toString() {
		return "\n Election id:"+electionId+" Name : "+name+" Election date: "+electionDate+" District: "+district+" Consistuency: "+consistuency+" Counting date: "+countingDate;
	}
	
	public int compareTo(Object o) {
		
		ElectionParties e=(ElectionParties)o;
		//return this.id-e.id;
		return this.name.compareTo(e.name);
	}
	

}
