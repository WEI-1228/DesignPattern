package cn.anlper.decorate;

public class RedColorDecorator extends AbsDecorator{
    public RedColorDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("该形状的颜色是红色");
    }
}
