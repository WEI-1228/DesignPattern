package cn.anlper.singleton;

public class StaticInnerClass {
    private static class InnerClass {
        private static Object instance;
    }

    public Object getInstance() {
        return InnerClass.instance;
    }
}
