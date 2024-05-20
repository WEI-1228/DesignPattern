package cn.anlper.singleton;

public class Singleton {
    private static volatile Object obj;

    public Object getInstance() {
        if (obj == null) {
            synchronized (Singleton.class) {
                if (obj == null)
                    obj = new Object();
            }
        }
        return obj;
    }
}
