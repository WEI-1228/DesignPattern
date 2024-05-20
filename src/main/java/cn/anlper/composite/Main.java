package cn.anlper.composite;

public class Main {
    public static void main(String[] args) {
        Component university = new University("中国科学院大学");

        Component dp1 = new Department("计算机学院");
        Component dp2 = new Department("化学学院");
        university.add(dp1);
        university.add(dp2);

        Student st1 = new Student("计算机小红");
        Student st2 = new Student("计算机小明");
        dp1.add(st1);
        dp1.add(st2);

        Student st3 = new Student("化学小王");
        Student st4 = new Student("化学小明");
        dp2.add(st3);
        dp2.add(st4);

        university.operate();
        for (Component department : university.getSubordinates()) {
            department.operate();
            for (Component student: department.getSubordinates()) {
                student.operate();
            }
        }
    }
}
