package com.web;

import com.Interfaces.InMemoryMobilePhone;
import com.dao.MyMobilePhoneDAO;
import com.entity.MobilePhone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/phone/add")
public class MobilePhoneAdd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../jsp/phone_add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        float price = Float.parseFloat(req.getParameter("price"));
        String company = req.getParameter("company");
        InMemoryMobilePhone mobilePhoneDAO = new MyMobilePhoneDAO();
        MobilePhone phone = new MobilePhone(id, name, brand, price, company);
        mobilePhoneDAO.getMobilePhoneAdd(phone);
        resp.sendRedirect("/phone/query");
    }
}
