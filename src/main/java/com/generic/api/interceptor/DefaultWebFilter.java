package com.generic.api.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * Default web filter for intercepting all incoming request
 *
 */
@Component
@Slf4j
class DefaultWebFilter implements WebRequestInterceptor {
	
	@Override
	public void preHandle(WebRequest request) throws Exception {

	 

	}

	@Override
	public void postHandle(WebRequest request, ModelMap model) throws Exception {

		log.debug("inside DefaultWebFilter postHandle");

	}

	@Override
	public void afterCompletion(WebRequest request, Exception ex) throws Exception {

		log.debug("inside DefaultWebFilter afterCompletion");
	}

}