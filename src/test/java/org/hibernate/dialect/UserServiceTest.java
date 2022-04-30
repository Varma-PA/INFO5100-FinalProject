package org.hibernate.dialect;

import org.junit.Test;
import org.northeastern.charity.models.User;
import org.northeastern.charity.service.UserService;

public class UserServiceTest {

    @Test
    public void test1(){

        UserService userService = new UserService();

        userService.createUser("Achyuth", "achyuth@email.com", "achyuth", "2211992233");


    }


}
