package cn.anlper.state;

public class Context {
    protected State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
