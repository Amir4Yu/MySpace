package vtxlab.com.demo.coingecko.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vtxlab.com.demo.coingecko.exception.ApiException;
import vtxlab.com.demo.coingecko.model.CoinsMarkets;
import vtxlab.com.demo.coingecko.model.dto.ChannelDto;

@RequestMapping(value = "/default")
public interface CoingeckoOperation {

  @GetMapping(value = "coin/market")
  List<CoinsMarkets> getCoinsMarkets() throws ApiException;

  @GetMapping(value = "/coingecko/simple-price")
  ChannelDto getSimplePrice(@RequestParam("coins") List<String> cryptos,
      @RequestParam("currency") List<String> currencies) throws ApiException;
}
