package com.cognizant.shapes;

public class Circle {
	public double radius;
	public double pi=3.14;
	public String calculateArea(int radius) {
		double area= (radius * radius * pi);
		return "The Area of the Circle is "+area;
 
	}

}
