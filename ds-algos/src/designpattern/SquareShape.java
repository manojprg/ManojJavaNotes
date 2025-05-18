package designpattern;

public class SquareShape implements ShapeFactory {

public void draw(int b,int d)
{
int area=b*d;	
System.out.println("the square area is "+area);
}
}
