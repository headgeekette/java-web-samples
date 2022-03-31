package com.sample.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.bean.Employee;
import com.sample.dao.EmployeeDAO;

@WebServlet(name = "employeeControllerServlet", urlPatterns = "/home")
public class EmployeeControllerServlet extends HttpServlet {

    // private static final long serialVersionUID = 1L;
    private EmployeeDAO employeeDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        employeeDAO = new EmployeeDAO();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // String action = req.getServletPath();

        List<Employee> listEmployee = employeeDAO.getAll();
        req.setAttribute("listEmployee", listEmployee);
        // req.setAttribute("greetings", "Hello there!");
        RequestDispatcher dispatcher = req.getRequestDispatcher("results.jsp");
        dispatcher.forward(req, resp);
    }

}
