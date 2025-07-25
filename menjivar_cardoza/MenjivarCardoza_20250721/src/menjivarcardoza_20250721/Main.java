/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menjivarcardoza_20250721;

/**
 *
 * @author UFG
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("50 Grados centigrados a Farenheit: " + celcius_a_farenheit() + " F");
        System.out.println("50 Grados centigrados a Kelvin: " + celsius_a_kelvin() + " K");
        System.out.println("50 Grados centigrados a Rankine: " + celsius_a_rankine() + " R");
        System.out.println("30 Grados Farenheit a Centigrados: " + farenheit_a_celsius() + " C");
        System.out.println("30 Grados Farenheit a Kelvin: " + farenheit_a_Kelvin() + " K");
        System.out.println("30 Grados Farenheit a Rankine: " + farenheit_a_Rankine() + " R"); // continuación
        System.out.println("100 Grados Kelvin a Centigrados: " + kelvin_a_celsius() + " C"); // continuación
        System.out.println("100 Grados Kelvin a Farenheit: " + kelvin_a_farenheit() + " F"); // continuación
        System.out.println("100 Grados Kelvin a Rankine: " + kelvin_a_rankine() + " R"); // continuación
        System.out.println("400 Grados Rankine a Centigrados: " + rankine_a_celsius() + " C"); // continuación
        System.out.println("400 Grados Rankine a Farenheit: " + rankine_a_farenheit() + " F"); // continuación
        System.out.println("400 Grados Rankine a Kelvin: " + rankine_a_kelvin() + " K"); // continuación
    }

    public static double celcius_a_farenheit() {
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9) / 5) + 32;
    }

    public static double celsius_a_kelvin() {
        double grados_centigrados = 50.0;
        return grados_centigrados + 273.15;
    }

    public static double celsius_a_rankine() {
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9) / 5) + 491.67;
    }

    public static double farenheit_a_celsius() {
        double grados_farenheit = 30.0;
        return ((grados_farenheit - 32) * 5) / 9;
    }

    public static double farenheit_a_Kelvin() {
        double grados_farenheit = 30.0;
        return (((grados_farenheit - 32) * 5) / 9) + 273.15;
    }

    // continuación
    public static double farenheit_a_Rankine() {
        double grados_farenheit = 30.0;
        return grados_farenheit + 459.67;
    }

    // continuación
    public static double kelvin_a_celsius() {
        double grados_kelvin = 100.0;
        return grados_kelvin - 273.15;
    }

    // continuación
    public static double kelvin_a_farenheit() {
        double grados_kelvin = 100.0;
        return ((grados_kelvin - 273.15) * 9) / 5 + 32;
    }

    // continuación
    public static double kelvin_a_rankine() {
        double grados_kelvin = 100.0;
        return grados_kelvin * 1.8;
    }

    // continuación
    public static double rankine_a_celsius() {
        double grados_rankine = 400.0;
        return ((grados_rankine - 491.67) * 5) / 9;
    }

    // continuación
    public static double rankine_a_farenheit() {
        double grados_rankine = 400.0;
        return grados_rankine - 459.67;
    }

    // continuación
    public static double rankine_a_kelvin() {
        double grados_rankine = 400.0;
        return grados_rankine / 1.8;
    }
}