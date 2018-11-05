package com.hmtri.graphqltest.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hmtri.graphqltest.model.User;
import com.hmtri.graphqltest.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class UserResolver implements GraphQLResolver<User> {
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
