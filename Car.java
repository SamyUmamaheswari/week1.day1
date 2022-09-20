package week1.day1;

public class Car {
public void driveCar() {
System.out.println("Car driving");
}
public void applyBrake() {
	System.out.println("applied Brake");
}
public void soundHorn() {
	System.out.println("Press the Horn");
}
public void isPuncture() {
	System.out.println("car is puncture");
}
public static void main(String[] args) {
	Car obj = new Car();
	obj.driveCar();
	obj.applyBrake();
	obj.soundHorn();
	obj.isPuncture();
}
}
