package com.hmtri.graphqltest;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hmtri.graphqltest.dao.PostDAO;
import com.hmtri.graphqltest.model.Post;
import com.hmtri.graphqltest.model.User;
import com.hmtri.graphqltest.mutation.CreateUserInput;
import com.hmtri.graphqltest.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User createUser(CreateUserInput userInput){
        return userRepository.save(new User(userInput.getPartnerId(), userInput.getUserId(), userInput.getStartDate(), userInput.getUserName()));
    }
}
