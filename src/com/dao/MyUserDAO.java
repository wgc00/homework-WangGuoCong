package com.dao;

import com.Interfaces.InMemoryUsers;
import com.entity.Users;

import java.util.ArrayList;

public class MyUserDAO implements InMemoryUsers {
    private static ArrayList<Users> userDB = new ArrayList<>();

    static {
        Users users = new Users("张三", "123456");
        Users admin = new Users("admin", "888");
        userDB.add(users);
        userDB.add(admin);
    }

    @Override
    public ArrayList<Users> getUserListAll() {
        return userDB;
    }

    @Override
    public Boolean getUserValidate(String name, String pwd) {
        for (Users users : userDB) {
            if (users.getUserName().equals(name)) {
                if (users.getPassword().equals(pwd)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Users getUserAdd(Users u) {
        for (Users users : userDB) {
            if (!(users.getUserName().equals(u.getUserName()))) {
                if (userDB.add(u)){
                    return u;
                }
            }
        }
        return null;
    }
}
