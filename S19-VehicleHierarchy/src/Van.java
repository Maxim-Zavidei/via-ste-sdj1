public class Van extends Car {

    public int maxLoad;

    public Van(String theOwner, double thePrice, String regNo, int maxLoad) {
        super(theOwner, thePrice, regNo);
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    @Override
    public String toString() {
        return super.toString() + "->Van:{maxLoad=" + maxLoad + "}";
    }

    @Override
    public boolean equals(Object arg) {
        if (!(arg instanceof Van)) return false;
        Van other = (Van) arg;
        return super.equals(arg) && maxLoad == other.maxLoad;
    }
}
