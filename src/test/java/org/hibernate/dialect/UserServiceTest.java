package org.hibernate.dialect;

import org.junit.Test;
import org.northeastern.charity.models.User;
import org.northeastern.charity.service.UserService;

import java.util.List;

public class UserServiceTest {

    UserService userService = new UserService();

    @Test
    public void createUserInDB(){

//        UserService userService = new UserService();

        userService.createUser("achyuth", "hemanth@email.com", "achyuth", "2211992233");


    }

    @Test
    public void getUsersList(){

//        UserService userService = new UserService();


        List<User> getUsersByGivenName = userService.getUsersByName("achyuth");

        getUsersByGivenName.forEach(System.out::println);

    }


}
