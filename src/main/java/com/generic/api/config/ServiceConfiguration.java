package com.generic.api.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.generic.api.generic.IBaseService;

@Configuration
public class ServiceConfiguration {
	
	@Autowired
	private List<IBaseService> serviceBeans;
	
	private Map<String, IBaseService> serviceMap=new HashMap<>();

	@Bean
	public Map<String, IBaseService> services(List<IBaseService> serviceBeans) {
	    this.serviceBeans = serviceBeans;
	    serviceBeans.forEach(l-> {
	    	serviceMap.put(l.serviceName(), l);
	    });
	    
	    return serviceMap;
	}

}
