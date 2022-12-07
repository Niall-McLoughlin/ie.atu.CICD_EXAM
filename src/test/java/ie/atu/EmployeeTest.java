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
        myEmp.name = "John doe";
        myEmp.PPS = "123456";

    }

    //  @Test
    //void employeeNameTest()
    //{
    //   assertEquals(12, myEmp.name.length());
    //}

    @Test
    void testNameConstructor() {
        if ((myEmp.name.length() > 5) && (myEmp.name.length() < 22)) {
        }
        else {
            throw new IllegalArgumentException("Name length is invalid");
        }

    }
    @Test
    void testPPsConstructor() {
        if (myEmp.PPS.length() ==6 ) {
        }
        else {
            throw new IllegalArgumentException("Name length is invalid");
        }

    }


        @AfterEach
        void tearDown() {
        }

}