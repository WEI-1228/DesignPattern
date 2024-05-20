package cn.anlper.filter;

import java.util.LinkedList;
import java.util.List;

public class UnderAgeCriteria implements Criteria {
    private final int age;
    public UnderAgeCriteria(int age) {
        this.age = age;
    }
    @Override
    public List<Person> meetCriteria(List<Person> objectList) {
        List<Person> resultList = new LinkedList<>();
        for (Person p: objectList) {
            if (p.getAge() < age)
                resultList.add(p);
        }
        return resultList;
    }
}
