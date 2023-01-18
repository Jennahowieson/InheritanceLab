import management.Manager;
import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("John", 567, 35000);
    }

    @Test
    public void developerHasName() {
        assertEquals("John", developer.getName());
    }

    @Test
    public void developerHasNiNumber(){
        assertEquals(567, developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(35000, developer.getSalary(),0.0);
    }


    @Test
    public void developerCanRaiseSalary(){
        developer.raiseSalary(2000);
        assertEquals(37000, developer.getSalary(),0.0);
    }

    @Test
    public void developerCanGetBonus(){
        assertEquals(350, developer.payBonus(), 0.0);
    }
}