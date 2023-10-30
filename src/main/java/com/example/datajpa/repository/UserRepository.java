package com.example.datajpa.repository;

import com.example.datajpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {


    @Query(value = "select  * from jpa_users  where email=?1 limit 1" ,nativeQuery = true )
Optional<User> findByEmail(String email);

@Query("select  ud from jpa_users  ud where  ud.username=?1")
    public Optional<User> findByUserName(String  username);

}
