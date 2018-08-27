package com.web;

import com.Interfaces.InMemoryUsers;
import com.dao.MyUserDAO;
import com.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/userAdd")
public class UsersAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  req.getRequestDispatcher("../jsp/user_register.jsp").forward(req,resp);
        resp.sendRedirect("../jsp/user_register.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        InMemoryUsers usersDAO = new MyUserDAO();
        Users users = new Users(name,pwd);
        usersDAO.getUserAdd(users);
        resp.sendRedirect("/phone/userLogin");
    }
}
