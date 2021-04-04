public class TestScores {

    private int firstScore;
    private int secondScore;
    private int thirdScore;

    public TestScores(int firstScore, int secondScore, int thirdScore) {
        set(firstScore, secondScore, thirdScore);
    }

    public TestScores() {
        this(-1, -1, -1);
    }

    public void set(int firstScore, int secondScore, int thirdScore) {
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        this.thirdScore = thirdScore;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    public void setSecondScore(int secondScore) {
        this.secondScore = secondScore;
    }

    public void setThirdScore(int thirdScore) {
        this.thirdScore = thirdScore;
    }

    public int getFirstScore() {
        return this.firstScore;
    }

    public int getSecondScore() {
        return this.secondScore;
    }

    public int getThirdScore() {
        return this.thirdScore;
    }

    public double getAverageScore() {
        return (double) (firstScore + secondScore + thirdScore) / 3;
    }

    public String toString() {
        return "First score=" + this.firstScore + ", Second score=" + this.secondScore + ", Third score=" + this.thirdScore + ", Average score=" + getAverageScore();
    }
}
