package ua.nure.scherba.web.command.admin;

import ua.nure.scherba.Path;
import ua.nure.scherba.db.entity.Tariff;
import ua.nure.scherba.db.services.ITariffService;
import ua.nure.scherba.db.services.TariffServiceImpl;
import ua.nure.scherba.web.command.ICommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author D.Shcherba
 */
public class AddTariffCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name").trim();
        String price = request.getParameter("price").trim();
        String description = request.getParameter("description").trim();
        String serviceId = request.getParameter("serviceId");

        String resp = Path.COMMAND_MAIN;

        ITariffService service = new TariffServiceImpl();
        Tariff tariff = new Tariff();
        tariff.setName(name);
        tariff.setPrice(Double.parseDouble(price));
        tariff.setDescription(description);
        tariff.setServiceId(Long.parseLong(serviceId));

        service.save(tariff);
        try {
            response.sendRedirect(resp);
            resp = Path.COMMAND_REDIRECT;
        } catch (IOException e) {
            resp = Path.PAGE_ERROR_PAGE;
        }
        return resp;
    }
}
