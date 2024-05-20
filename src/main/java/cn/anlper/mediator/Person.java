package cn.anlper.mediator;

public class Person extends Colleague{
    public Person(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void receive(String src, String msg) {
        System.out.println("我是" + name + " 收到来自" + src + "的消息：" + msg);
    }

    @Override
    public void send(String dst, String msg) {
        mediator.send(name, dst, msg);
    }
}
