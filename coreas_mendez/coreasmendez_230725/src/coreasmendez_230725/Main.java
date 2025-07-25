/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coreasmendez_230725;

public class Main {

    public static void main(String[] args) {
        double tempCelsius = 50.0;
        double tempFahrenheit = 30.0;
        double tempKelvin = 300.0;
        double tempRankine = 540.0;
        
        System.out.println("CELSIUS");
        System.out.println("50 °C a Fahrenheit: " + celsiusAFahrenheit(tempCelsius) + " °F");
        System.out.println("50 °C a Kelvin: " + celsiusAKelvin(tempCelsius) + " K");
        System.out.println("50 °C a Rankine: " + celsiusARankine(tempCelsius) + " °R");
        
        System.out.println("CONVERSIÓN DESDE FAHRENHEIT");
        System.out.println("30 °F a Celsius: " + fahrenheitACelsius(tempFahrenheit) + " °C");
        System.out.println("30 °F a Kelvin: " + fahrenheitAKelvin(tempFahrenheit) + " K");
        System.out.println("30 °F a Rankine: " + fahrenheitARankine(tempFahrenheit) + " °R");
        
        System.out.println("CONVERSIÓN DESDE KELVIN");
        System.out.println("300 K a Celsius: " + kelvinACelsius(tempKelvin) + " °C");
        System.out.println("300 K a Fahrenheit: " + kelvinAFahrenheit(tempKelvin) + " °F");
        System.out.println("300 K a Rankine: " + kelvinARankine(tempKelvin) + " °R");
       
        System.out.println("CONVERSIÓN DESDE RANKINE");
        System.out.println("540 °R a Celsius: " + rankineACelsius(tempRankine) + " °C");
        System.out.println("540 °R a Fahrenheit: " + rankineAFahrenheit(tempRankine) + " °F");
        System.out.println("540 °R a Kelvin: " + rankineAKelvin(tempRankine) + " K");
    }

    public static double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double celsiusAKelvin(double c) {
        return c + 273.15;
    }

    public static double celsiusARankine(double c) {
        return (c * 9 / 5) + 491.67;
    }

    public static double fahrenheitACelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double fahrenheitAKelvin(double f) {
        return ((f - 32) * 5 / 9) + 273.15;
    }

    public static double fahrenheitARankine(double f) {
        return f + 459.67;
    }

    public static double kelvinACelsius(double k) {
        return k - 273.15;
    }

    public static double kelvinAFahrenheit(double k) {
        return ((k - 273.15) * 9 / 5) + 32;
    }

    public static double kelvinARankine(double k) {
        return k * 1.8;
    }

    public static double rankineACelsius(double r) {
        return (r - 491.67) * 5 / 9;
    }

    public static double rankineAFahrenheit(double r) {
        return r - 459.67;
    }

    public static double rankineAKelvin(double r) {
        return r * 5 / 9;
    }
}

