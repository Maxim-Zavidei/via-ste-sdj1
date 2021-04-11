import java.util.ArrayList;

public class config {

    ArrayList<MyFile> file;

    public config() {
        file = new ArrayList<>();
    }

    public MyFile getFile(int index) {
        return file.get(index);
    }

    public void addFile(MyFile myFileArg) {
        file.add(myFileArg);
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder("config:{");
        for (MyFile MyFile : this.file) {
            toReturn.append(MyFile).append(", ");
        }
        return toReturn.append("}").toString();
    }
}
