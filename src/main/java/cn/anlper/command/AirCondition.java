package cn.anlper.command;

public class AirCondition implements Item{
    @Override
    public void open() {
        System.out.println("打开空调");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭空调");
    }
}
