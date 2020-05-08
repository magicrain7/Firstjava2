package com.yedam.classes;

public class Student {
	//(속성) -> 필드
	String name;//이름
	int age;//나이
	double height;//키
	double weight;//몸무게
	
	//생성자-->instance가 만들어질 때 미리 어떠한 처리를 해두겠다는 뜻(?)
	//필드의 초기값 지정
	Student(){
		System.out.println("생성자 호출.");
	}
	
	Student(String name){
		this.name = name;
	}
	//(기능) -> 메소드
	void study() {
		System.out.println("공부합니다.");
	};//공부한다
	void exercise() {
		
	};//운동한다
	void eat(String str) {
		System.out.println(str + " 을 먹는다.");
	}//밥을 먹는다
}
