package ua.nure.scherba.web.command.common;

import ua.nure.scherba.Path;
import ua.nure.scherba.web.command.ICommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author D.Shcherba
 */
public class NoCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String errorMessage = "No such command";
        request.setAttribute("errorMessage", errorMessage);
        return Path.PAGE_ERROR_PAGE;
    }
}
