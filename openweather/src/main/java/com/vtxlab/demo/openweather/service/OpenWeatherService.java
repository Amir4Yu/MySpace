package com.vtxlab.demo.openweather.service;

import java.math.BigDecimal;

import com.vtxlab.demo.openweather.exception.ApiException;
import com.vtxlab.demo.openweather.model.currentWeather.CurrentWeatherResponse;

public interface OpenWeatherService {

    CurrentWeatherResponse getCurrentWeather(BigDecimal latitude,
            BigDecimal longitude) throws ApiException;

}
