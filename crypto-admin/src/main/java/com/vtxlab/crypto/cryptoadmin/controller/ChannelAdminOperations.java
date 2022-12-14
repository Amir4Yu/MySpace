package com.vtxlab.crypto.cryptoadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.vtxlab.crypto.cryptoadmin.entity.Channel;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/default")
public interface ChannelAdminOperations {

  @GetMapping(value = "/channel")
  Channel getChannel(@RequestParam String sourceApp, @RequestParam String tranType);

  @PostMapping(value = "/channel")
  ResponseEntity<Channel> saveChannel(@RequestBody Channel channel, @RequestParam UUID uuid);

  @PutMapping(value = "/channel/{id}")
  Channel updateChannel(@RequestBody Channel channel, @PathVariable Long id);

  @PostMapping(value = "/channel-submit")
  Channel submitChannel(@Validated @RequestBody Channel channel, @RequestParam UUID uuid);

  @DeleteMapping(value = "channels")
  void deleteAllChannel();

}
