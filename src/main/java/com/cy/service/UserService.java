package com.cy.service;

import com.cy.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers(Integer userId);
}
