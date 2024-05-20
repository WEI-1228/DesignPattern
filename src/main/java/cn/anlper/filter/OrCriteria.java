package cn.anlper.filter;

import java.util.List;

public class OrCriteria implements Criteria{
    private final Criteria criteria;
    private final Criteria otherCriteria;
    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> objectList) {
        List<Person> firstPersonList = criteria.meetCriteria(objectList);
        List<Person> otherPersonList = otherCriteria.meetCriteria(objectList);
        for (Person person: otherPersonList) {
            if (!firstPersonList.contains(person))
                firstPersonList.add(person);
        }
        return firstPersonList;
    }

}
