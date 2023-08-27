package com.example.datajpa.services;

import com.example.datajpa.models.User;
import com.example.datajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {



    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getusers(){
        return userRepository.findAll();
    }
//    Save users
    public  User saveUser(User user){
        return  userRepository.save(user);
    }

public  List <User> getuserByEmail(String email){
        return userRepository.findByEmail(email);
}




}
