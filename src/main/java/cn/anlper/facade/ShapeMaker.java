package cn.anlper.facade;

public class ShapeMaker {
    private final Shape circle;
    private final Shape square;
    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
    }
    public void drawCircle() {
        this.circle.draw();
    }
    public void drawSquare() {
        this.square.draw();
    }
}
