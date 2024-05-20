package cn.anlper.visitor;

public class MulDataVisitor implements Visitor {

    @Override
    public void visit(Data data) {
        System.out.println("a x b = " + data.a * data.b);
    }
}
