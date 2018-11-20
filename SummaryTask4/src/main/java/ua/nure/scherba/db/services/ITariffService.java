package ua.nure.scherba.db.services;

import ua.nure.scherba.db.entity.Tariff;

import java.util.List;

/**
 * @author D.Shcherba
 */
public interface ITariffService {

    List<Tariff> findAll();

    List<Tariff> findAllById(long id);

    Tariff find(long id);

    Tariff find(String name);

    void save(Tariff tariff);

    void update(Tariff tariff);

    void remove(long id);
}
