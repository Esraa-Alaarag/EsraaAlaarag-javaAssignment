package com.cognizant.shapes;

public class Shape {
	public int numberOfSides ;
    public int sideLength;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Shape shape_1 = new Shape(3);
		 shape_1.calculateShapeArea(12);
		 shape_1.calculateShapeAreaSwitch(12);
		 
		 Shape shape_2 = new Shape(4);
		 shape_2.calculateShapeArea(15);
		 shape_2.calculateShapeAreaSwitch(15);
		 
		 Shape shape_3 = new Shape(5);
		 shape_3.calculateShapeArea(15);
		 shape_3.calculateShapeAreaSwitch(15);

	}
	public Shape(int numberOfSides )
	{
		this.numberOfSides = numberOfSides ;
		
	}
	public void calculateShapeArea (int sideLength) 
	 {
		 Circle circle = new Circle();
		 Triangle triangle = new Triangle();
		 Square square = new Square();
		 if(this.numberOfSides==1)
			 System.out.println(circle.calculateArea(sideLength)); 
		 else if(numberOfSides==4)
			 System.out.println(square.calculateArea(sideLength));
		 else if(numberOfSides==3)
			 System.out.println(triangle.calculateArea(sideLength));
		 else 
			 System.out.println("No Shapes Present");
			 
	 }
	public void calculateShapeAreaSwitch (int sideLength) 
	 {
		 Circle circle = new Circle();
		 Triangle triangle = new Triangle();
		 Square square = new Square();
		 switch (this.numberOfSides) {
		 case 1:
			 System.out.println(circle.calculateArea(sideLength)); 
			 break; 
		 case 4 :
			 System.out.println(square.calculateArea(sideLength));
			 break; 
		 case 3 :
			 System.out.println(triangle.calculateArea(sideLength));
			 break; 
		 default : 
			 System.out.println("No Shapes Present");
			 
	 }
		 
	 }

}





