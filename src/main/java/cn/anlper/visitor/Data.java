package cn.anlper.visitor;

public class Data {
    int a;
    int b;
    public Data(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
