// Nama file: MainDAO.java
// Penulis  : Givandra Haikal Adjie
// NIM      : 24060121130063
// Deskripsi: Kelas MainDAO untuk menjalankan program DAO Manager

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("John Doe");
        DAOManager daoManager = new DAOManager();
        daoManager.setPersonDAO(new MySQLPersonDAO());

        try {
            daoManager.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
