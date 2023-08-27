package com.example.datajpa.services;

import com.example.datajpa.models.User;
import com.example.datajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecondUserService {

    private UserRepository userRepository;

    @Autowired
    public SecondUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findOne(Long id){
        return userRepository.findById(id);

    }

    public List<User> findByUName(String username ){
        return userRepository.findByUserName(username);
    }



}
