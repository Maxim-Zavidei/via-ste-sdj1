public class Main {
    public static void main(String[] args) {

        StudentList testList = new StudentList();

        testList.addStudent(new Student("lol1", 1, "RO", 1, new MyDate(1, 1, 2001)));
        testList.addStudent(new Student("lol2", 2, "DK", 1, new MyDate(2, 1, 2001)));
        testList.addStudent(new Student("lol3", 3, "CA", 2, new MyDate(3, 1, 2001)));
        testList.addStudent(new Student("lol4", 4, "US", 2, new MyDate(4, 1, 2001)));
        testList.addStudent(new Student("lol5", 5, "RO", 5, new MyDate(5, 1, 2001)));

        System.out.println(testList.toString());
        System.out.println();
        System.out.println(testList.getAllNationalities());
        System.out.println(testList.getAllGroupNumbers());
        System.out.println(testList.getByStudyNumber(3));
        testList.removeStudent(4);
        System.out.println(testList.toString());
    }
}
