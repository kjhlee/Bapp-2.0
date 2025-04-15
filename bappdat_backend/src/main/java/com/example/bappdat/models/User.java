package com.example.bappdat.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long user_id;

    private String fName;

    private String lName;

    private String username;

    private String password;

    // List of incomes
    // ArrayList<Incomes> incomes = new ArrayList<>();

    // List of Budgets Categories
    ArrayList<BudgetCategory> cats = new ArrayList<>();



}
