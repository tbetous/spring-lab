package com.tbetous.springlab.service;

import java.util.List;
import java.util.Optional;

import com.tbetous.springlab.data.User;

public interface UserService {
    public List<User> getUsers();
    public Optional<User> getUsers(Long id);
    public void saveUser(User user);
    public void deleteUser(Long id);
}
