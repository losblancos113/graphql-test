package com.hmtri.graphqltest.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hmtri.graphqltest.dao.PostDAO;
import com.hmtri.graphqltest.model.Author;
import com.hmtri.graphqltest.model.Post;

import java.util.List;

public class AuthorResolver implements GraphQLResolver<Author> {
    private PostDAO postDao;

    public AuthorResolver(PostDAO postDao) {
        this.postDao = postDao;
    }

    public List<Post> getPosts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}
