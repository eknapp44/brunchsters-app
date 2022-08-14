package com.knapptown.brunchstersapp.controllers;

import com.knapptown.brunchstersapp.repositories.UserRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
