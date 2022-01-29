public class FactoryPatternDemo{
	ShapeFactory obj = new ShapeFactory();
	
	Shape obj1 = obj.getShape("Rect");
	obj1.draw();
	Shape obj2 = obj.getShape("Circle");
	obj2.draw();
	Shape obj3 = obj.getShape("Square");
	obj3.draw();
}
class ShapeFactory{
	public Shape getShape(String shapeType){
		if(shapeType==null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("Rect")){
			return new Rect();
		}
		else if(shapeType.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("Square")){
			return new Square();
		}
		return null;
	}
}
interface Shape{
	public void draw();
}
class Rect extends Shape{
	public void draw(){
		System.out.println("Rectangle() method");
	}
}
class Square extends Shape{
	public void draw(){
		System.out.println("Square() method");
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("Circle() method");
	}
}