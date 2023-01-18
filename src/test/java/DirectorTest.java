import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DirectorTest {
         Director director;

        @Before
        public void before() {
            director = new Director("Jill", 908, 75000, "CEO", 1000000);
        }

        @Test
        public void directorHasName() {
            assertEquals("Jill", director.getName());
        }

        @Test
        public void directorHasNiNumber(){
            assertEquals(908, director.getNiNumber());
        }

        @Test
        public void directorHasSalary(){
            assertEquals(75000, director.getSalary(),0.0);
        }

        @Test
        public void directorHasDepartment(){
            assertEquals("CEO", director.getDeptName());
        }

        @Test
        public void directorCanRaiseSalary(){
            director.raiseSalary(10000);
            assertEquals(85000, director.getSalary(),0.0);
        }

        @Test
        public void directorCanGetBonus(){
            assertEquals(1500, director.payBonus(), 0.0);
        }
    }

