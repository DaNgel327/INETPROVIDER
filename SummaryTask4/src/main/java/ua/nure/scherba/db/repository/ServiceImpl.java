package ua.nure.scherba.db.repository;

import ua.nure.scherba.db.entity.PackageServices;
import ua.nure.scherba.db.builders.QueryBuilder;
import ua.nure.scherba.db.builders.ServiceQueryBuilder;

import java.util.List;

/**
 * @author D.Shcherba
 */
public class ServiceImpl implements IService {
    private static final String GET_ALL = "SELECT * FROM epamfinalproject.services";
    private static final String GET_BY_ID = "SELECT id, name, description FROM epamfinalproject.services WHERE id = ?";
    private static final String CREATE = "INSERT INTO epamfinalproject.services (name, description) VALUES (?, ?)";
    private static final String UPDATE = "UPDATE epamfinalproject.services SET name = ?, description = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM epamfinalproject.services WHERE id = ?";

    private DBManager instance = DBManager.getInstance();

    @Override
    public List<PackageServices> getAll() {
        QueryBuilder queryBuilder = new ServiceQueryBuilder();
        return queryBuilder.executeAndReturnList(instance, GET_ALL);
    }

    @Override
    public PackageServices getById(long id) {
        QueryBuilder queryBuilder = new ServiceQueryBuilder();
        return (PackageServices) queryBuilder.executeAndReturn(instance, GET_BY_ID, id);
    }

    @Override
    public void create(PackageServices packageServices) {
        QueryBuilder queryBuilder = new ServiceQueryBuilder();
        queryBuilder.execute(instance, CREATE, packageServices.getName(), packageServices.getDescription());
    }

    @Override
    public void update(PackageServices packageServices) {

    }

    @Override
    public void delete(long id) {
        QueryBuilder queryBuilder = new ServiceQueryBuilder();
        queryBuilder.execute(instance, DELETE, id);
    }
}
