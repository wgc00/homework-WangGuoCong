package com.test;

import com.Interfaces.InMemoryUsers;
import com.dao.MyUserDAO;
import com.entity.Users;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

     /*   InMemoryMobilePhone mobilePhoneDAO = new MyMobilePhoneDAO();

        ArrayList<MobilePhone> x = mobilePhoneDAO.getMobilePhoneByName("X");
        for (MobilePhone mobilePhone : x) {
            System.out.println(mobilePhone.getCompany());
        }
        System.out.println("==============================================");
        mobilePhoneDAO.getMobilePhoneDelete(2);
        ArrayList<MobilePhone> phoneListAll = mobilePhoneDAO.getMobilePhoneListAll();
        for (MobilePhone mobilePhone : phoneListAll) {
            System.out.println(mobilePhone.getName());
        }*/
        InMemoryUsers usersDAO = new MyUserDAO();
        String name= "admin";
        String pwd = "888";
        Boolean userValidate = usersDAO.getUserValidate(name,pwd);
        if (userValidate){
            System.out.println("验证成功");
        }else{
            System.out.println("验证失败");
        }
        Users users = new Users("李四","111");
        Users userAdd = usersDAO.getUserAdd(users);
        ArrayList<Users> userListAll = usersDAO.getUserListAll();
        for (Users users1 : userListAll) {
            System.out.println(users1.getUserName());
        }

    }
}
