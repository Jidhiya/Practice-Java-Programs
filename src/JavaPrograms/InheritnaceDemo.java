package JavaPrograms;

public class InheritnaceDemo {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		double area_c = c.area();
		System.out.println("The area of the circle is: " + area_c);
		Cylinder cy = new Cylinder(12,4);
		double area_cy = cy.area();
		System.out.println("The area of the cylinder is: "+area_cy);
		double volume = cy.volume();
		System.out.println("The volume of the cylinder is: " +volume);
		

	}

}
