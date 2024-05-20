package cn.anlper.factory.absfactorypattern;

public class FactoryProducer {
    public static AbsPizzaFactory getFactory(String choice) {
        if (choice.equals("chinese")) return new ChinesePizzaFactory();
        if (choice.equals("london")) return new LondonPizzaFactory();
        return null;
    }
}
