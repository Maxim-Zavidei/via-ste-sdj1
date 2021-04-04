public class Temperature {

    private double fahrenheit;

    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return this.fahrenheit;
    }

    public double getCelsius() {
        return (5 / 9F) * (this.fahrenheit - 32);
    }

    public double getKelvin() {
        return (5 / 9F) * (this.fahrenheit - 32) + 273;
    }
}
