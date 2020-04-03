package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.User;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findByLoginAndPasswd(String login, String passwd);

    User findByLogin(String login);
}
