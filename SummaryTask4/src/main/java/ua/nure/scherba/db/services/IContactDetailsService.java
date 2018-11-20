package ua.nure.scherba.db.services;

import ua.nure.scherba.db.entity.ContactDetails;

import java.util.List;

/**
 * @author D.Shcherba
 */
public interface IContactDetailsService {

    List<ContactDetails> findAll();

    ContactDetails find(long id);

    void save(ContactDetails account);

    void update(ContactDetails account);

    void remove(int id);
}
