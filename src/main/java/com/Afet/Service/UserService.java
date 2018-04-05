package com.Afet.Service;


import com.Afet.Entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addRandom();
}
