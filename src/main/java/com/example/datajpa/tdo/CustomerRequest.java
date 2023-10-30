package com.example.datajpa.tdo;

import com.example.datajpa.models.Items;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CustomerRequest {
     private String customerName;
     private String items;
}
