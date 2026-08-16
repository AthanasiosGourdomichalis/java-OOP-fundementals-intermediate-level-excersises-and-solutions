class Shape {
	
	private String color;
	
	Shape (String color) {
		this.color = color;
	}
	
	public String toString () {
		return "Color " + color;
	}
}

class Rectangle extends Shape {
	
	private double length;
	private double width;

	Rectangle(String color, double length, double width){
		super(color);
		this.length = length;
		this.width=width;
	}


	public String toString(){
		return super.toString() + " length " + length + " width " + width;
	}

	double area(){
		return length*width;
	}

}

class Triangle extends Shape {
	
	private double base;
	private double height;

	Triangle(String color, double base, double height){
		super(color);
		this.base = base;
		this.height = height;

	}

	public String toString(){
		return super.toString() + " base " + base + " height " + height;
	}

	double area(){
		return (base*height)/2;
	}

}

class App5 {
	
    public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle("RED", 2.0, 3.0);
		
		Triangle t1 = new Triangle ("YELLOW", 2.0, 3.0);
		
		System.out.println ("Rectangle: " + r1);
		System.out.println ("Area of Rectangle: " + r1.area());
		
		System.out.println ("Triangle: " + t1);
		System.out.println ("Area of Triangle: " + t1.area());
		
    }
}

