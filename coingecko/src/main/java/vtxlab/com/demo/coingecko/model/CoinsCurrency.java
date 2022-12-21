package vtxlab.com.demo.coingecko.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoinsCurrency implements Serializable {

  // @JsonProperty(value = "USD")
  private BigDecimal usd;

  // @JsonProperty(value = "HKD")
  private BigDecimal hkd;

  // format:
  // "bitcoin":{"usd":17888.6,"hkd":139029},"dogecoin":{"usd":0.090851,"hkd":0.706083},"tether":{"usd":0.99983,"hkd":7.77},"ethereum":{"usd":1327.82,"hkd":10319.69}}
}
