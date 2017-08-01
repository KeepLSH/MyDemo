package com.example.weatherdemo.gson;

/**
 * Created by LvShao on 2017/7/28.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
