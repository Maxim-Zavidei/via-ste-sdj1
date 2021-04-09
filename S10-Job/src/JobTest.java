public class JobTest {
    public static void main(String[] args) {

        Job firstJobObj = new Job("Engineer", 5000);
        Job secondJobObj = new Job("Engineer", 4000);

        System.out.println("getTitle= " + firstJobObj.getTitle());
        System.out.println("getSalary= " + firstJobObj.getSalary());
        System.out.println("getEmployee= " + firstJobObj.getEmployee());
        firstJobObj.setSalary(4000);
        System.out.println("isAvailable= " + firstJobObj.isAvailable());
        System.out.println("toString: " + firstJobObj);
        System.out.println("equals: " + firstJobObj.equals(secondJobObj));
        secondJobObj.fire();
        System.out.println(secondJobObj);
    }
}
