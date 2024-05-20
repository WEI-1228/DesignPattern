package cn.anlper.visitor;

public class MulPowerDataVisitor implements Visitor {

    @Override
    public void visit(Data data) {
        System.out.println("axa + bxb = " + (data.a * data.a + data.b * data.b));
    }
}
