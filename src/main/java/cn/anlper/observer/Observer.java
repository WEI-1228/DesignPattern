package cn.anlper.observer;

public abstract class Observer {
    protected WeatherSubject subject;
    public Observer(WeatherSubject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    public abstract void update();
}
