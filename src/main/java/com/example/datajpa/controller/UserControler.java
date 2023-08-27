package com.example.datajpa.controller;

import com.example.datajpa.models.User;
import com.example.datajpa.services.SecondUserService;
import com.example.datajpa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserControler {

//
////user  datatype
//
//
//    private final UserService userService;
//    @Autowired
//
//    public UserControler(UserService userService) {
//        this.userService = userService;
//    }
//    @GetMapping(value = "/all")
//    public List<User> getusers(){
//        return userService.getusers();
//    }
//
////    get mappings
//
////    Add a new User
//    @PostMapping(value="/new_user")
//    public User saveUsers(@RequestBody User user){
//        return userService.saveUser(user);
//
//    }
//
//    @GetMapping(value="login_users")
//    public List<User> getuserByEmail(@Param("name") String name , @Param("email") String email){
//
//return userService.getuserByEmail(email);
//
//    }

//    find user by the second service

    public SecondUserService secondUserService;

    public UserControler(SecondUserService secondUserService){
        this.secondUserService=secondUserService;
    }


    @GetMapping(value ="/find")
    public Optional<User> findOne(@Param("id") Long id){
        return secondUserService.findOne(id);
    }

    @GetMapping("/findByName")
    public  List<User> findByUName(@Param("name") String name){

        return secondUserService.findByUName(name);

    }

}
