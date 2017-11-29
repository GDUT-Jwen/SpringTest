import com.jwen.springtest.dao.PersonDao;
import com.jwen.springtest.entry.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestJdbc extends BaseJunit4Test {

    @Autowired
    private PersonDao pd;

    @Test
    public void testInsert() {

        Person person = new Person();
        person.setId(2);
        person.setName("jwen");
        person.setAge(25);

        pd.insert(person);

    }


    @Test
    public void testDelete() {

        try {
            pd.delete(2);

        } catch (Exception e) {

        }
    }
}
