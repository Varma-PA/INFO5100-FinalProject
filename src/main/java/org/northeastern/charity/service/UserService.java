package org.northeastern.charity.service;

import com.mysql.cj.Session;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.hibernate.SessionFactory;
import org.northeastern.charity.models.Person;
import org.northeastern.charity.models.User;

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


    public void getUsersByName(String givenName){

    }







}
