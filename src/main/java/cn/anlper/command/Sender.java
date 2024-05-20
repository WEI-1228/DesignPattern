package cn.anlper.command;

public class Sender {
    private Commander commander;
    public Sender(Commander commander) {
        this.commander = commander;
    }

    public void send(String item, String command) {
        commander.receive(item, command);
    }
}
