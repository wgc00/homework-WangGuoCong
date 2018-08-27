package com.web;

import com.Interfaces.InMemoryMobilePhone;
import com.dao.MyMobilePhoneDAO;
import com.entity.MobilePhone;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/phone/update")
public class MobilePhoneUpdate extends HttpServlet {
    InMemoryMobilePhone mobilePhoneDAO = new MyMobilePhoneDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        System.out.println(id);
        MobilePhone phone = mobilePhoneDAO.getMobilePhoneById(id);
        resp.getWriter().write(new Gson().toJson(phone));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        float price = Float.parseFloat(req.getParameter("price"));
        String company = req.getParameter("company");
        MobilePhone phone = new MobilePhone(id, name, brand, price, company);
        Boolean update = mobilePhoneDAO.getMobilePhoneUpdate(phone);
        resp.sendRedirect("/phone/query");
    }
}
