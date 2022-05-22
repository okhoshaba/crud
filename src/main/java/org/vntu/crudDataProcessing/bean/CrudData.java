package org.vntu.crudDataProcessing.bean;

public class CrudData {
	
	int id;
	String timeStamp;	
	long responseTime;
	
	public CrudData () {
		super();
	}

	public CrudData(int countId, String timeStamp, long responseTime) {
		super();
		this.id = countId;
		this.timeStamp = timeStamp;
		this.responseTime = responseTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public long getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(long responseTime) {
		this.responseTime = responseTime;
	}	
}
