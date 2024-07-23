package com.matheus.aula_spring_data_jpa;

import com.matheus.aula_spring_data_jpa.model.User;
import com.matheus.aula_spring_data_jpa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Matheus");
        user.setUsername("matheus");
        user.setPassword("matheus123");

        System.out.println(user);
    }
}
