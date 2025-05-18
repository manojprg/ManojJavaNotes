package designpattern;

public class CircleShape implements ShapeFactory{
	
	public void draw(int b,int d)
	{
	double area = Math.PI*b*d;	
	System.out.println("the circular area is "+area);
	}
}
