package com.org;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class MyResource {
	
	
	@GET
	@Path("/get")
	public void getMessage() {
		System.out.println("I Get Msg");
		//return "Get Message";
	}
	
	@POST
	@Path("/post")
	public void posttMessage() {
		System.out.println("I Post Msg");
	}
	
	@POST
	@Path("/put")
	public void puttMessage() {
		System.out.println("I Put Msg");
	}
	
	@POST
	@Path("/delete")
	public void deletetMessage() {
		System.out.println("I Delete Msg");
	}

}
