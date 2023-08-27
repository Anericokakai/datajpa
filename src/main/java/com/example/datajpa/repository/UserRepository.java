package com.example.datajpa.repository;

import com.example.datajpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

List<User> findByEmail(String email);
List <User> findByUserName(String username);
}
