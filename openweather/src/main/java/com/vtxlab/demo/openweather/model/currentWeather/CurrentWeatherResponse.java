package com.vtxlab.demo.openweather.model.currentWeather;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vtxlab.demo.openweather.model.interfaces.WeatherResponseInterface;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CurrentWeatherResponse implements Serializable, WeatherResponseInterface {

  @JsonProperty("coord")
  private Coordinate coordinate;

  @JsonProperty("weather")
  private List<WeatherIndex> weatherIndexs;

  @JsonProperty("wind")
  private WindIndex windIndex;

  @JsonProperty("main")
  private MainIndex mainIndex;

  @JsonProperty("clouds")
  private CloudIndex cloudIndex;

  private BigDecimal visibility;

  @JsonProperty("dt")
  private BigDecimal datatime;

  private BigDecimal timezone;

  @JsonProperty("id")
  private BigDecimal cityId;

  @JsonProperty("name")
  private String cityName;

  @JsonProperty("cod")
  private Integer code;

}
