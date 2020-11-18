package com.DemoProject.RegoistarationAPI.Repositry;

import com.DemoProject.RegoistarationAPI.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
