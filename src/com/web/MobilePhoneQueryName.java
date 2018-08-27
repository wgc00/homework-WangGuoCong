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
import java.util.ArrayList;

@WebServlet(value = "/phone/queryName")
public class MobilePhoneQueryName extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String txtName = req.getParameter("txtName");
        InMemoryMobilePhone mobilePhoneDAO = new MyMobilePhoneDAO();
        ArrayList<MobilePhone> phoneList = mobilePhoneDAO.getMobilePhoneByName(txtName);
        req.setAttribute("phoneList", phoneList);
        req.getRequestDispatcher("../jsp/phone_index.jsp").forward(req, resp);
    }
}
