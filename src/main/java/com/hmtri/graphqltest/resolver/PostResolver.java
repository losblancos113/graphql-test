package com.hmtri.graphqltest.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hmtri.graphqltest.dao.AuthorDAO;
import com.hmtri.graphqltest.model.Author;
import com.hmtri.graphqltest.model.Post;

import java.util.Optional;

public class PostResolver implements GraphQLResolver<Post> {
    private AuthorDAO authorDao;

    public PostResolver(AuthorDAO authorDao) {
        this.authorDao = authorDao;
    }

    public Optional<Author> getAuthor(Post post) {
        return authorDao.getAuthor(post.getAuthorId());
    }
}
