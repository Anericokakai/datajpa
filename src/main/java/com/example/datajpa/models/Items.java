package com.example.datajpa.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items")

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int itemId;


    private String itemName;





}
