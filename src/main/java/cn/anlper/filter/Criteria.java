package cn.anlper.filter;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> objectList);
}
