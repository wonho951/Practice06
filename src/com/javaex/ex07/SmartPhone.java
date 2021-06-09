package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
        if("앱".equals(str)){  // "앱" 입력시  app();에 있는 "앱실행"출력 
            app();
        }else {
        	super.execute(str); // 그 외에 경우 super. 을 사용해서 phone.java에 있는 str 내용 불러와서 "통화가능시작"출력
        }
    }
 
    //메소드작성
    public void app() {
        System.out.println("앱실행");
    }
    //메소드작성
    public void playMusic() {
        System.out.println("다운로드해서 음악재생");
    }
    
    
}
