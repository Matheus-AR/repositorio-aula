package com.matheus.aula_spring_data_jpa.repository;

import com.matheus.aula_spring_data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
