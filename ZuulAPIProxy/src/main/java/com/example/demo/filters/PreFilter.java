package com.example.demo.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
	
		return true;
	}

	@Override
	public Object run() throws ZuulException {
	
		System.out.println("Run Method Called");
		return null;
	}

	@Override
	public String filterType() {
	
		 RequestContext ctx =  RequestContext.getCurrentContext();
		 
		  		  
		return "pre"; 
			}

	@Override
	public int filterOrder() {
		return 1;
	}

}
