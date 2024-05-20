package cn.anlper.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject {
    private final List<Observer> observers = new ArrayList<>();
    public String weather;
    public String getWeather() {
        return weather;
    }
    public void setWeather(String weather) {
        this.weather = weather;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer: observers)
            observer.update();
    }
}
