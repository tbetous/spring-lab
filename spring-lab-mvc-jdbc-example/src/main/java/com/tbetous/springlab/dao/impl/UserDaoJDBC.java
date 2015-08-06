package com.tbetous.springlab.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.tbetous.springlab.dao.UserDao;
import com.tbetous.springlab.dao.rmapper.UserRowMapper;
import com.tbetous.springlab.data.User;

public class UserDaoJDBC extends JdbcDaoSupport implements UserDao {
    
    public List<User> getUsers() {
        return getJdbcTemplate().query(
                "SELECT * FROM user",
                new UserRowMapper()
        );
    }
    
    public Optional<User> getUsers(Long id) {
        List<User> users = getJdbcTemplate().query(
                "SELECT * FROM user WHERE user.id = ?",
                new UserRowMapper(),
                id
        );
        
        if(users != null && !users.isEmpty()) {
            return Optional.ofNullable(users.get(0));
        } else {
            return Optional.empty();
        }
    }
    
    public void saveUser(User user) {
        getJdbcTemplate().update(
                "INSERT INTO user (pseudo) VALUES (?)",
                user.getPseudo()
        );
    }
    
    public void deleteUser(Long id) {
        getJdbcTemplate().update(
                "DELETE FROM user WHERE user.id = ?",
                id
        );
    }
}
