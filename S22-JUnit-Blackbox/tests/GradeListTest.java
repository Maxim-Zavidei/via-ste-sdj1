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

    // Set method tests.

    @Test
    void sizeZero() {
        assertEquals(0, list.size());
    }

    @Test
    void sizeOne() {
        list.addGrade(new Grade(2));
        assertEquals(1, list.size());
    }

    @Test
    void sizeMany() {
        list.addGrade(new Grade(2));
        list.addGrade(new Grade(4));
        assertEquals(2, list.size());
    }

    @Test
    void sizeBoundary() {
        // Can't be tested.
    }

    @Test
    void sizeException() {
        // Can't be tested.
    }

    // Add grade (value) method tests.

    @Test
    void addGradeValueZero() {
        // Can't be tested.
    }

    @Test
    void addGradeValueOne() {
        // Tested in sizeOne.
    }

    @Test
    void addGradeValueMany() {
        // Tested in sizeMany.
    }

    @Test
    void addGradeValueBoundary() {
        // Can't be tested.
    }

    @Test
    void addGradeValueException() {
        assertThrows(IllegalArgumentException.class, () -> {
            list.addGrade(new Grade(3));
            list.addGrade(new Grade(-10));
        });
    }

    // Add grade (letter) method tests.

    @Test
    void addGradeLetterZero() {
        // Can't be tested.
    }

    @Test
    void addGradeLetterOne() {
        list.addGrade(new Grade('A'));
    }

    @Test
    void addGradeLetterMany() {
        list.addGrade(new Grade('A'));
        list.addGrade(new Grade('B'));
    }

    @Test
    void addGradeLetterBoundary() {
        // Can't be tested.
    }

    @Test
    void addGradeLetterException() {
        list.addGrade(new Grade('J'));
    }

    // Remove grade method tests.

    @Test
    void removeGradeZero() {
        list.removeGrade(0);
    }

    @Test
    void removeGradeOne() {
        list.addGrade(new Grade(2));
        list.removeGrade(0);
    }

    @Test
    void removeGradeMany() {
        list.addGrade(new Grade(2));
        list.addGrade(new Grade(2));
        list.removeGrade(0);
        list.removeGrade(1);
    }

    @Test
    void removeGradeBoundary() {
        // Can't be tested.
    }

    @Test
    void removeGradeException() {
        // Can't be tested.
    }

    // Get grade method tests.

    @Test
    void getGradeZero() {
        list.getGrade(0);
    }

    @Test
    void getGradeOne() {
        list.addGrade(new Grade(2));
        list.getGrade(0);
    }

    @Test
    void getGradeMany() {
        list.addGrade(new Grade(2));
        list.addGrade(new Grade(2));
        list.getGrade(0);
        list.getGrade(1);
    }

    @Test
    void getGradeBoundary() {
        // Can't be tested.
    }

    @Test
    void getGradeException() {
        // Can't be tested.
    }

    // Get max grade method tests.

    @Test
    void getMaxGradeZero() {
        list.getGrade(0);
    }

    @Test
    void getMaxGradeOne() {
        list.addGrade(new Grade(2));
        assertEquals(list.getMaxGrade().getGrade(), 2);
    }

    @Test
    void getMaxGradeMany() {
        list.addGrade(new Grade(2));
        list.addGrade(new Grade(10));
        assertEquals(list.getMaxGrade().getGrade(), 10);
    }

    @Test
    void getMaxGradeBoundary() {
        // Can't be tested.
    }

    @Test
    void getMaxGradeException() {
        // Can't be tested.
    }

    // Get min grade method tests.

    @Test
    void getMinGradeZero() {
        list.getGrade(0);
    }

    @Test
    void getMinGradeOne() {
        list.addGrade(new Grade(7));
        assertEquals(list.getMinGrade().getGrade(), 7);
    }

    @Test
    void getMinGradeMany() {
        list.addGrade(new Grade(2));
        list.addGrade(new Grade(10));
        assertEquals(list.getMinGrade().getGrade(), 2);
    }

    @Test
    void getMinGradeBoundary() {
        // Can't be tested.
    }

    @Test
    void getMinGradeException() {
        // Can't be tested.
    }

    // Get average grade method tests.

    @Test
    void getAverageZero() {
        assertEquals(list.getAverage(), 0);
    }

    @Test
    void getAverageOne() {
        list.addGrade(new Grade(12));
        assertEquals(list.getAverage(), 12);
    }

    @Test
    void getAverageMany() {
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(10));
        assertEquals(list.getAverage(), 11);
    }

    @Test
    void getAverageBoundary() {
        // Can't be tested.
    }

    @Test
    void getAverageException() {
        // Can't be tested.
    }

    // Get grade count method tests.

    @Test
    void getGradeCountZero() {
        assertEquals(list.getGradeCount(new Grade(12)), 0);
    }

    @Test
    void getGradeCountOne() {
        list.addGrade(new Grade(12));
        assertEquals(list.getGradeCount(new Grade(12)), 1);
    }

    @Test
    void getGradeCountMany() {
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(12));
        assertEquals(list.getGradeCount(new Grade(12)), 2);
    }

    @Test
    void getGradeCountBoundary() {
        // Can't be tested.
    }

    @Test
    void getGradeCountException() {
        // Can't be tested.
    }

    // Get grade distribution method tests.

    @Test
    void getGradeDistributionZero() {
        assertEquals(list.getGradeDistribution(), "");
    }

    @Test
    void getGradeDistributionOne() {
        list.addGrade(new Grade(12));
        assertEquals(list.getGradeDistribution(), "12 - 1");
    }

    @Test
    void getGradeDistributionMany() {
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(12));
        assertEquals(list.getGradeDistribution(), "12 - 1");
    }

    @Test
    void getGradeDistributionBoundary() {
        // Can't be tested.
    }

    @Test
    void getGradeDistributionException() {
        // Can't be tested.
    }

    // GradeList toString method tests.

    @Test
    void testToStringZero() {
        assertEquals(list.toString(), "");
    }

    @Test
    void testToStringOne() {
        list.addGrade(new Grade(12));
        assertEquals(list.toString(), "12");
    }

    @Test
    void testToStringMany() {
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(12));
        assertEquals(list.toString(), "12");
    }

    @Test
    void testToStringBoundary() {
        // Can't be tested.
    }

    @Test
    void testToStringException() {
        // Can't be tested.
    }

    // GradeList equals method tests.

    @Test
    void testEqualsZero() {
        assertEquals(list.equals(new GradeList()), true);
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
        list.addGrade(new Grade(10));
        dummyList.addGrade(new Grade(12));
        dummyList.addGrade(new Grade(10));
        assertEquals(true, list.equals(dummyList));
    }

    @Test
    void testEqualsBoundary() {
        // Can't be tested.
    }

    @Test
    void testEqualsException() {
        Grade dummyList = new Grade(12);
        list.addGrade(new Grade(12));
        assertEquals(false, list.equals(dummyList));
    }
}
