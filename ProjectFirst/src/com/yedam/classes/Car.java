package com.yedam.classes;

public class Car {
	String model;
	int maxSpeed;
	int speed;
	
	//생성자
	Car(){
		maxSpeed = 100;
	}
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Car(String model) {
		this.model = model;
	}
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	//method
	void showInfo() {
		System.out.println("모델명: "+model+", 최고속도: "+maxSpeed);

	}
	
}