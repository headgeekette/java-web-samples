package com.sample;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.data.RecordDAO;
import com.sample.model.Record;

@WebServlet(name = "homeServlet", urlPatterns = "/Home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RecordDAO recordDAO = new RecordDAO();
        List<Record> records = recordDAO.getAll();

        req.setAttribute("records", records);
        RequestDispatcher view = req.getRequestDispatcher("home.jsp");
        view.forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}
