public class StudentTest {
    public static void main(String[] args) {

        Student firstStudentObj = new Student("Bob", "us", 1212);
        Student secondStudentObj = new Student("Bob", 1212);
        Student thirdStudentObj = new Student("Wendy", "US", 2121);

        System.out.println("getName= " + firstStudentObj.getName());
        System.out.println("getNationality= " + firstStudentObj.getNationality());
        System.out.println("getStudyNumber= " + firstStudentObj.getStudyNumber());

        System.out.println();
        System.out.println(firstStudentObj);
        System.out.println(secondStudentObj);
        System.out.println(thirdStudentObj);

        System.out.println();
        if (firstStudentObj.hasAKnownNationality()) {
            System.out.println("Student 1 has a known nationality.");
        } else {
            System.out.println("Student 1 has not a know nationality.");
        }

        if (secondStudentObj.hasAKnownNationality()) {
            System.out.println("Student 2 has a known nationality.");
        } else {
            System.out.println("Student 2 has not a know nationality.");
        }

        if (firstStudentObj.hasSameNationalityAs(secondStudentObj)) {
            System.out.println("Student 1 and 2 has the same nationality.");
        } else {
            System.out.println("Student 1 and 2 has not the same nationality.");
        }

        if (firstStudentObj.hasSameNationalityAs(thirdStudentObj)) {
            System.out.println("Student 1 and 3 has the same nationality.");
        } else {
            System.out.println("Student 1 and 3 has not the same nationality.");
        }
    }
}
