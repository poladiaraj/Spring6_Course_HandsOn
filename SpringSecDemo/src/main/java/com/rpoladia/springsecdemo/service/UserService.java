package com.rpoladia.springsecdemo.service;

import com.rpoladia.springsecdemo.model.User;
import com.rpoladia.springsecdemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println("Hashed password: " + user.getPassword());
        return userRepo.save(user);
    }
}
