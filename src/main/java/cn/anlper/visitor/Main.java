package cn.anlper.visitor;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(1, 2);
        AddDataVisitor addDataVisitor = new AddDataVisitor();
        data.accept(addDataVisitor);

        MulDataVisitor mulDataVisitor = new MulDataVisitor();
        data.accept(mulDataVisitor);

        MulPowerDataVisitor mulPowerDataVisitor = new MulPowerDataVisitor();
        data.accept(mulPowerDataVisitor);
    }
}
