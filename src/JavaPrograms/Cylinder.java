package JavaPrograms;

public class Cylinder extends Circle {
	int height;
	
	Cylinder(int r, int h){
		super(r);
		System.out.println("This is a parameterized constructor of Cylinder class");
		this.height = h;
	}
	
	public double volume() {
		return Math.PI*this.radius*this.radius*this.height;
	}
	
	public double area() {
		return 2*Math.PI*this.radius*(this.radius+this.height);
	}

}
