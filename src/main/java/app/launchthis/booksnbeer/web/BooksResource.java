package app.launchthis.booksnbeer.web;

import app.launchthis.booksnbeer.model.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("books")
public class BooksResource {

    @Path("all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> listAllBooks() {

        return Book.listAll();
    }
}