package com.vtxlab.demo.openweather.model.currentWeather;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coordinate implements Serializable {

  /**
   * City geo location, longitude
   */
  @JsonProperty("lat")
  private BigDecimal latitude;

  /**
   * City geo location, latitude
   */
  @JsonProperty("lon")
  private BigDecimal longitude;

}
