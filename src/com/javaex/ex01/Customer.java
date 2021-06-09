package com.javaex.ex01;

public class Customer extends Person{	//상속받으려면 extends사용해준다.
	

	//필드
	private int cNo;
	private int point;
	
	//생성자
	public Customer() {
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}
	
	
	//메소드 g/s
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드-일반
	
	public void showInfo() {
		System.out.println("#이름:" + super.getName() + ", #핸드폰" + super.getHp() + ", #고객번호:" + cNo + ", 포인트점수:" + point);
	} //부모의 필드가 private로 선언 되었으므로 super. 사용해서 getter값 불러온다.
		//이렇게 하기 싫으면 자식한테만 필드 열어줄수 있도록 private가 아닌
		//protected 선언해주면된다.
	
	
}
