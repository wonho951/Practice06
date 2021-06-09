package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		/*
		 shape의 디폴트 생성자 사용 
		 */
		
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		/*
		 shape의 디폴트 생성자 사용 후 Triangle 디폴트 생성자 사용		 
		 */
				
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		/*
		 shape의 디폴트 생성자 사용 후 Triangle(2)  생성자 사용
		 */
				
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		/*
		 shape(2) 생성자 사용 후 Triangle(4)  생성자 사용
		 */
	}

	/*
	Shape s1 = new Shape("파랑", "파랑"); 
	실행시 부모에 있는 생성자가 먼저 일함
	
	Triangle t1 = new Triangle(); 
	실행시 부모에 있는 생성자 먼저 일하고 자식에 있는 생성자가 뒤에 한번 더 일함
	
	Triangle t2 = new Triangle(3, 4); 
	실행시 일치하는게 없으므로 부모의 디폴트 생성자가 먼저 실행되고 그 후에 자식에 있는 (2)개짜리 생성자가 일함
	
	Shape t3 = new Triangle("빨강", "빨강", 15, 15); 
	실행시 부모에 있는 (2)개짜리 생성자가 먼저 일하고 자식에 있는 (4)개짜리 생성자가 일함
	*/
	
}

