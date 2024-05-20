package cn.anlper.decorate;

public abstract class AbsDecorator implements Shape {
    public Shape shape;
    public AbsDecorator(Shape shape) {
        this.shape = shape;
    }
    public abstract void draw();
}

