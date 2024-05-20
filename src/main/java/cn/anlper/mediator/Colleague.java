package cn.anlper.mediator;

public abstract class Colleague {
    protected final Mediator mediator;
    protected String name;
    public Colleague(String name, Mediator mediator) {
        this.mediator = mediator;
        this.name = name;
        mediator.addColleague(name, this);
    }
    public abstract void receive(String src, String msg);
    public abstract void send(String dst, String msg);
}
