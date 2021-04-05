public class Grade {

    private int grade;

    public Grade(int grade) {
        switch (grade) {
        case 12:
        case 10:
        case 7:
        case 4:
        case 2:
        case 0:
            this.grade = grade;
            break;
        default: this.grade = -3;
        }
    }

    public Grade(String ectsGrade) {
        switch (ectsGrade) {
        case "A":
            this.grade = 12;
            break;
        case "B":
            this.grade = 10;
            break;
        case "C":
            this.grade = 7;
            break;
        case "D":
            this.grade = 4;
            break;
        case "E":
            this.grade = 2;
            break;
        case "Fx":
            this.grade = 0;
            break;
        default: this.grade = -3;
        }
    }

    public int getGrade() {
        return this.grade;
    }

    public String getEctsGrade() {
        switch (this.grade) {
        case 12: return "A";
        case 10: return "B";
        case 7: return "C";
        case 4: return "D";
        case 2: return "E";
        case 0: return "Fx";
        default: return "F";
        }
    }

    @Override
    public String toString() {
        return "Danish Grade= " + this.grade + ", Ects Grade= " + getEctsGrade();
    }
}
