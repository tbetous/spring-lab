package com.tbetous.springlab.dao.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.tbetous.springlab.dao.UserDao;
import com.tbetous.springlab.data.User;

public class UserDaoFullJPA implements UserDao {
    
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getUsers() {
        Query query = em.createQuery("SELECT u FROM user u");
        return Collections.checkedList(query.getResultList(), User.class);
    }

    @Override
    public Optional<User> getUsers(Long id) {
        User user = em.find(User.class, id);
        return Optional.<User>ofNullable(user);
    }

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = em.find(User.class, id);
        if (user != null) {
            em.remove(user);
        }
    }
    
    

}
