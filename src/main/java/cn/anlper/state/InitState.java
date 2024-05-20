package cn.anlper.state;

public class InitState implements State{
    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("游戏开始状态");
    }

    @Override
    public String toString() {
        return "现在是游戏开始状态";
    }
}
