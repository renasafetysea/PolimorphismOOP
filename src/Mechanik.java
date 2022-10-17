public class Mechanik <T extends Transport> {
    String name;
    String surname;
    String company;

    public Mechanik(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }
    public boolean service(T t){
        return t.diagnostics();
    }
    public void repair(T t){
        t.repair();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }
}


