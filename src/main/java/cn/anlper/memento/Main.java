package cn.anlper.memento;

public class Main {
    public static void main(String[] args) {
        MementoManagement mementoManagement = new MementoManagement();
        Game game = new Game();
        game.play();
        game.play();
        mementoManagement.save(game.exportMemento());
        game.play();
        game.play();
        game.loadFromMemento(mementoManagement.read(0));
        game.play();
        game.play();
    }
}
