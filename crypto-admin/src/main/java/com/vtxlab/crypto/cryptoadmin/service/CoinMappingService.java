package com.vtxlab.crypto.cryptoadmin.service;

import com.vtxlab.crypto.cryptoadmin.entity.ChannelCoinMapping;

public interface CoinMappingService {

  ChannelCoinMapping save(Long id, ChannelCoinMapping channelCoinMapping);

}