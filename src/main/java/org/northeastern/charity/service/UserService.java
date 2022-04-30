package org.northeastern.charity.service;

import com.mysql.cj.Session;
import jakarta.persistence.*;
import org.hibernate.SessionFactory;
import org.northeastern.charity.models.Person;
import org.northeastern.charity.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.connection.jpa");

    EntityManager entityManager = entityManagerFactory.createEntityManager();

    EntityTransaction entityTransaction;

    public UserService(){

        entityTransaction = entityManager.getTransaction();

    }


    public void createUser(String name, String email, String password, String phoneNumber){

        entityTransaction.begin();

        User user = new User(name, email, password, phoneNumber);

        entityManager.persist(user);

        entityTransaction.commit();
    }

    public void getUsersById(int userId){



    }


    public List<User> getUsersByName(String givenName){

        List<User> getUsers;

        entityTransaction.begin();

        TypedQuery<User> namedQuery = entityManager.createNamedQuery("User.byName", User.class);

        namedQuery.setParameter(1, givenName);

        getUsers = namedQuery.getResultList();

        entityTransaction.commit();

        return getUsers;
    }







}
