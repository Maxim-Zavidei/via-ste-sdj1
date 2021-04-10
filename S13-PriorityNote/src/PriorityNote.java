public class PriorityNote {

    private String note;
    private boolean highPriority;

    public PriorityNote(String note) {
        this.note = note;
        this.highPriority = false;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isHighPriority() {
        return highPriority;
    }

    public void setHighPriority() {
        highPriority = true;
    }

    public void setLowPriority() {
        highPriority = false;
    }

    public PriorityNote copy() {
        return new PriorityNote(note);
    }

    @Override
    public String toString() {
        return "note= " + note + ", high priority=" + highPriority;
    }
}
