package cn.anlper.composite;

public class Student extends Component {
    public Student(String name) {
        super(name);
    }

    @Override
    public void operate() {
        System.out.println("学生名称：" + name);
    }
}
