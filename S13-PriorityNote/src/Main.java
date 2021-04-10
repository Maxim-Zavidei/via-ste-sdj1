public class Main {
    public static void main(String[] args) {

        Notebook notebookObj = new Notebook(5);

        notebookObj.addNote("a");
        notebookObj.addHighPriorityNote("3");
        notebookObj.addNote("p");
        notebookObj.addNote("v");

        System.out.println(notebookObj.getNote(2));
        System.out.println(notebookObj.isHighPriorityNote(1));
        System.out.println(notebookObj.indexOfMostImportantNote());
        notebookObj.removeNote(2);
        System.out.println(notebookObj.toString());
    }
}
