package com.vtxlab.crypto.cryptoadmin.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.crypto.cryptoadmin.controller.CoinMappingOperations;
import com.vtxlab.crypto.cryptoadmin.entity.ChannelCoinMapping;
import com.vtxlab.crypto.cryptoadmin.service.CoinMappingService;

@RestController
@RequestMapping(value = "/crypto/admin/api/v1")
public class CoinMappingController implements CoinMappingOperations {

  @Autowired
  CoinMappingService coinMappingService;

  @Override
  public ChannelCoinMapping saveCoinMapping(Long id,
      ChannelCoinMapping coinMapping) {
    return coinMappingService.save(id, coinMapping);
  }

}