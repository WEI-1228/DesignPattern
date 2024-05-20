package cn.anlper.command;

public class Main {
    public static void main(String[] args) {
        Commander commander = new ItemCommander();
        Sender sender = new Sender(commander);
        sender.send("AIR", "ON");
        sender.send("TV", "OFF");
    }
}
