package cn.anlper.observer;

public class CObserver extends Observer{
    public CObserver(WeatherSubject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("C公司收到天气更新信息：" + subject.getWeather());
    }
}
