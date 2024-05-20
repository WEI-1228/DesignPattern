package cn.anlper.composite;

public class Department extends Component{
    public Department(String name) {
        super(name);
    }

    @Override
    public void operate() {
        System.out.println("院系名称：" + name);
    }
}
