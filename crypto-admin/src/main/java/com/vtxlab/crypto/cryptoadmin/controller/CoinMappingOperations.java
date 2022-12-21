package com.vtxlab.crypto.cryptoadmin.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vtxlab.crypto.cryptoadmin.entity.ChannelCoinMapping;

@RequestMapping(value = "default")
public interface CoinMappingOperations {

  @PostMapping(value = "/channel/{id}/coinmap")
  ChannelCoinMapping saveCoinMapping(
      @PathVariable Long id,
      @RequestBody ChannelCoinMapping coinMapping);
}
