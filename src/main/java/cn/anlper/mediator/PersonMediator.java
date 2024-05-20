package cn.anlper.mediator;

public class PersonMediator extends Mediator{
    @Override
    public void send(String src, String dst, String msg) {
        colleagueMap.get(dst).receive(src, msg);
    }
}
