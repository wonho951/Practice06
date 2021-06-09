package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성
	public void service(String state) {
		if (state.equals("낮")) {  // Base 상속받고 있으므로 "낮"입력시 상속받은 MyBase에 있는 day() 내용 출력
				day();
		} else if (state.equals("밤")){ // Base 상속받고 있으므로 "낮"입력시 상속받은 MyBase에 있는 day() 내용 출력
			night();
		}else { // Base를 상속받지만 Base에는 없는 내용이므로 MyBase에 추가해서 출력.
			afterNoon();
		}
	}

	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}
	
	public void afterNoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
	
	public void night() {
		System.out.println("밤에는 숙면");
	}
	
}

