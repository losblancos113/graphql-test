package com.hmtri.graphqltest.dao;

import com.hmtri.graphqltest.model.Author;

import java.util.List;
import java.util.Optional;

public class AuthorDAO {
    private List<Author> authors;

    public AuthorDAO(List<Author> authors) {
        this.authors = authors;
    }

    public Optional<Author> getAuthor(String id) {
        return authors.stream().filter(author -> id.equals(author.getId())).findFirst();
    }
}
