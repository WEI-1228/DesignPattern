package cn.anlper.template;

public abstract class Game {
    public abstract void initGame();
    public abstract void playGame();
    public abstract void endGame();
    public void play() {
        initGame();
        playGame();
        endGame();
    }
}
