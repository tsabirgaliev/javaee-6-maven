package com.example.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.example.ejb.EjbService;

@Path("/")
public class RestService {
    @Inject
    EjbService ejbService;

    @GET
    @Path("/hello/{name}")
    public String sayHello(@PathParam("name") String name) {
        return ejbService.sayHello(name);
    }
}
