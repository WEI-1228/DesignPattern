package cn.anlper.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        AddStrategy addStrategy = new AddStrategy();
        context.setStrategy(addStrategy);
        int addRes = context.executeStrategy(1, 2);
        System.out.println(addRes);

        MulStrategy mulStrategy = new MulStrategy();
        context.setStrategy(mulStrategy);
        int mulRes = context.executeStrategy(2, 3);
        System.out.println(mulRes);
    }
}
