package com.tbetous.springlab.dao;

import java.util.List;
import java.util.Optional;

import com.tbetous.springlab.data.User;

public interface UserDao {
    
    /**
     * Get all users in the database.
     * @return Return all users in the database.
     */
    public List<User> getUsers();
    
    /**
     * Get a specific user
     * @param id the id of the user
     * @return the specific user
     */
    public Optional<User> getUsers(Long id);
    
    /**
     * Save a new user in the database.
     * @param user The user to save.
     */
    public void saveUser(User user);
    
    /**
     * Delete a user
     * @param user The user to delete.
     */
    public void deleteUser(Long id);
}
