package com.appirest.Api.Rest.controllers;

import com.appirest.Api.Rest.dao.UserDAO;
import com.appirest.Api.Rest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

// Controladores manejan las URL's
@RestController
public class UserController {

    @Autowired // Inyección de dependencias
    private UserDAO userDAO;

    @RequestMapping(value = "getUserInfo")
    public User getUserInfo() {
        User user = new User();
        user.setId(1);
        user.setName("Alex");
        user.setEmail("prueba@arkondata.com");
        user.setPassword("admin");
        user.setAge(20);
        return user;
    }

    @RequestMapping(value = "getUser/{id}")
    public User getUser(@PathVariable int id) {
        User user = new User();
        user.setId(id);
        user.setName("Alex");
        user.setEmail("prueba@arkondata.com");
        user.setPassword("admin");
        user.setAge(20);
        return user;
    }

    @RequestMapping(value = "api/users")
    public List<User> users() {
        return userDAO.getUsers();
    }

    @RequestMapping(value = "allUsers")
    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        user1.setId(1);
        user1.setName("Alex");
        user1.setEmail("prueba@arkondata.com");
        user1.setPassword("admin");
        user1.setAge(20);

        user2.setId(2);
        user2.setName("Michael Jackson");
        user2.setEmail("michaeljackson123@music.com");
        user2.setPassword("jacksons5");
        user2.setAge(40);

        user3.setId(3);
        user3.setName("Richard D. Moore");
        user3.setEmail("startrek@voyager.ufp");
        user3.setPassword("DeepSpace9");
        user3.setAge(57);

        user4.setId(4);
        user4.setName("Mark Cox");
        user4.setEmail("mark_cox@starkindustries.com");
        user4.setPassword("c#sghd12");
        user4.setAge(26);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        return users;
    }

}