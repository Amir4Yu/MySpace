package vtxlab.com.demo.coingecko.service;

import java.util.List;
import java.util.Map;

import vtxlab.com.demo.coingecko.exception.ApiException;
import vtxlab.com.demo.coingecko.model.CoinsCurrency;
import vtxlab.com.demo.coingecko.model.CoinsMarkets;

public interface CoingeckoService {

  List<CoinsMarkets> getAllCoinsMarkets() throws ApiException;

  Map<String, CoinsCurrency> getSimplePrice(List<String> cryptos,
      List<String> currencies) throws ApiException;
}
