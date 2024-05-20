package cn.anlper.mediator;

public class Main {
    public static void main(String[] args) {
        PersonMediator personMediator = new PersonMediator();
        Person a = new Person("A", personMediator);
        Person b = new Person("B", personMediator);
        Person c = new Person("C", personMediator);

        a.send("B", "你好");
        b.send("C", "我好");
        c.send("A", "哈哈哈");
    }
}
