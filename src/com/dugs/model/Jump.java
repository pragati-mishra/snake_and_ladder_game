package com.dugs.model;

public class Jump {
	private int startPoint;
	private int endPoint;
	
	Jump(int startPoint, int endPoint){
		this.setStartPoint(startPoint);
		this.setEndPoint(endPoint);
	}

	public int getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	public int getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}
}
