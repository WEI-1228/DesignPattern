package cn.anlper.strategy;

public class MulStrategy implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
