package app.launchthis.booksnbeer.web;

import app.launchthis.booksnbeer.model.Beer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("beers")
public class BeersResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Beer> listAllBeers() {

        return Beer.listAll();
    }

    @Path("/ipas")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Beer> listAllIpas() {

        return Beer.list("style like '%IPA'");
    }

    @Path("/stouts")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Beer> listAllStouts() {

        return Beer.list("style like '%Stout'");
    }
}
