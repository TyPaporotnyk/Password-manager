import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestConnection {

    @Test
    public void connectionTest(){
        SessionFactory session = new Configuration().configure().buildSessionFactory();
        System.out.println("Connection is successful");
    }
}
