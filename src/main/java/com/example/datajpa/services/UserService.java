package com.example.datajpa.services;

import com.example.datajpa.models.User;
import com.example.datajpa.repository.UserRepository;
import com.example.datajpa.tdo.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public  User saveUser(UserRequest userRequest){
        User newUser= User.builder()
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .username(userRequest.getUsername())
                .build();

         return userRepository.save(newUser);


    }

public  Optional <User> getuserByEmail(String email){

        return userRepository.findByEmail(email);
}

public Optional<User>  findByUserName(String username){
        return userRepository.findByUserName(username);

}




}
