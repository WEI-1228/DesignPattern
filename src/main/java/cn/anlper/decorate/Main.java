package cn.anlper.decorate;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        System.out.println();

        RedColorDecorator redCircle = new RedColorDecorator(circle);
        redCircle.draw();
        System.out.println();

        Square square = new Square();
        GreenLineDecorator greenLineSquare = new GreenLineDecorator(square);
        greenLineSquare.draw();
        System.out.println();

        RedColorDecorator redGreenSquare = new RedColorDecorator(greenLineSquare);
        redGreenSquare.draw();
    }
}
