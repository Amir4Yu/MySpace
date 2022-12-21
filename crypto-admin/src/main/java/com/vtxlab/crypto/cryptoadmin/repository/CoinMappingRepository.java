package com.vtxlab.crypto.cryptoadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtxlab.crypto.cryptoadmin.entity.ChannelCoinMapping;

@Repository
public interface CoinMappingRepository extends JpaRepository<ChannelCoinMapping, Long> {

}
