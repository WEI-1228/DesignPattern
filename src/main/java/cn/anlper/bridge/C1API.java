package cn.anlper.bridge;

public class C1API implements WeatherApi{
    @Override
    public String getWeather() {
        return "C1公司实现的天气API";
    }
}
