package cn.anlper.factory.absfactorypattern;

public class AbsFactoryDemo {
    public static void main(String[] args) {
        AbsPizzaFactory chineseFactory = FactoryProducer.getFactory("chinese");
        Pizza name = chineseFactory.makePizza("cheese");
        name.print();
        AbsPizzaFactory londonFactory = FactoryProducer.getFactory("london");
        Pizza pepper = londonFactory.makePizza("pepper");
        pepper.print();
    }
}
