package com.cognizant.shapes;

public class Triangle {
	public double side;
	public String calculateArea(int sides) {
		double area = 0.433 * sides  * sides ;
		return "The Area of the Triangle is "+area;
	}
 
}
