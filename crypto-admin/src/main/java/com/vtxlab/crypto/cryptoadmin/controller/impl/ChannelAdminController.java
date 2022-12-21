package com.vtxlab.crypto.cryptoadmin.controller.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.crypto.cryptoadmin.controller.ChannelAdminOperations;
import com.vtxlab.crypto.cryptoadmin.entity.Channel;
import com.vtxlab.crypto.cryptoadmin.service.ChannelAdminService;

@RestController
@RequestMapping(value = "crypto/admin/api/v1")
public class ChannelAdminController implements ChannelAdminOperations {

  @Autowired
  ChannelAdminService channelAdminService;

  @Override
  public Channel getChannel(String sourceApp, String tranType) {
    return channelAdminService.getChannel(sourceApp, tranType);
  }

  @Override
  public ResponseEntity<Channel> saveChannel(Channel channel, UUID uuid) {
    Channel savedChannel = channelAdminService.saveChannel(channel, uuid);

    if (savedChannel == null) {
      return ResponseEntity.badRequest().build();

    }
    return ResponseEntity.ok().body(null);
  }

  @Override
  public Channel updateChannel(Channel channel, Long id) {
    return channelAdminService.updateChannel(channel, id);
  }

  @Override
  public Channel submitChannel(Channel channel, UUID uuid) {
    return channelAdminService.submitChannel(channel, uuid);

  }

  @Override
  public void deleteAllChannel() {
    channelAdminService.deleteAllChannel();
  }

}
