package com.springfundamentals.spring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final Userrepo userrepo;

    // Constructor-based dependency injection
    public UserService(Userrepo userrepo) {
        this.userrepo = userrepo;
    }

    public Users getbyname(String name) {
        return userrepo.getbyname(name);
    }

    public void add(Users user) {
        userrepo.add(user);
    }
}

