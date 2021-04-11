public class MyFile {

    String filename;
    String purpose;
    String type;

    public MyFile(String fileName, String purpose, String type) {
        this.filename = fileName;
        this.purpose = purpose;
        this.type = type;
    }

    public String getFileName() {
        return filename;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "{" + filename + ", " + purpose + ", " + type + "}";
    }
}
