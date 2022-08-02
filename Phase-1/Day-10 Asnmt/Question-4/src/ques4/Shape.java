package ques4;

public abstract class Shape {
	public abstract int rectangleArea(int length, int breadth);
	public abstract int squareArea(int side);
	public abstract double circleArea(int radius);
}
class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		int area = length*breadth;
		return area;
	}

	@Override
	public int squareArea(int side) {
		int area = side*side;
		return area;
	}

	@Override
	public double circleArea(int radius) {
		double area = 3.14*radius*radius;
		return area;
	}
	
}
