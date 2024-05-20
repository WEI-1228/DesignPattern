package cn.anlper.factory.factorypattern;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.printShape();
        Shape square = shapeFactory.getShape("square");
        square.printShape();
    }
}
