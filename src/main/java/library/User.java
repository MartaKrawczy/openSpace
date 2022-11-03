package library;

public class User {
    String name;
    String surname;
    ID id;

    void registerUser(String name, String surmane, ID id) {
        this.name = name;
        this.surname = surmane;
        this.id = id;
    }

    public ID getId() {
        return id;
    }

}
