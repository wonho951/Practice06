package com.javaex.ex04;

public class Customer extends User {

	//필드
	private int point;
	
	//생성자	
	public Customer(int point) {		
		this.point = point;
	}
	
	
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}

	//메소드 g/s
	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
	
	//메소드-일반
	public void showInfo() {
		System.out.println("#아이디: " + id + ", #패스워드: " + password + ", 이름: " + name + "#포인트:" + point);
	}	// 부모 클래스의 필드를 protected로 선언했기때문에 상속받는 클래스에서 접근 가능. 
		// super. 사용하지 않아도 됨.

}
