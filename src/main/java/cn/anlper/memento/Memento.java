package cn.anlper.memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int state;

    public Memento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
