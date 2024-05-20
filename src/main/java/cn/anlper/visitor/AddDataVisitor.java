package cn.anlper.visitor;

public class AddDataVisitor implements Visitor {

    @Override
    public void visit(Data data) {
        System.out.println("a + b = " + (data.a + data.b));
    }
}
