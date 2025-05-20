package com.colab.ColabFarm1.user.dao.impl;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.colab.ColabFarm1.user.dao.UserDao;
import com.colab.ColabFarm1.user.model.User;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Transactional
    @Override
    public User findByEmailId(String email) {
        String hql = "FROM User WHERE email = :email";
        return entityManager.createQuery(hql, User.class)
                .setParameter("email", email)
                .getSingleResult();
    }
}
