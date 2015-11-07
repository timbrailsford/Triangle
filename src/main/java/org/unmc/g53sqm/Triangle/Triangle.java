package org.unmc.g53sqm.Triangle;

public class Triangle {
	private int side1;
	private int side2;
	private int side3;
	
	public Triangle() {
		side1 = 0;
		side2 = 0;
		side3 = 0;
	}
	
	public Triangle(int s1, int s2, int s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public String getType()
	{
		String type;
		
		if ((side1 == side2) && (side2 == side3)) type= "Equilateral";
   			else if (( side1 == side2) || (side2 == side3) || (side1 == side3)) type = "Isosceles";
   				else type = "Scalene";

		return type;
	}
}
