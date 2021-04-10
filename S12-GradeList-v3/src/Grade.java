public class Grade {

    private int grade;
    public static final int[] LEGAL_GRADES = { -3, 0, 2, 4, 7, 10, 12 };
    public static final String[] LEGAL_ECTS_GRADES = { "A", "B", "C", "D", "E", "F", "Fx" };

    public Grade(int grade) {
        this.grade = isLegalGrade(grade) ? grade : -3;
    }

    public Grade(String ectsGrade) {
        if (!isLegalECTSGrade(ectsGrade)) {
            this.grade = -3;
            return;
        }
        switch (ectsGrade) {
            case "A": this.grade = 12; break;
            case "B": this.grade = 10; break;
            case "C": this.grade = 7; break;
            case "D": this.grade = 4; break;
            case "E": this.grade = 2; break;
            case "Fx": this.grade = 0; break;
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

    public static boolean isLegalGrade(int grade) {
        int start = 0;
        int end = 6;
        int mid;
        while (start <= end) {
            if (LEGAL_GRADES[(mid = start + (end - start) / 2)] == grade) return true;
            if (grade < LEGAL_GRADES[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static boolean isLegalECTSGrade(String ectsGrade) {
        int start = 0;
        int end = 6;
        int mid;
        while (start <= end) {
            if (LEGAL_ECTS_GRADES[(mid = start + (end - start) / 2)].compareTo(ectsGrade) == 0) return true;
            if (LEGAL_ECTS_GRADES[mid].compareTo(ectsGrade) > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Grade)) return false;
        Grade other = (Grade) obj;
        return grade == other.grade;
    }
}
