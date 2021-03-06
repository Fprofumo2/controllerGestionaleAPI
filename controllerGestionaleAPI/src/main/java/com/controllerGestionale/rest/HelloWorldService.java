package com.controllerGestionale.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}&{param2}")
	public Response getMsg(@PathParam("param") String msg,@PathParam("param2") String second) {
 
		String output = "Jersey say : " + msg+ " e "+second;
 
		return Response.status(200).entity(output).build();
 
	}
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}