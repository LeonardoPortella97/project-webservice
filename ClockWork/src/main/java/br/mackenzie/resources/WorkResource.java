package br.mackenzie.resources;

import java.time.LocalDateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.mackenzie.api.Work;

@Path("work")
@Produces(MediaType.APPLICATION_JSON)
public class WorkResource {
	

	@GET
	public Response getWork() {
	Work work = new Work(1, "Leonardo", LocalDateTime.now(), 6);
		
		return Response.ok(work).build();
	}
	
	public Response createWork(Work work) {
		return null;
	}
	
	//post
	

}
