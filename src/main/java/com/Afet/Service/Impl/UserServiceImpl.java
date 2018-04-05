package com.Afet.Service.Impl;

import com.Afet.Entity.User;
import com.Afet.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.metadata.ManagedAttribute;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> users;

    @Override
    public void addRandom() {
        System.out.println("Starting to initialize");
        users.add(new User(generateWord(), generateWord(), generateWord() + "@" + generateWord() + ".ru"));
        System.out.println(users);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
    private String generateWord(){
        StringBuilder sb = new StringBuilder();
        int randomLenght = (int)(Math.random()*12) + 3;
        for (int i = 0; i < randomLenght; i++) {
            sb.append((char)((int)(Math.random()*29) + 96));
        }
        return sb.toString();
    }

    @Autowired
    public void setUsers(List<User> users) {
        this.users = users;
    }

}
