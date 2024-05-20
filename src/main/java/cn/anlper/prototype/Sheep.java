package cn.anlper.prototype;

public class Sheep implements Cloneable{
    String name;
    String color;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
