package com.web;

import com.Interfaces.InMemoryUsers;
import com.dao.MyUserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/phone/userLogin")
public class UsersListAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        InMemoryUsers usersDAO = new MyUserDAO();
        Boolean userValidate = usersDAO.getUserValidate(name, pwd);

        if (userValidate){
            req.setAttribute("name",name);
            req.getRequestDispatcher("/phone/query").forward(req,resp);
        }else{


            resp.sendRedirect("../jsp/user_login.jsp");
        }
    }

    /*
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }*/
}
