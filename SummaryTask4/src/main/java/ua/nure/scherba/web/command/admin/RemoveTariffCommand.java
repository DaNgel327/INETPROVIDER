package ua.nure.scherba.web.command.admin;

import ua.nure.scherba.Path;
import ua.nure.scherba.db.services.ITariffService;
import ua.nure.scherba.db.services.TariffServiceImpl;
import ua.nure.scherba.web.command.ICommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author D.Shcherba
 */
public class RemoveTariffCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        ITariffService service = new TariffServiceImpl();
        int tariffId = Integer.parseInt(request.getParameter("tariff_id"));
        service.remove(tariffId);
        return Path.COMMAND_MAIN;
    }
}
