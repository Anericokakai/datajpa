package com.example.datajpa.repository;

import com.example.datajpa.models.Items;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository  extends JpaRepository<Items, Integer> {
}
