package JavaPrograms;

public class Circle {
	int radius;
	
	Circle(){
		System.out.println("This is a non parameterized constructor of Circle class");
	}
	Circle(int r){
		System.out.println("This is a parameterized constructor of Circle class");
	}
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
	
}
