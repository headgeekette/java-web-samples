package com.sample;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.model.Record;
import com.sample.model.RecordTypeFieldValue;

@WebServlet(name = "fetchRecordServlet", urlPatterns = "/FetchRecord")
public class FetchRecordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer recordId = 0;
        recordId = Integer.parseInt(req.getParameter("recordId"));

        RetrieveRecordService service = new RetrieveRecordService();
        Record record = service.getRecord(recordId);
        req.setAttribute("record", record);

        List<RecordTypeFieldValue> otherDetails = service.getOtherRecordDetails();
        req.setAttribute("otherDetails", otherDetails);

        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
    }

}
