package com.vtxlab.demo.openweather.utils;

import com.vtxlab.demo.openweather.model.currentWeather.CurrentWeatherResponse;
import com.vtxlab.demo.openweather.model.dto.CurrentWeatherDto;
import com.vtxlab.demo.openweather.model.dto.WeatherDto;

public class WeatherModelMapper {

  public static WeatherDto convert(CurrentWeatherResponse cwr) {
    if (cwr == null) {
      return null;
    }
    CurrentWeatherDto currentWeatherDto = //
        CurrentWeatherDto.builder()
            .latitude(cwr.getCoordinate().getLatitude())
            .longitude(cwr.getCoordinate().getLongitude())
            .datatime(cwr.getDatatime())
            .windSpeed(cwr.getWindIndex().getWindSpeed())
            .windDegree(cwr.getWindIndex().getWindDegree())
            .timezone(cwr.getTimezone())
            .temperature(cwr.getMainIndex().getTemperature())
            .minTemperature(cwr.getMainIndex().getMinTemperature())
            .maxTemperature(cwr.getMainIndex().getMaxTemperature())
            .cityId(cwr.getCityId())
            .cityName(cwr.getCityName())
            .humidity(cwr.getMainIndex().getHumidity())
            .pressure(cwr.getMainIndex().getPressure())
            .visibility(cwr.getVisibility())
            .cloudinessPercent(cwr.getCloudIndex().getCloudinessPercent())
            .build();

    return WeatherDto.builder().currentWeatherDto(currentWeatherDto).build();
  }
}