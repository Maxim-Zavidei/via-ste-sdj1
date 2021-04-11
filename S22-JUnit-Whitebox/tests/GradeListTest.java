import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeListTest {

    private GradeList list;

    @BeforeEach
    void setUp() {
        System.out.println("--> setUp()");
        list = new GradeList();
    }

    @AfterEach
    void tearDown() {
        System.out.println("<-- tearDown()");
    }

    @Test
    void getAverageZero() {
        assertEquals(0, list.getAverage());
    }

    @Test
    void getAverageOne() {
        list.addGrade(new Grade(10));
        assertEquals(10, list.getAverage());
    }

    @Test
    void getAverageMany() {
        list.addGrade(new Grade(10));
        list.addGrade(new Grade(2));
        assertEquals(6, list.getAverage());
    }

    @Test
    void getAverageBoundary() {
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(12));
        assertEquals(12, list.getAverage());
    }

    @Test
    void getAverageException() {
        // Can't be tested.
    }

    @Test
    void testEqualsZero() {
        GradeList dummyList = new GradeList();
        assertEquals(true, list.equals(dummyList));
    }

    @Test
    void testEqualsOne() {
        GradeList dummyList = new GradeList();
        list.addGrade(new Grade(12));
        dummyList.addGrade(new Grade(12));
        assertEquals(true, list.equals(dummyList));
    }

    @Test
    void testEqualsMany() {
        GradeList dummyList = new GradeList();
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(2));
        dummyList.addGrade(new Grade(12));
        dummyList.addGrade(new Grade(2));
        assertEquals(true, list.equals(dummyList));
    }

    @Test
    void testEqualsBoundary() {
        // Can't be tested.
    }

    @Test
    void testEqualsException() {
        assertEquals(false, list.equals(null));
    }
}
