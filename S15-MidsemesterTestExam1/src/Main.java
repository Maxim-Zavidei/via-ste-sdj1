public class Main {
    public static void main(String[] args) {

        Kindergarten kindergartenObj = new Kindergarten();

        kindergartenObj.addChild(new Child("lol1", 5));
        kindergartenObj.addChild(new Child("lol2", 6));
        kindergartenObj.addChild(new Child("lol3", 7));
        kindergartenObj.addChild(new Child("lol4", 8));

        kindergartenObj.removeChild(new Child("lol2", 6));

        kindergartenObj.hireTeachers(5);

        kindergartenObj.fireTeachers();

        System.out.println("countChildren= " + kindergartenObj.countChildren());
        System.out.println("getAverageChildAge= " + kindergartenObj.getAverageChildAge());
        System.out.println("getNorm= " + kindergartenObj.getNorm());

        kindergartenObj.celebrateBirthday("lol3");
        System.out.println("toString= " + kindergartenObj);
    }
}
