package cn.anlper.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {
    Map<String, Colleague> colleagueMap = new HashMap<>();
    public abstract void send(String src, String dst, String msg);
    public void addColleague(String name, Colleague colleague) {
        colleagueMap.put(name, colleague);
    }
}
