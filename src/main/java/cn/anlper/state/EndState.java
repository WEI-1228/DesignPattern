package cn.anlper.state;

public class EndState implements State{
    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("游戏结束");
    }

    @Override
    public String toString() {
        return "现在是游戏结束状态";
    }
}
