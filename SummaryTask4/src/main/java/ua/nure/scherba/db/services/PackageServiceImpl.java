package ua.nure.scherba.db.services;

import ua.nure.scherba.db.entity.PackageServices;
import ua.nure.scherba.db.repository.IService;
import ua.nure.scherba.db.repository.ServiceImpl;

import java.util.List;

/**
 * @author D.Shcherba
 */
public class PackageServiceImpl implements IPackageService {
    private final IService repo = new ServiceImpl();

    @Override
    public List<PackageServices> findAll() {
        return this.repo.getAll();
    }

    @Override
    public PackageServices find(long id) {
        return this.repo.getById(id);
    }

    @Override
    public void save(PackageServices service) {
        this.repo.create(service);
    }

    @Override
    public void update(PackageServices service) {
        this.repo.update(service);
    }

    @Override
    public void remove(long id) {
        this.repo.delete(id);
    }
}
