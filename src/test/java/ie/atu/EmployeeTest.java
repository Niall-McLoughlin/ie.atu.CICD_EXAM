package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
Employee myEmp;

    @BeforeEach
    void setUp() {
        myEmp = new Employee();
    }

    @Test
    void employeeNameTest()
    {
  //      assertEquals(12, myEmp.name.lenght);
    }

    @AfterEach
    void tearDown() {
    }
}