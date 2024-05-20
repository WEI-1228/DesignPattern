package cn.anlper.decorate;

public class GreenLineDecorator extends AbsDecorator{
    public GreenLineDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("该形状的线条是绿色");
    }
}
