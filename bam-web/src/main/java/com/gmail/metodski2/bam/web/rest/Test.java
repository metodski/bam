package com.gmail.metodski2.bam.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class Test {

	@GET
	@Path("test")
	public String get() {
		return "test";
	}
}
