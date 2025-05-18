package designpattern;

public class RectangleShape implements ShapeFactory {
	public void draw(int b,int d)
	{
	int area=b*d;	
	System.out.println("the rectangular area is "+area);
	}

}
