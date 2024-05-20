package cn.anlper.filter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();
        Person person = new Person("小王", 13, "男", "江西");
        personList.add(person);
        Person person1 = new Person("小红", 16, "女", "江西");
        personList.add(person1);
        Person person2 = new Person("小李", 23, "女", "浙江");
        personList.add(person2);
        Person person3 = new Person("小军", 13, "男", "浙江");
        personList.add(person3);
        Person person4 = new Person("小靓", 27, "女", "安徽");
        personList.add(person4);
        Person person5 = new Person("小郭", 31, "男", "安徽");
        personList.add(person5);
        Person person6 = new Person("小飞", 20, "男", "安徽");
        personList.add(person6);

        ProvinceCriteria anhuiProvince = new ProvinceCriteria("安徽");
        System.out.println("安徽人：");
        printList(anhuiProvince.meetCriteria(personList));
        System.out.println("=====");

        UnderAgeCriteria under20AgeCriteria = new UnderAgeCriteria(20);
        System.out.println("小于20岁的人：");
        printList(under20AgeCriteria.meetCriteria(personList));
        System.out.println("=====");

        GenderCriteria maleCriteria = new GenderCriteria("男");
        System.out.println("男人：");
        printList(maleCriteria.meetCriteria(personList));
        System.out.println("=====");

        System.out.println("小于20岁的安徽人：");
        AndCriteria under20Anhui = new AndCriteria(anhuiProvince, under20AgeCriteria);
        printList(under20Anhui.meetCriteria(personList));
        System.out.println("=====");

        System.out.println("安徽人或男人：");
        OrCriteria anhuiOrMale = new OrCriteria(anhuiProvince, maleCriteria);
        printList(anhuiOrMale.meetCriteria(personList));

    }

    public static void printList(List<Person> personList) {
        personList.forEach(System.out::println);
    }
}
