package com.vtxlab.demo.openweather.model.currentWeather;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WindIndex implements Serializable {

  /**
   * Wind Speed.
   */
  @JsonProperty("speed")
  private BigDecimal windSpeed;

  /**
   * Wind Direction.
   */
  @JsonProperty("deg")
  private BigDecimal windDegree;

}
