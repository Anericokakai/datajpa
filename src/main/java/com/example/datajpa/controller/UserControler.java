package com.example.datajpa.controller;

import com.example.datajpa.models.User;
import com.example.datajpa.services.UserService;
import com.example.datajpa.tdo.CustomerRequest;
import com.example.datajpa.tdo.UserRequest;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserControler {
    private  final UserService userService;


    @GetMapping("/find/email")
    public  ResponseEntity<?> findByEmail(@RequestParam("email") String  email){

        var user=userService.getuserByEmail(email);
        return  ResponseEntity.ok().body(user);

    }
    @PostMapping("/new/cust")
    public  String  saveCust(@RequestBody CustomerRequest customerRequest){
        return  userService.saveCustomers(customerRequest);
    }

    @GetMapping(value ="/find")
    public Optional<User> findOne(@RequestParam("username") String usename){
        return userService.findByUserName(usename);
    }
    @PostMapping("/new")
    public ResponseEntity<?> saveUser(@RequestBody UserRequest userRequest){
  var user=userService.saveUser(userRequest);
  return  ResponseEntity.ok().body(user);
    }

    @GetMapping("/findByName")
    public  List<User> findByUName(@Param("name") String name){

        return  null;

    }

}
