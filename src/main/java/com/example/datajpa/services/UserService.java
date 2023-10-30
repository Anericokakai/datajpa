package com.example.datajpa.services;

import com.example.datajpa.models.Customer;
import com.example.datajpa.models.Items;
import com.example.datajpa.models.User;
import com.example.datajpa.repository.CustomerRepository;
import com.example.datajpa.repository.UserRepository;
import com.example.datajpa.tdo.CustomerRequest;
import com.example.datajpa.tdo.UserRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService { ;

    private final UserRepository userRepository;
    private  final  CustomerRepository customerRepository;

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
public  String  saveCustomers(CustomerRequest customer){

        Items items=Items.builder()
                .itemName(customer.getItems()).build();
        Customer customer1= Customer.builder()
                .customerName(customer.getCustomerName())
                .items(items).build();
      customerRepository.save(customer1);
      return  "User saved success";


}




}
