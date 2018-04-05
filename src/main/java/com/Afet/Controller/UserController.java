package com.Afet.Controller;

import com.Afet.Entity.User;
import com.Afet.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService userService;

    @GetMapping("/getmessage_{message}")
    public String getMessage(@PathVariable String message){
        return message;
    }
    @GetMapping
    public List<User> getAll(){
        return userService.getAllUsers();
    }
    @GetMapping("/init")
    public void usersInit(){
        userService.addRandom();
    }

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }


}
