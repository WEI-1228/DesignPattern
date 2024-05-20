package cn.anlper.observer;

public class AObserver extends Observer{
    public AObserver(WeatherSubject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("A公司收到天气更新信息：" + subject.getWeather());
    }
}
