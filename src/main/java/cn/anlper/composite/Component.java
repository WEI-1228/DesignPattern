package cn.anlper.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component{
    public String name;
    public Component(String name) {
        this.name = name;
    }
    List<Component> component_list = new ArrayList<>();
    public void add(Component component) {
        component_list.add(component);
    }
    public void remove() {
        throw new UnsupportedOperationException();
    }
    public List<Component> getSubordinates() {
        return component_list;
    }

    public abstract void operate();
}
