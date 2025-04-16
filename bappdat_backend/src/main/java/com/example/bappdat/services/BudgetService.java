package com.example.bappdat.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bappdat.models.BudgetCategory;
import com.example.bappdat.repos.BudgetCategoryRepo;

@Service
public class BudgetService {
    BudgetCategoryRepo budgetRepo;
    public BudgetService(BudgetCategoryRepo budgetRepo){
        this.budgetRepo = budgetRepo;
    }

    public BudgetCategory addBudgetCateogry(BudgetCategory newBudget){
        return budgetRepo.save(newBudget);
    }

    public void deleteBudget(long id){
        budgetRepo.deleteById(id);
        return;
    }

    public BudgetCategory updateBudget(BudgetCategory updatedBudget, Long id){
        BudgetCategory currBudget = budgetRepo.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("This budget allocation does not exist"));
        currBudget.setCategory(updatedBudget.getCategory());
        currBudget.setPercentage(updatedBudget.getPercentage());
        return budgetRepo.save(currBudget);
    }

    public List<BudgetCategory> getBudgets(){
        return budgetRepo.findAll();
    }

    


}
