package com.hmtri.graphqltest;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hmtri.graphqltest.model.User;
import com.hmtri.graphqltest.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
