package ua.nure.scherba.db.repository;

import ua.nure.scherba.db.entity.Account;

/**
 * @author D.Shcherba
 */
public interface IAccount extends IEntity<Account> {
    long newNumberContract();
}
