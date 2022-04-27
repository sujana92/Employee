package com.example.demo;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.context.annotation.Bean;

import net.sf.ehcache.config.CacheConfiguration;

public class CachingConfiguration implements CachingConfigurer {
	
	
	@Bean(destroyMethod ="shutdown")
	public net.sf.ehcache.CacheManager ehCacheManager(){
		CacheConfiguration cacheConfigurer = new CacheConfiguration();
		cacheConfiguration.setName("name");
		cacheConfiguration.setMemoryStoreEvictionPolicy("LRU");
		cacheConfiguration.setMaxEntriesLocalHeap(1);
		
		net.sf.ehcache.config.Configuration config = new net.sf.ehcache.config.configuration();
		config.addCache(cacheConfiguration);
		 
		return net.sf.ehcache.CacheManager.newInstance(config);
		
	}
	
	@Bean
	@Override
	public CacheManager cacheManager() {
		return new EhcacheCacheManager(ehCacheManager());
	}
	
	@Bean
	@Override
	public KeyGenerator keyGenerator() 
	{
		return new SimpleKeyGenerator();

}
