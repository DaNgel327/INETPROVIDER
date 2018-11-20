package ua.nure.scherba.db.services;

import ua.nure.scherba.db.entity.Account;
import ua.nure.scherba.db.repository.AccountImpl;
import ua.nure.scherba.db.repository.IAccount;

import java.util.List;

/**
 * @author D.Shcherba
 */
public class AccountServiceImpl implements IAccountService {
    private final IAccount repo = new AccountImpl();

    @Override
    public List<Account> findAll() {
        return this.repo.getAll();
    }

    @Override
    public Account find(long id) {
        return this.repo.getById(id);
    }

    @Override
    public void save(Account account) {
        this.repo.create(account);
    }

    @Override
    public void update(Account account) {
        this.repo.update(account);
    }

    @Override
    public void remove(long id) {
        this.repo.delete(id);
    }

    @Override
    public long getNumberContract() {
        return repo.newNumberContract();
    }
}
