package com.DemoProject.RegoistarationAPI.Controller;

import com.DemoProject.RegoistarationAPI.Model.User;
import com.DemoProject.RegoistarationAPI.Repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManageController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/getAllUsers")
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @PostMapping("/add")
    public String save(@RequestBody User user){
        userRepo.save(user);
        return "Saved";
    }
}
