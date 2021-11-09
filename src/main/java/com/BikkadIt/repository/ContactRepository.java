package com.BikkadIt.repository;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.BikkadIt.model.Contact;
public interface ContactRepository extends JpaRepository<Contact,Serializable > {

}
