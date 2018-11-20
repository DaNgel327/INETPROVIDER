package ua.nure.scherba.db.services;

import ua.nure.scherba.db.entity.Account;

import java.util.List;

/**
 * @author D.Shcherba
 */
public interface IAccountService {

    List<Account> findAll();

    Account find(long id);

    void save(Account account);

    void update(Account account);

    void remove(long id);

    long getNumberContract();
}
