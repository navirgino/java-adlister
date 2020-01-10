import java.util.List;

public interface Contacts {
    List<Contact> all();
    List<Contact> getContacts();
    Contact getContactById(long id);
    long saveContact(Contact contact);
    void deleteContactById(long id);
}
