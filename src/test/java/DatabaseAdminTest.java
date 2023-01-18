import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Joe", 789, 30000);
    }

    @Test
    public void databaseAdminHasName() {
        assertEquals("Joe", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNiNumber(){
        assertEquals(789, databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(30000, databaseAdmin.getSalary(),0.0);
    }


    @Test
    public void databaseAdminCanRaiseSalary(){
        databaseAdmin.raiseSalary(2000);
        assertEquals(32000, databaseAdmin.getSalary(),0.0);
    }

    @Test
    public void databaseAdminCanGetBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.0);
    }
}