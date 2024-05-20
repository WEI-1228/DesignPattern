package cn.anlper.filter;

import java.util.LinkedList;
import java.util.List;

public class ProvinceCriteria implements Criteria {
    private final String province;
    public ProvinceCriteria(String province) {
        this.province = province;
    }


    @Override
    public List<Person> meetCriteria(List<Person> objectList) {
        List<Person> resultList = new LinkedList<>();
        objectList.forEach(p->{if (p.getProvince().equals(province)) resultList.add(p);});
        return resultList;
    }
}
