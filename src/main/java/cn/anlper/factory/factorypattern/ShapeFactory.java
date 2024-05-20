package cn.anlper.factory.factorypattern;

public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape.equals("circle")) return new CircleShape();
        else if (shape.equals("square")) return new SquareShape();
        else return null;
    }
}
