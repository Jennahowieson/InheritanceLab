import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class ManagerTest {
        Manager manager;

        @Before
        public void before() {
            manager = new Manager("Bill", 456, 45000, "HR");
        }

        @Test
        public void managerHasName() {
            assertEquals("Bill", manager.getName());
        }

        @Test
        public void managerHasNiNumber(){
            assertEquals(456, manager.getNiNumber());
        }

        @Test
        public void managerHasSalary(){
            assertEquals(45000, manager.getSalary(),0.0);
        }

        @Test
        public void managerHasDepartment(){
            assertEquals("HR", manager.getDeptName());
        }

        @Test
        public void managerCanRaiseSalary(){
            manager.raiseSalary(5000);
            assertEquals(50000, manager.getSalary(),0.0);
        }

        @Test
        public void managerCanGetBonus(){
            assertEquals(450, manager.payBonus(), 0.0);
        }

        @Test
        public void canSetName(){
            manager.setName("Jane");
            assertEquals("Jane", manager.getName());
        }

        @Test
        public void cantSetNullAsName(){
            manager.setName(null);
            assertEquals("Bill", manager.getName());
        }
}
