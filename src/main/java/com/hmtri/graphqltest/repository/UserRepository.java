package com.hmtri.graphqltest.repository;

import com.hmtri.graphqltest.model.User;
import org.springframework.data.cassandra.core.mapping.MapId;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CassandraRepository<User, String> {
    List<User> findByPartnerId(String partnerId);
}
