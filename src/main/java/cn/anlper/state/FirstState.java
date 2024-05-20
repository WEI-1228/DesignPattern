package cn.anlper.state;

public class FirstState implements State{
    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("游戏第一阶段");
    }

    @Override
    public String toString() {
        return "现在是游戏第一阶段";
    }
}
