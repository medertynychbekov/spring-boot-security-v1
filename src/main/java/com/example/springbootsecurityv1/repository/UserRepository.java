package com.example.springbootsecurityv1.repository;

import com.example.springbootsecurityv1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("from User where name = ?1")
    User findByName(String name);
}
