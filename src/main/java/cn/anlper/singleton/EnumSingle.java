package cn.anlper.singleton;

public class EnumSingle {
    public InstanceEnum getInstance() {
        return InstanceEnum.INSTANCE;
    }
}

enum InstanceEnum {
    INSTANCE;
}
