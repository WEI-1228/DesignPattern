package cn.anlper.factory.absfactorypattern;

public class LondonPizzaFactory extends AbsPizzaFactory{
    @Override
    public Pizza makePizza(String name) {
        if (name.equals("cheese")) return new LondonCheesePizza();
        if (name.equals("pepper")) return new LondonPepperPizza();
        return null;
    }
}
