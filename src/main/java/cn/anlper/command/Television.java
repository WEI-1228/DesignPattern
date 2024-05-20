package cn.anlper.command;

public class Television implements Item{
    @Override
    public void open() {
        System.out.println("打开电视");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭电视");
    }
}
