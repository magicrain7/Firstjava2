package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "Hong";
		stu.age = 20;
		stu.height = 178.4;
		stu.weight = 70.5;
		stu.study();
		stu.eat("banana");

		//System.out.println(stu.name + ", " + stu.age + "세");
		
		Student stu1 = new Student();
		stu1.name = "Park";
		stu1.age = 30;
		stu1.height = 178.4;
		stu1.weight = 70.5;
		stu1.eat("사과");

		//System.out.println(stu1.name + ", " + stu1.age + "세");

		Student stu2 = new Student("Choi");

		stu2.age = 40;
		stu2.height = 168.4;
		stu2.weight = 60.5;
		stu2.eat("수박");

		//System.out.println(stu2.name + ", " + stu2.age + "세");

		Student[] s1 = new Student[3];//속성과 메소드의 집합체인 클래스를 담는 배열
		//s1[0] = "Hello"; //error
		//s1[0].name = "Hong";//error 생성자를 이용하지 않았기때문에 name이외 쓰려고하면 오류
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;

		String inputStr = "Choi";//반복 실행. inputStr 비교해서 같은거만 출력

		for(int i=0; i<s1.length; i++) {
			if(inputStr.equals(s1[i].name)) {
				System.out.println(s1[i].name + "/" + s1[i].age);
			}
		}
		/*for (Student stud : s1) {
			System.out.println(stud.name + "/" + stud.age);
		}
		*/
	}//end of main
}
