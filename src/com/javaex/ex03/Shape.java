package com.javaex.ex03;

public class Shape {
	
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}


	//메소드 g/s
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	
}

