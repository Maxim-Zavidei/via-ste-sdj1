public class Grade {

    private int grade;

    public Grade(int grade) {
        this.grade = grade;
        if (getEctsGrade().equals("Illegal grade")) {
            this.grade = -3;
        }
    }

    public Grade(String ects) {
        switch (ects) {
        case "Fx": this.grade = 0; break;
        case "E": this.grade = 2; break;
        case "D": this.grade = 4; break;
        case "C": this.grade = 7; break;
        case "B": this.grade = 10; break;
        case "A": this.grade = 12; break;
        default: this.grade = -3;
        }
    }

    public int getGrade() {
        return this.grade;
    }

    public String getEctsGrade() {
        String ects = "Illegal grade";
        switch (grade) {
        case -3: return "F";
        case 0: return "Fx";
        case 2: return "E";
        case 4: return "D";
        case 7: return "C";
        case 10: return "B";
        case 12: return "A";
        }
        return ects;
    }

    @Override
    public String toString() {
        return grade + " (" + getEctsGrade() + ")";
    }
}
