package com.BikkadIt.service;
import java.util.List;
import com.BikkadIt.model.Contact;
public interface ContactServiceI {
boolean saveContact(Contact contact);
List<Contact> getAllContacts();
Contact getContactById(Integer cid);
boolean deleteContactById(Integer cid);
}
