package com.example.bappdat.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bappdat.models.BudgetCategory;
import com.example.bappdat.services.BudgetService;

@RequestMapping("/api/v1/budget")
@RestController
public class BudgetController {
    BudgetService budService;

    public BudgetController(BudgetService budService){
        this.budService = budService;
    }
    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint(){
        return ResponseEntity.ok("This api is working");
    }

    @GetMapping
    public ResponseEntity<List<BudgetCategory>> getAllBudgets(){
        return new ResponseEntity<> (budService.getBudgets(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BudgetCategory> addBudget(@RequestBody BudgetCategory budget){
        return new ResponseEntity<>(budService.addBudgetCateogry(budget), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BudgetCategory> updateBudget(@RequestBody BudgetCategory newBud, @PathVariable Long id){
        return new ResponseEntity<>(budService.updateBudget(newBud, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BudgetCategory> deleteBudget(@PathVariable Long id){
        budService.deleteBudget(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
