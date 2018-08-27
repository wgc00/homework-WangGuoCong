package com.web;

import com.Interfaces.InMemoryMobilePhone;
import com.dao.MyMobilePhoneDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/phone/del")
public class MobilePhoneDelete extends HttpServlet {
    InMemoryMobilePhone mobilePhoneDAO = new MyMobilePhoneDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        Boolean delete = mobilePhoneDAO.getMobilePhoneDelete(id);
        resp.sendRedirect("/phone/query");
        // req.getRequestDispatcher("/phone/query").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String[] ids = req.getParameterValues("ids");
        for (String id: ids) {
            mobilePhoneDAO.getMobilePhoneDelete(Integer.parseInt(id));
        }
        resp.sendRedirect("/phone/query");
    }
}
