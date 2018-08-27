package com.Interfaces;

import com.entity.MobilePhone;

import java.util.ArrayList;

public interface InMemoryMobilePhone {

    ArrayList<MobilePhone> getMobilePhoneListAll();             //查询所有数据
    MobilePhone getMobilePhoneById(int id);                     //通过id查询数据
    ArrayList<MobilePhone> getMobilePhoneByName(String name);   //通过name查询数据
    MobilePhone getMobilePhoneAdd(MobilePhone mobilePhone);     //添加数据
    Boolean getMobilePhoneDelete(int id);                       //通过id删除数据
    Boolean getMobilePhoneUpdate(MobilePhone mobilePhone);      //修改数据
}
