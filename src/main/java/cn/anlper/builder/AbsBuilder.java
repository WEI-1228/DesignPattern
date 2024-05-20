package cn.anlper.builder;

public abstract class AbsBuilder {
    public abstract Design makeDesign();
    public abstract Floor makeFloor();
    public abstract Decorate makeDecorate();

    public Building build() {
        Building building = new Building();
        building.design = makeDesign();
        building.floor = makeFloor();
        building.decorate = makeDecorate();
        return building;
    }
}
