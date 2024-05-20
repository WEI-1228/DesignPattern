package cn.anlper.bridge;

public class App {
    WeatherApi api;
    App(WeatherApi api) {
        this.api = api;
    }

    public void run() {
        System.out.println("今天天气：" + api.getWeather());
    }
}
