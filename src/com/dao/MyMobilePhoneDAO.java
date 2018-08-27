package com.dao;

import com.Interfaces.InMemoryMobilePhone;
import com.entity.MobilePhone;

import java.util.ArrayList;

public class MyMobilePhoneDAO implements InMemoryMobilePhone {
    private static ArrayList<MobilePhone> mobileDB = new ArrayList<>();

    static {
        MobilePhone phone1 = new MobilePhone(1, "荣耀6", "华为", 1200.0f, "华为公司");
        MobilePhone phone2 = new MobilePhone(2, "iphone 7 plus", "苹果", 4100.0f, "富士康");
        MobilePhone phone3 = new MobilePhone(3, "X21", "ViVO", 2699.0f, "ViVO公司");
        MobilePhone phone4 = new MobilePhone(4, "GALAXY Note 9", "三星", 3100.0f, "三星公司");
        MobilePhone phone5 = new MobilePhone(5, "小米8", "小米", 2300.0f, "小米公司");
        MobilePhone phone6 = new MobilePhone(6, "Find X", "OPPO", 4200.0f, "OPPO公司");

        mobileDB.add(phone1);
        mobileDB.add(phone2);
        mobileDB.add(phone3);
        mobileDB.add(phone4);
        mobileDB.add(phone5);
        mobileDB.add(phone6);
    }


    @Override
    public ArrayList<MobilePhone> getMobilePhoneListAll() {
        return mobileDB;
    }

    @Override
    public MobilePhone getMobilePhoneById(int id) {
        for (MobilePhone mobilePhone : mobileDB) {
            if (mobilePhone.getId() == id) {
                return mobilePhone;
            }
        }
        return null;
    }

    @Override
    public ArrayList<MobilePhone> getMobilePhoneByName(String name) {
        ArrayList<MobilePhone> mobilePhones = new ArrayList<>();
        for (MobilePhone mobilePhone : mobileDB) {
            if (mobilePhone.getName().toLowerCase().contains(name.toLowerCase())) {
                mobilePhones.add(mobilePhone);
            }else if (mobilePhone.getCompany().toLowerCase().contains(name.toLowerCase())){
                mobilePhones.add(mobilePhone);
            }else if (mobilePhone.getBrand().toLowerCase().contains(name.toLowerCase())){
                mobilePhones.add(mobilePhone);
            }
        }
        return mobilePhones;
    }

    @Override
    public MobilePhone getMobilePhoneAdd(MobilePhone mobilePhone) {
        if (mobileDB.add(mobilePhone)) {
            return mobilePhone;
        }
        return null;
    }

    @Override
    public Boolean getMobilePhoneDelete(int id) {
        for (MobilePhone mobilePhone : mobileDB) {
            if (mobilePhone.getId() == id) {
                return mobileDB.remove(mobilePhone);
            }
        }
        return false;
    }

    @Override
    public Boolean getMobilePhoneUpdate(MobilePhone mobilePhone) {
        for (MobilePhone phone : mobileDB) {
            if (phone.getId() == mobilePhone.getId()) {
                phone.setName(mobilePhone.getName());
                phone.setBrand(mobilePhone.getBrand());
                phone.setPrice(mobilePhone.getPrice());
                phone.setCompany(mobilePhone.getCompany());
                return true;
            }
        }
        return false;
    }
}
