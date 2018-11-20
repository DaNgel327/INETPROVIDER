package ua.nure.scherba.web.command;

import ua.nure.scherba.web.command.admin.*;
import ua.nure.scherba.web.command.client.AccountCommand;
import ua.nure.scherba.web.command.client.PersonalDataCommand;
import ua.nure.scherba.web.command.common.LogoutCommand;
import ua.nure.scherba.web.command.common.NoCommand;
import ua.nure.scherba.web.command.common.PdfBuilderCommand;
import ua.nure.scherba.web.command.outofcontrol.I18NCommand;
import ua.nure.scherba.web.command.outofcontrol.LoginCommand;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author D.Shcherba
 */
public class CommandFactory {
    private static CommandFactory factory = new CommandFactory();
    private static Map<String, ICommand> commands = new HashMap<>();

    private CommandFactory() {

    }

    public static CommandFactory commandFactory() {
        if (factory == null) {
            factory = new CommandFactory();
        }
        return factory;
    }

    static {
        // common commands
        commands.put("login", new LoginCommand());
        commands.put("logout", new LogoutCommand());
        commands.put("pdf_builder", new PdfBuilderCommand());
        commands.put("no_command", new NoCommand());
        commands.put("i18n", new I18NCommand());
        commands.put("redirect", null);

        // admin commands
        commands.put("main", new MainCommand());
        commands.put("registration", new RegistrationCommand());
        commands.put("edit_client", new EditClientICommand());
        commands.put("profile", new ProfileCommand());
        commands.put("add_tariff", new AddTariffCommand());
        commands.put("edit_tariff", new EditTariffCommand());
        commands.put("remove_tariff", new RemoveTariffCommand());

        // client commands
        commands.put("account", new AccountCommand());
        commands.put("personal_data", new PersonalDataCommand());
    }

    public ICommand getCommand(HttpServletRequest request) {
        String action = request.getParameter("action");
        return commands.get(action);
    }
}
