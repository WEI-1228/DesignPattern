package cn.anlper.observer;

public class Main {
    public static void main(String[] args) {
        WeatherSubject subject = new WeatherSubject();
        AObserver aObserver = new AObserver(subject);
        BObserver bObserver = new BObserver(subject);
        CObserver cObserver = new CObserver(subject);

        subject.setWeather("晴天");
        System.out.println();
        subject.setWeather("雨天");
    }
}
