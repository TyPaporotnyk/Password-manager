package Resources;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "password")
public class Password {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String password;

    private String site;

    @Column(name = "user_id")
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password1 = (Password) o;
        return id == password1.id &&
                userId == password1.userId &&
                Objects.equals(password, password1.password) &&
                Objects.equals(site, password1.site);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, site, userId);
    }

    @Override
    public String toString() {
        return "Password{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", site='" + site + '\'' +
                ", userId=" + userId +
                '}';
    }
}
