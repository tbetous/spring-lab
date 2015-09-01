package com.tbetous.springlab.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tbetous.springlab.dao.UserDao;
import com.tbetous.springlab.data.User;
import com.tbetous.springlab.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    @Qualifier("userDaoFullJPA")
    public UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public Optional<User> getUsers(Long id) {
        return userDao.getUsers(id);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
    
}
