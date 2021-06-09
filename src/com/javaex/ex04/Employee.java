package com.javaex.ex04;

public class Employee extends User {

	//필드
	private int salary;
	
	//생성자	
	public Employee() {
	}
	
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	//메소드 g/s
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	//메소드-일반
	public void showInfo() {
		System.out.println("#아이디: " + id + ", #패스워드: " + password + ", 이름: " + name + ", #월급:" + salary);
		System.out.println("운영자의 월급은 " + salary + "입니다.");
	}	// 부모 클래스의 필드를 protected로 선언했기때문에 상속받는 클래스에서 접근 가능. 
		// super. 사용하지 않아도 됨.



	
}
