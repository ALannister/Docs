package com.lannister.cache.config;

import com.google.common.cache.CacheBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Created by Lannister on 2019/10/31.
 */
//@Configuration
//public class GuavaCacheConfig {
//
//  @Bean
//  public CacheManager cacheManager(){
//    GuavaCacheManager guavaCacheManager = new GuavaCacheManager();
//    guavaCacheManager.setCacheBuilder(
//        CacheBuilder.newBuilder().
//            expireAfterWrite(10, TimeUnit.SECONDS).
//            maximumSize(1000));
//    return guavaCacheManager;
//  }
//}
