package cn.anlper.composite;

public class University extends Component{
    public University(String name) {
        super(name);
    }

    @Override
    public void operate() {
        System.out.println("大学名称：" + name);
    }
}
