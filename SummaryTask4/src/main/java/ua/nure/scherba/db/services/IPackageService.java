package ua.nure.scherba.db.services;

import ua.nure.scherba.db.entity.PackageServices;

import java.util.List;

/**
 * @author D.Shcherba
 */
public interface IPackageService {

    List<PackageServices> findAll();

    PackageServices find(long id);

    void save(PackageServices service);

    void update(PackageServices service);

    void remove(long id);
}
