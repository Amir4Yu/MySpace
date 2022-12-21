package com.vtxlab.crypto.cryptoadmin.service;

import java.util.List;
import java.util.UUID;

import com.vtxlab.crypto.cryptoadmin.entity.Channel;

public interface ChannelAdminService {

  Channel getChannel(String sourceType, String tranType);

  Channel saveChannel(Channel channel, UUID uuid);

  Channel updateChannel(Channel channel, Long id);

  Boolean isChannelCodeExist(String channelCode);

  Channel submitChannel(Channel channel, UUID uuid);

  List<Channel> getAllChannel();

  void deleteAllChannel();
}
