package com.javaex.ex03;

public class Shape {
	
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {	// 상속받는 자식클래스가 있기때문에 디폴트 생성자 생성 하지 않을시에 
	}					// 자식클래스의 생성자 생성시 문제 생긴다.
	
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

