package cn.anlper.memento;

import java.util.ArrayList;
import java.util.List;

public class MementoManagement {
    List<Memento> mementoList = new ArrayList<>();

    public Memento read(int index) {
        return mementoList.get(index);
    }

    public void save(Memento memento) {
        mementoList.add(memento);
    }
}
