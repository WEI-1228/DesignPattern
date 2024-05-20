package cn.anlper.observer;

public class BObserver extends Observer{
    public BObserver(WeatherSubject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("B公司收到天气更新信息：" + subject.getWeather());
    }
}
