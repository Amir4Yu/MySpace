package com.vtxlab.crypto.cryptoadmin.service.impl;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.vtxlab.crypto.cryptoadmin.entity.Channel;
import com.vtxlab.crypto.cryptoadmin.repository.ChannelRepository;
import com.vtxlab.crypto.cryptoadmin.service.ChannelAdminService;

@Service
public class AdminServiceHolder implements ChannelAdminService {

  @Autowired
  ChannelRepository channelRepository;

  @Autowired
  RedisTemplate redisTemplate;

  @Override
  public Channel getChannel(String sourceType, String tranType) {
    return channelRepository
        .findByCoinTransSourceAppAndCoinTransType(
            sourceType, tranType);
  }

  @Override
  public Boolean isChannelCodeExist(String channelCode) {
    return channelRepository.findByChannelCode(channelCode);
  }

  @Override
  public Channel submitChannel(Channel channel, UUID uuid) {
    if (!isChannelCodeExist(channel.getChannelCode())) {
      saveChannel(channel, uuid);
    }
    throw new IllegalArgumentException();
  }

  @Override
  public Channel saveChannel(Channel channel, UUID uuid) {
    String redisKey = "crypto:admin:post:channel:uuid:" + uuid;

    if (redisTemplate.opsForValue().get(redisKey) != null) {
      return null;
    }
    Channel savedChannel = channelRepository.save(channel);
    redisTemplate.opsForValue().set(redisKey, uuid, Duration.ofDays(1));
    return savedChannel;
  }

  @Override
  public Channel updateChannel(Channel channel, Long id) {
    if (channelRepository.existsById(id)) {
      return channelRepository.save(channel);
    }
    return null;
  }

  @Override
  public List<Channel> getAllChannel() {
    return channelRepository.findAll();
  }

  @Override
  public void deleteAllChannel() {
    channelRepository.deleteAll();
  }
}
