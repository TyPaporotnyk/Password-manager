package Resourses;

public class Password {
    private int id;

    private String password;

    private String toObject;

    public Password() { }

    public Password(int id, String password, String toObject) {
        this.id = id;
        this.password = password;
        this.toObject = toObject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToObject() {
        return toObject;
    }

    public void setToObject(String toObject) {
        this.toObject = toObject;
    }
}
