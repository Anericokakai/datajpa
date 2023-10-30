package com.example.datajpa.models;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "jpa_users")
@Table(name="jpa_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id

//    @SequenceGenerator(name="user_sequence",sequenceName ="user_sequence",allocationSize =1)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
            private Long id;

    @Column(
            name = "username",
            columnDefinition = "TEXT",
            nullable = false,
            unique = true
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







}
