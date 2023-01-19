package com.org;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class DemoApp extends Application{
	@Override 
	public Set<Class<?>> getClasses() { 
		Set<Class<?>> classes = new HashSet<Class<?>>(); 
		classes.add(MyResource.class); 
		System.out.println("Classes:"+classes); 
		return classes; 
		}

}
