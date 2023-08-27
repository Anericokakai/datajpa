package com.example.datajpa.models;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_users")

public class User {

    @Id

//    @SequenceGenerator(name="user_sequence",sequenceName ="user_sequence",allocationSize =1)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
            private Long id;

    @Column(
            name = "username",
            columnDefinition = "TEXT",
            nullable = false

    )
            private  String username ;
    @Column(
            name = "email",
            columnDefinition = "TEXT",
            nullable = false,
            unique = true

    )

    private String email;
    @Column(
            name = "password",
            columnDefinition = "TEXT",
            nullable = false

    )

    private String password;


    public User() {
    }

    public User(Long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
