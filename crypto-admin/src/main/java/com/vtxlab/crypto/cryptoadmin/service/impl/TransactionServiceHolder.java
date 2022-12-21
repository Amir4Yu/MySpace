package com.vtxlab.crypto.cryptoadmin.service.impl;

import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtxlab.crypto.cryptoadmin.entity.ChannelTransaction;
import com.vtxlab.crypto.cryptoadmin.repository.ChannelRepository;
import com.vtxlab.crypto.cryptoadmin.repository.TransactionRepository;
import com.vtxlab.crypto.cryptoadmin.service.TransactionService;

@Service
public class TransactionServiceHolder implements TransactionService {

  @Autowired
  ChannelRepository channelRepository;

  @Autowired
  TransactionRepository transactionRepository;

  @Override
  public ChannelTransaction save(Long id,
      ChannelTransaction transaction) {

    return channelRepository.findById(id).map(channel -> {
      transaction.setChannel(channel);
      return transactionRepository.save(transaction);
    }).orElse(null);
    // return transactionRepository.save(transaction);
  }

}
