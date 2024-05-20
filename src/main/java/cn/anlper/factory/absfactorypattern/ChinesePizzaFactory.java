package cn.anlper.factory.absfactorypattern;

public class ChinesePizzaFactory extends AbsPizzaFactory{
    @Override
    public Pizza makePizza(String name) {
        if (name.equals("cheese")) return new ChineseCheesePizza();
        if (name.equals("pepper")) return new ChinesePepperPizza();
        return null;
    }
}
