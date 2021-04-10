public class Notebook {

    private int size;
    private PriorityNote[] notes;

    public Notebook(int capacity) {
        notes = new PriorityNote[capacity];
        size = 0;
    }

    public void addNote(PriorityNote note) {
        notes[size] = note.copy();
        size++;
    }

    public void addNote(String note) {
        notes[size] = new PriorityNote(note);
        size++;
    }

    public void addHighPriorityNote(String note) {
        notes[size] = new PriorityNote(note);
        notes[size].setHighPriority();
        size++;
    }

    public String getNote(int index) {
        if (index < 0) return "";
        return notes[index].toString();
    }

    public boolean isHighPriorityNote(int index) {
        return notes[index].isHighPriority();
    }

    public int indexOfMostImportantNote() {
        for (int i = 0; i < size; i++) if (isHighPriorityNote(i)) return i;
        return -1;
    }

    public String getMostImportantNote() {
        return getNote(indexOfMostImportantNote());
    }

    public void removeNote(int index) {
        for (int i = index; i < size - 1; i++) notes[i] = notes[i + 1];
        size--;
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder("{");
        for (int i = 0; i < size - 1; i++) toReturn.append(notes[i]).append(", ");
        return toReturn.append(notes[size - 1]).append("}").toString();
    }
}
