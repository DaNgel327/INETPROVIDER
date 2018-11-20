package ua.nure.scherba.db.repository;

import ua.nure.scherba.db.entity.Entity;

import java.util.List;

/**
 * @author D.Shcherba
 */
public interface IEntity<T extends Entity> {
    List<T> getAll();

    T getById(long id);

    void create(T t);

    void update(T t);

    void delete(long id);
}
