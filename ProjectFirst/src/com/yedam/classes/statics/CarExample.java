package com.yedam.classes.statics;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setSpeed(-10);//c1.speed= -10;
		//c1.setSpeed() = -10;->private값 대입 불가
		System.out.println("속도: "+c1.getSpeed());
		
		c1.setSpeed(60);
		if(!c1.isStop()) {
			c1.setStop(true);//stop:true, speed:0
		}
		System.out.println("현재속도: "+c1.getSpeed());
		
	}
}
