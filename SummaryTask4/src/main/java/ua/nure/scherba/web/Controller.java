package ua.nure.scherba.web;

import ua.nure.scherba.web.command.ICommand;
import ua.nure.scherba.web.command.CommandFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    private static final long serialVersionUID = -5479890269240210536L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CommandFactory commandFactory = CommandFactory.commandFactory();
        ICommand ICommand = commandFactory.getCommand(req);

        // extract command name from the request
        String page = ICommand.execute(req, resp);
        RequestDispatcher dispatcher = req.getRequestDispatcher(page);

        // if the forward address is not null go to the address
        if (!page.equals("redirect"))
            dispatcher.forward(req, resp);
    }
}