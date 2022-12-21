package vtxlab.com.demo.coingecko.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import vtxlab.com.demo.coingecko.exception.ApiException;
import vtxlab.com.demo.coingecko.model.CoinsCurrency;
import vtxlab.com.demo.coingecko.model.CoinsCurrencyMap;
import vtxlab.com.demo.coingecko.model.CoinsMarkets;
import vtxlab.com.demo.coingecko.service.CoingeckoService;
import vtxlab.com.demo.coingecko.ultis.CoinsApi;

@Slf4j
@Service
public class CoingeckoServiceHolder implements CoingeckoService {

  @Autowired
  CoinsApi coinsApi;

  @Value("${coingecko.baseUrl}")
  String baseUrl;
  @Value("${coingecko.serviceVers}")
  String serviceVers;

  @Value("${coingecko.service.coins-markets.serviceUrl}")
  String serviceUrl;
  @Value("${coingecko.service.coins-markets.currency}")
  String vsCurrency;
  @Value("${coingecko.service.coins-markets.order}")
  String order;
  @Value("${coingecko.service.coins-markets.perPage}")
  String perPage;
  @Value("${coingecko.service.coins-markets.page}")
  String page;
  @Value("${coingecko.service.coins-markets.sparkline}")
  String sparkline;

  @Value("${coingecko.service.simple-price.serviceUrl}")
  String simplePriceUrl;

  @Override
  public List<CoinsMarkets> getAllCoinsMarkets() throws ApiException {

    HashMap<String, String> hMap = new HashMap<>();
    hMap.put("vs_currency", vsCurrency);
    hMap.put("order", order);
    hMap.put("per_page", perPage);
    hMap.put("page", page);
    hMap.put("sparkline", sparkline);

    return Arrays.asList(coinsApi.invoke(baseUrl,
        serviceVers, serviceUrl,
        hMap, CoinsMarkets[].class));
    // https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum,tether,dogecoin,ripple&vs_currencies=usd,hkd
  }

  @Override
  public Map<String, CoinsCurrency> getSimplePrice(List<String> cryptos,
      List<String> currencies) throws ApiException {

    // Alternative: String.join(",", cryptos);
    // Change the List<String> to String (Bitcoin,tegther)
    String cryptoStr = cryptos.stream().collect(Collectors.joining(","));
    String currencyStr = currencies.stream().collect(Collectors.joining(","));

    // Conact Url ->
    // https://api.coingecko.com/api/v3/simple/price
    // ?ids=bitcoin%2Cethereum%2Ctether%2Cdogecoin%2Cripple&vs_currencies=usd%2Chkd
    HashMap<String, String> hMap = new HashMap<>();
    hMap.put("ids", cryptoStr);
    hMap.put("vs_currencies", currencyStr);

    return coinsApi.invoke(baseUrl,
        serviceVers, simplePriceUrl,
        hMap, CoinsCurrencyMap.class);

    // Object obj = coinsApi.invoke(baseUrl,
    // serviceVers, simplePriceUrl,
    // hMap, CoinsCurrencyMap.class);

    // log.info("simpleprice, returntype={}", obj);
    // return null;

  }

}
