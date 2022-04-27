package com.example.demo;

import org.hibernate.Cache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class RefreshCache {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Scheduled(fixedRate = 5000)
	public void clearHibernateCache() {
		System.out.println("***** in cache Refreshing****");
		Session session = sessionFactory.getCurrentSession();
		
		if(session !=null) {
			session.clear();
			
			Cache cache=sessionFactory.getCache();
			
			if(cache!=null) {
				cache.evictAllRegions();
			}
		}
	}
	
	

}
