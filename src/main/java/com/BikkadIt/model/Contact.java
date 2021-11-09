package com.BikkadIt.model;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Contact {
@Id
Integer contactId;
String contactName;
Long contactNumber;
Character activeSw;
LocalDate createdDate;
LocalDate updatedDate;
public Integer getContactId() {
	return contactId;
}
public void setContactId(Integer contactId) {
	this.contactId = contactId;
}
public String getContactName() {
	return contactName;
}
public void setContactName(String contactName) {
	this.contactName = contactName;
}
public Long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(Long contactNumber) {
	this.contactNumber = contactNumber;
}
public Character getActiveSw() {
	return activeSw;
}
public void setActiveSw(Character activeSw) {
	this.activeSw = activeSw;
}
public LocalDate getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(LocalDate createdDate) {
	this.createdDate = createdDate;
}
public LocalDate getUpdatedDate() {
	return updatedDate;
}
public void setUpdatedDate(LocalDate updatedDate) {
	this.updatedDate = updatedDate;
}
@Override
public String toString() {
	return "ContactEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
			+ ", activeSw=" + activeSw + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
}
}
