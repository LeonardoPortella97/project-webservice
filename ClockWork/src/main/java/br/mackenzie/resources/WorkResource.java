package br.mackenzie.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.mackenzie.api.Work;
import br.mackenzie.db.WorkDao;

@Path("work")
@Produces(MediaType.APPLICATION_JSON)
public class WorkResource {
	
	WorkDao workDao;
	
	public WorkResource(WorkDao workDao) {
        this.workDao = workDao;
    }

	@GET
	public Response getWork() {
		List<Work> allWorks = workDao.getAllWorks();
	        return Response.ok(allWorks).build();
	}
	
	@POST
    public Response createWork(Work work) {
        workDao.insertWork(work);
        return Response.status(Response.Status.CREATED).build();
    }
	
	@GET
    @Path("/{id}")
    public Response getProduct(@PathParam("id") int id) {
       Work work = workDao.findById(id);

        if (work == null)
            throw new WebApplicationException("Worked time does not exist", Response.Status.NOT_FOUND);

        return Response.ok(work).build();
    }

}
