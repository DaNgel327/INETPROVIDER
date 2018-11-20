package ua.nure.scherba.db.repository;

import ua.nure.scherba.db.entity.Account;
import ua.nure.scherba.db.builders.AccountQueryBuilder;
import ua.nure.scherba.db.builders.QueryBuilder;

import java.util.List;

/**
 * @author D.Shcherba
 */
public class AccountImpl implements IAccount {
    private static final String CREATE = "INSERT INTO epamfinalproject.accounts (id, number, balance) VALUES (?, ?, ?)";
    private static final String GET_ALL = "SELECT * FROM epamfinalproject.accounts";
    private static final String GET_BY_ID = "SELECT id, number, balance FROM epamfinalproject.accounts WHERE id = ?";
    private static final String UPDATE = "UPDATE epamfinalproject.accounts SET balance = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM epamfinalproject.accounts WHERE id = ?";
    private static final String GET_NEXT_AUTO_INCREMENT = "SELECT `AUTO_INCREMENT` FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'epamfinalproject' AND TABLE_NAME = 'users'";
    private static final String GET_MAX_ID = "SELECT MAX(id) FROM accounts";

    private DBManager instance = DBManager.getInstance();
    private QueryBuilder queryBuilder = new AccountQueryBuilder();

    @Override
    public List<Account> getAll() {
        return this.queryBuilder.executeAndReturnList(instance, GET_ALL);
    }

    @Override
    public Account getById(long id) {
        return (Account) this.queryBuilder.executeAndReturn(instance, GET_BY_ID, id);
    }

    @Override
    public void create(Account account) {
        long id = queryBuilder.getNextAutoIncrement(instance, GET_NEXT_AUTO_INCREMENT);
        this.queryBuilder.execute(instance, CREATE, id, account.getNumber(), account.getBalance());
    }

    @Override
    public void update(Account account) {
        this.queryBuilder.execute(instance, UPDATE, account.getBalance(), account.getId());
    }

    @Override
    public void delete(long id) {
        this.queryBuilder.execute(instance, DELETE, id);
    }

    @Override
    public long newNumberContract() {
        long accountNumber = 0;
        long id = queryBuilder.getNextAutoIncrement(instance, GET_MAX_ID);
        Account account = getById(id);

        if (account != null) {
            accountNumber = 1 + account.getNumber();
        }

        return accountNumber;
    }
}
