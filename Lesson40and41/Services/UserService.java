package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.DTOs.User;
import com.datorium.Datorium.API.Repo.UserRepo;

import java.util.ArrayList;

public class UserService {
    private UserRepo userRepo;

    public UserService(){
        userRepo = new UserRepo();
    }

    public void add(User user) throws IllegalArgumentException {
        if (user.name == null || user.name.isEmpty()) {
            throw new IllegalArgumentException("User name is empty");

        } else {
            userRepo.add(user);
        }
    }

    public ArrayList<User> get(){
        return userRepo.get();
    }

    public User update(User user){
        userRepo.update(user);
        return user; // this is a hack, we should remove this
    }
}
