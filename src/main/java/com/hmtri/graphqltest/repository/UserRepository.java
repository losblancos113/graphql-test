package com.hmtri.graphqltest.repository;

import com.hmtri.graphqltest.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CassandraRepository<User, String> {
}
