package com.javaex.ex05;

public class Depart extends Employee {

	 //코드작성

	//필드
	private String department; 

	//생성자	
	public Depart() { // 디폴트 생성자 있는편이 좋음
	}
	public Depart(String department) {
		this.department = department;
	}
	
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}



	//메소드 g/s
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	//메소드-일반
	public void showInformation() {
		System.out.println("이름:" + super.getName() + " 연봉:" + super.getSalary() + " 부서:" + department);
	}
}
