package com.vtxlab.crypto.cryptoadmin.service;

import com.vtxlab.crypto.cryptoadmin.entity.ChannelTransaction;

public interface TransactionService {

  ChannelTransaction save(Long id, ChannelTransaction channelTransaction);
}
