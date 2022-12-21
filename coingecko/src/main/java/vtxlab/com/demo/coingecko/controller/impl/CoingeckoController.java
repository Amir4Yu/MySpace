package vtxlab.com.demo.coingecko.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import vtxlab.com.demo.coingecko.controller.CoingeckoOperation;
import vtxlab.com.demo.coingecko.exception.ApiException;
import vtxlab.com.demo.coingecko.model.CoinsMarkets;
import vtxlab.com.demo.coingecko.model.dto.ChannelDto;
import vtxlab.com.demo.coingecko.service.CoingeckoService;
import vtxlab.com.demo.coingecko.ultis.CoinsApi;

@Slf4j
@RestController
// @CrossOrigin
@RequestMapping(value = "crypto/api/v1")
public class CoingeckoController implements CoingeckoOperation {

  @Autowired
  CoingeckoService coingeckoService;

  @Override
  public List<CoinsMarkets> getCoinsMarkets() throws ApiException {
    log.info("start Controller");
    List<CoinsMarkets> coinsMarkets = coingeckoService.getAllCoinsMarkets();
    log.info("end Controller: {}", coinsMarkets);
    return coinsMarkets;
  }

  @Override
  public ChannelDto getSimplePrice(List<String> cryptos,
      List<String> currencies) throws ApiException {

    return ChannelDto.builder()
        .exchangeRates(CoinsApi.map(coingeckoService
            .getSimplePrice(cryptos, currencies)))
        .build();
  }

}
