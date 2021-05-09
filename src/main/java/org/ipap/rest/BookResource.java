package org.ipap.rest;

import org.ipap.rest.data.Book;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/book")
public class BookResource {

    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("The Freelancer's bible", "IDK"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBooks() {
        return Response.status(202)
                .entity(books)
                .build();
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addBook(Book book) {
        if(books.size() > 5) {
            return Response.status(400).entity("No more than 5 books allowed").build();
        }
        books.add(book);
        return Response.ok(book).build();
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book updateBook(@PathParam("id") Integer index, Book book) {
        books.remove((int) index);
        books.add(index, book);
        return book;
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book deleteBook(@PathParam("id") Integer index) {
        return books.remove((int) index);
    }
}
