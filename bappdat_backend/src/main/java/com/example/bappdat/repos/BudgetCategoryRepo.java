package com.example.bappdat.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bappdat.models.BudgetCategory;

public interface BudgetCategoryRepo extends JpaRepository<BudgetCategory, Long>{
    
}
