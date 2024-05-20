package cn.anlper.bridge;

public class Main {
    public static void main(String[] args) {
        App app = new App(new C1API());
        app.run();

        App app1 = new App(new C2API());
        app1.run();
    }
}
