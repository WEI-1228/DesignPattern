package cn.anlper.builder;

public class Building {
    public Design design;
    public Floor floor;
    public Decorate decorate;

    public void printInfo() {
        design.makeDesign();
        floor.makeFloor();
        decorate.makeDecorate();
    }
}
