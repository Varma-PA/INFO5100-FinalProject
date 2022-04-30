package org.northeastern.charity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.northeastern.charity.models.Person;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.connection.jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();


        try{

            entityTransaction.begin();

            Person person = new Person(1, "Achyuth");

            entityManager.persist(person);

            entityTransaction.commit();

        }
        finally {
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }




    }
}