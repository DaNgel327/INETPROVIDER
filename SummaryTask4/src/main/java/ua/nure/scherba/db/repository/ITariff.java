package ua.nure.scherba.db.repository;

import ua.nure.scherba.db.entity.Tariff;

import java.util.List;

/**
 * @author D.Shcherba
 */
public interface ITariff extends IEntity<Tariff> {

    List<Tariff> getAllByServiceId(long id);

    Tariff getByName(String name);
}
