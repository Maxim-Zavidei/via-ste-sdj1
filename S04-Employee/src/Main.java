public class Main {
    public static void main(String[] args) {

        Employee firstEmployeeObj = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee secondEmployeeObj = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee thirdEmployeeObj = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println();
        System.out.println("Data of the first employee object:");
        System.out.println("getName= " + firstEmployeeObj.getName());
        System.out.println("getIdNumber= " + firstEmployeeObj.getIdNumber());
        System.out.println("getDepartment= " + firstEmployeeObj.getDepartment());
        System.out.println("getPosition= " + firstEmployeeObj.getPosition());

        System.out.println();
        System.out.println("Data of the second employee object:");
        System.out.println("getName= " + secondEmployeeObj.getName());
        System.out.println("getIdNumber= " + secondEmployeeObj.getIdNumber());
        System.out.println("getDepartment= " + secondEmployeeObj.getDepartment());
        System.out.println("getPosition= " + secondEmployeeObj.getPosition());

        System.out.println();
        System.out.println("Data of the third employee object:");
        System.out.println("getName= " + thirdEmployeeObj.getName());
        System.out.println("getIdNumber= " + thirdEmployeeObj.getIdNumber());
        System.out.println("getDepartment= " + thirdEmployeeObj.getDepartment());
        System.out.println("getPosition= " + thirdEmployeeObj.getPosition());
    }
}
