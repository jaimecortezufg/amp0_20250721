/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eduardoramirez_20250722;

/**
 *
 * @author DELL
 */

public class Main {

    // Celsius
    public static double cToF(double c) { return (c * 9.0 / 5.0) + 32; }
    public static double cToK(double c) { return c + 273.15; }
    public static double cToRa(double c) { return (c + 273.15) * 9.0 / 5.0; }

    // Fahrenheit
    public static double fToC(double f) { return (f - 32) * 5.0 / 9.0; }
    public static double fToK(double f) { return (f + 459.67) * 5.0 / 9.0; }
    public static double fToRa(double f) { return f + 459.67; }

    // Kelvin
    public static double kToC(double k) { return k - 273.15; }
    public static double kToF(double k) { return (k * 9.0 / 5.0) - 459.67; }
    public static double kToRa(double k) { return k * 9.0 / 5.0; }

    // Rankine
    public static double raToC(double ra) { return (ra - 491.67) * 5.0 / 9.0; }
    public static double raToF(double ra) { return ra - 459.67; }
    public static double raToK(double ra) { return ra * 5.0 / 9.0; }

    public static void main(String[] args) {
        // Valores fijos para pruebas
        double c = 25;
        double f = 77;
        double k = 298.15;
        double ra = 536.67;

        // Imprimir resultados
        System.out.println("Conversiones desde °C:");
        System.out.println("°C a °F: " + cToF(c));
        System.out.println("°C a K: " + cToK(c));
        System.out.println("°C a Ra: " + cToRa(c));

        System.out.println("\nConversiones desde °F:");
        System.out.println("°F a °C: " + fToC(f));
        System.out.println("°F a K: " + fToK(f));
        System.out.println("°F a Ra: " + fToRa(f));

        System.out.println("\nConversiones desde K:");
        System.out.println("K a °C: " + kToC(k));
        System.out.println("K a °F: " + kToF(k));
        System.out.println("K a Ra: " + kToRa(k));

        System.out.println("\nConversiones desde Ra:");
        System.out.println("Ra a °C: " + raToC(ra));
        System.out.println("Ra a °F: " + raToF(ra));
        System.out.println("Ra a K: " + raToK(ra));
    }
}

