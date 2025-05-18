package designpattern;

public class Factory {

	public ShapeFactory getShape(String type) {

		if ("CIRCLE".equals(type)) {
			return new CircleShape();
		} else if ("RECTANGLE".equals(type)) {
			return new CircleShape();
		} else if ("SQUARE".equals(type)) {
			return new CircleShape();
		}
		return null;
	}
}
