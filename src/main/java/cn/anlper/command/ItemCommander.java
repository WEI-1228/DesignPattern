package cn.anlper.command;

public class ItemCommander implements Commander{
    private final AirCondition airCondition;
    private final Television television;
    public ItemCommander() {
        airCondition = new AirCondition();
        television = new Television();
    }
    @Override
    public void receive(String item, String command) {
        if (item.equals("AIR")) {
            if (command.equals("ON"))
                airCondition.open();
            else airCondition.shutdown();
        } else if (item.equals("TV")) {
            if (command.equals("ON"))
                television.open();
            else television.shutdown();
        }
    }
}
