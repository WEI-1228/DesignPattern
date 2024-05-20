package cn.anlper.filter;

import java.util.LinkedList;
import java.util.List;

public class GenderCriteria implements Criteria {
    private final String gender;
    public GenderCriteria(String gender) {
        this.gender = gender;
    }


    @Override
    public List<Person> meetCriteria(List<Person> objectList) {
        List<Person> resultList = new LinkedList<>();
        objectList.forEach(p->{if (p.getGender().equals(gender)) resultList.add(p);});
        return resultList;
    }
}
