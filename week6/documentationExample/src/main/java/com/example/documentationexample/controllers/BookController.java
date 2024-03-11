package com.example.documentationexample.controllers;

import com.example.documentationexample.exception.BookNotFoundException;
import com.example.documentationexample.model.Book;
import com.example.documentationexample.repository.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import  org.springframework.data.domain.Page;
import java.util.Collection;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping("/{id}")
    @Operation(summary = "Get a book by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Book.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Book not found",
                    content = @Content) })

    public Book findById(@PathVariable long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException());
    }

    @GetMapping("/")
    public Collection<Book> findBooks() {
        return repository.getBooks();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Book postBook(@RequestBody final Book book) {
        return book;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook(
            @PathVariable("id") final String id, @RequestBody final Book book) {
        return book;
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public long deleteBook(@PathVariable final long id) {
        return id;
    }


    @GetMapping("/filter")
    public Page <Book> filterBooks(@ParameterObject Pageable pageable) {
        return repository.getBooks(pageable);
    }

}