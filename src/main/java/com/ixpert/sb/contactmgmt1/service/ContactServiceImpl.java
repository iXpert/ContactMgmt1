package com.ixpert.sb.contactmgmt1.service;

import com.ixpert.sb.contactmgmt1.model.Contact;
import com.ixpert.sb.contactmgmt1.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;

    @Autowired
    public void setContactRepository(ContactRepository contactRepository1){
        this.contactRepository = contactRepository1;
    }

    @Override
    public Iterable<Contact> getAllContacts() {
        return this.contactRepository.findAll();
    }

    @Override
    public Contact getContactById(Integer id) {
        return this.contactRepository.getOne(id);
    }

    @Override
    public Contact saveContact(Contact contact) {
        return this.contactRepository.save(contact);
    }

    @Override
    public void delteContact(Integer id) {
        Contact contact = getContactById(id);
        this.contactRepository.delete(contact);
    }
}
