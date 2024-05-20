package cn.anlper.state;

public class SecondState implements State{
    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("游戏第二阶段");
    }

    @Override
    public String toString() {
        return "现在是游戏第二阶段";
    }
}
