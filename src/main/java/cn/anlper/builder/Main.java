package cn.anlper.builder;

public class Main {
    public static void main(String[] args) {
        GoodBuilder goodBuilder = new GoodBuilder();
        Building goodBuilding = goodBuilder.build();
        goodBuilding.printInfo();

        BadBuilder badBuilder = new BadBuilder();
        Building badBuilding = badBuilder.build();
        badBuilding.printInfo();
    }
}
