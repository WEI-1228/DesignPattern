package cn.anlper.builder;

public class GoodBuilder extends AbsBuilder{
    @Override
    public Design makeDesign() {
        return new Design() {
            @Override
            public void makeDesign() {
                System.out.println("高档房子的设计");
            }
        };
    }

    @Override
    public Floor makeFloor() {
        return new Floor() {
            @Override
            public void makeFloor() {
                System.out.println("高档房子打地基");
            }
        };
    }

    @Override
    public Decorate makeDecorate() {
        return new Decorate() {
            @Override
            public void makeDecorate() {
                System.out.println("高档房子装修");
            }
        };
    }
}
