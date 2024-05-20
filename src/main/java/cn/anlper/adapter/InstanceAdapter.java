package cn.anlper.adapter;

public class InstanceAdapter implements CompanyInterface{
    MyService service;

    @Override
    public String service(String name, String id) {
        return service.service(name, id, "", "");
    }
}
