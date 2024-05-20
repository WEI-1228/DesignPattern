package cn.anlper.template;

public class BasketballGame extends Game{
    @Override
    public void initGame() {
        System.out.println("初始化篮球游戏");
    }

    @Override
    public void playGame() {
        System.out.println("开始玩篮球游戏");
    }

    @Override
    public void endGame() {
        System.out.println("结束篮球游戏");
    }
}
