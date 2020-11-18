package com.DemoProject.RegoistarationAPI.Controller;

import com.DemoProject.RegoistarationAPI.Model.User;
import com.DemoProject.RegoistarationAPI.Repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        userRepo.deleteById(id);
    }
}
