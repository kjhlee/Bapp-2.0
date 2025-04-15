package com.example.bappdat.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bappdat.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
