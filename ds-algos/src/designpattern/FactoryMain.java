package designpattern;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory obj = new Factory();
		ShapeFactory circle = obj.getShape("CIRCLE");
		circle.draw(0, 0);
		ShapeFactory rect = obj.getShape("RECTANGLE");
		rect.draw(0, 0);
		ShapeFactory sq = obj.getShape("SQUARE");
		sq.draw(0, 0);

	}

}
