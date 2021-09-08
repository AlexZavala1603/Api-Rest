package com.appirest.Api.Rest.dao;

import com.appirest.Api.Rest.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
}