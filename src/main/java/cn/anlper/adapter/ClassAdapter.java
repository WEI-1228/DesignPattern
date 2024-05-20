package cn.anlper.adapter;

public class ClassAdapter extends MyService implements CompanyInterface{
    @Override
    public String service(String name, String id) {
        return service(name, id, "", "");
    }
}
