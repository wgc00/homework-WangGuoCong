package com.Interfaces;

import com.entity.Users;

import java.util.ArrayList;

public interface InMemoryUsers {
    ArrayList<Users> getUserListAll();
    Boolean getUserValidate(String name,String pwd);
    Users getUserAdd(Users users);
}
