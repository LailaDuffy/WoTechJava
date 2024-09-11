package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.User;
import com.datorium.Datorium.API.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    public UserController(){
        userService = new UserService();
    }
    //CRUD
    //AddUser
    //UpdateUser
    //GetUser
    //DeleteUser

    //@GetMapping
    @PostMapping("/add") //localhost:8080/user/add
    public void add(@RequestBody User user) throws IllegalArgumentException {
        userService.add(user);
    }

    @GetMapping("/get")
    public ArrayList<User> get(){
        return userService.get();
    }

    @PostMapping("/update")
    public User update(@RequestBody User user){
        return userService.update(user);
    }
}
