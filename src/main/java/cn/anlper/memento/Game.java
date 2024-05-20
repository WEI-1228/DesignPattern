package cn.anlper.memento;

public class Game {
    private int i;
    public Game() {
        i = 1;
        System.out.println("开始游戏，第1关");
    }

    public void play() {
        i++;
        System.out.println("过关，当前关卡：" + i);
    }

    public Memento exportMemento() {
        System.out.println("存档第" + i + "关");
        return new Memento(i);
    }

    public void loadFromMemento(Memento memento) {
        this.i = memento.getState();
        System.out.println("读取存档点，现在是第" + i + "关");
    }
}
