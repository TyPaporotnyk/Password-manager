package Resources;

public class Password {
    private int id;

    private String password;

    private String site;

    private int userId;

    public Password() { }

    public Password(int id, String password, String site) {
        this.id = id;
        this.password = password;
        this.site = site;
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

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
