import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;
public class StudentTests {

    private Student emptyStudent;
    private Student actualStudent;
     public ArrayList<Integer> testArray ;



    @Before
    public void setup() {
        actualStudent = new Student("Luis", 942176);
        testArray = new ArrayList<>();
    }

    @Test
    public void testStudentConstructor() {

        assertNull(emptyStudent);
        assertNotNull(actualStudent);
    }

    @Test
    public void testStudentGetters() {
        assertEquals(actualStudent.getName(), "Luis");
        assertEquals(actualStudent.getId(), 942176);
        assertEquals(actualStudent.getGrades(), testArray);
    }

    @Test
    public void testStudentSetters() {
        actualStudent.setName("other Cool beans");
        assertEquals(actualStudent.getName(), "other Cool beans");

        actualStudent.setId(154777);
        assertEquals(actualStudent.getId(), 154777);

        actualStudent.addGrade(100);
//        assertEquals(actualStudent.getGrades());

    }

    @Test
    public void testStudentAddGrade() {
        actualStudent.addGrade(100);
        actualStudent.addGrade(99);
        actualStudent.addGrade(98);

        assertEquals(actualStudent.getGrades(), Arrays.asList(100, 99, 98 ));
    }
    @Test
    public void testGradeAverage() {

    }
}
