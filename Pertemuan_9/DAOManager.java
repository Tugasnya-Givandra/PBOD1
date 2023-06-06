// Nama file: DAOManager.java
// Penulis  : Givandra Haikal Adjie
// NIM      : 24060121130063
// Deskripsi: Kelas DAOManager untuk mengatur DAO Person dan MySQLPersonDAO

public class DAOManager {
    private PersonDAO personDAO;

    public DAOManager(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public DAOManager() {
    }

    public void savePerson(Person p) throws Exception {
        personDAO.savePerson(p);
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
