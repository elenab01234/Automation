package tema07;

//    3. Creează clasa Temperature:
public class Temperatura {
    double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    // Metoda: toFahrenheit() → returnează conversia
    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    // Metoda: toKelvin() → returnează conversia
    public double toKelvin() {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        // creează obiect și afișează valorile
        Temperatura temp = new Temperatura(28);

        System.out.println("Temperatura in Celsius: " + temp.celsius);
        System.out.println("Temperatura in Fahrenheit: " + temp.toFahrenheit());
        System.out.println("Temperatura in Kelvin: " + temp.toKelvin());
    }
}