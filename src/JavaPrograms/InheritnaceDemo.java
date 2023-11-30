package JavaPrograms;

public class InheritnaceDemo {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		double area_c = c.area();
		System.out.println(area_c);
		Cylinder cy = new Cylinder(12,4);
		double area_cy = cy.area();
		System.out.println(area_cy);
		double volume = cy.volume();
		System.out.println(volume);
		

	}

}
