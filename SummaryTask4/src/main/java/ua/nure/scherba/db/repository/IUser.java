package ua.nure.scherba.db.repository;

import ua.nure.scherba.db.entity.Tariff;
import ua.nure.scherba.db.entity.User;

import java.util.List;

/**
 * @author D.Shcherba
 */
public interface IUser extends IEntity<User> {

    User getByLogin(String login);

    List<Tariff> getTariffs(User user);

    void addLinksUsersHasTariffs(User user, String[] tariffsId);

    void deleteLinksUsersHasTariffs(User user);
}
