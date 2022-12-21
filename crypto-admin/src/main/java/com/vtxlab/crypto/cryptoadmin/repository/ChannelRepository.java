package com.vtxlab.crypto.cryptoadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtxlab.crypto.cryptoadmin.entity.Channel;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

  /*
   * select *
   * FROM CHANNELS c, CHANNEL_TRANS t, CHANNEL_COIN_MAPPINGS M
   * where c.id = t.channel_id
   * and c.id = m.channel_id
   * and t.source_app = 'crypto-web'
   * and t.tran_type = 'ex-rate';
   */
  Channel findByCoinTransSourceAppAndCoinTransType(
      String sourceApp,
      String tranType);

  Boolean findByChannelCode(String ChannelCode);
}
