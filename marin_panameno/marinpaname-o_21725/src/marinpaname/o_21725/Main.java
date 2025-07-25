/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marinpaname.o_21725;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Grados Celsius a Farhenheit: " + celsius_a_farhenheit() + " F");
        System.out.println("Grados Celsius a Kelvin: " + celsius_a_kevin() + " K");
        System.out.println("Grados Celsius a Rankine: "+ celsius_a_rankine() + " Ra");
        System.out.println("Grados Farhenheit a Celsius: "+ farhenheit_a_celsius() + " C");
        System.out.println("Grados Farhenheit a Kelvin: "+ farhenheit_a_kelvin() + " K");
        System.out.println("Grados Farhenheit a Rankine: "+ farhenheit_a_rankine() + " Ra");
        System.out.println("Grados Kelvin a Celsius: "+ kelvin_a_celsius() + " C");
        System.out.println("Grados Kelvin a Farhenheit: "+ kelvin_a_farhenheit() + " F");
        System.out.println("Grados Kelvin a Rankine: "+ kelvin_a_rankine() + " Ra");
        System.out.println("Grados Rankine a Celsius: "+ rankine_a_celsius() + " C");
        System.out.println("Grados Rankine a Farhenheit: "+ rankine_a_farhenheit() + " F");
        System.out.println("Grados Rankine a Kelvin: "+ rankine_a_kelvin() + " K");
    }
    
    public static double celsius_a_farhenheit(){
        double grados_celsius = 50.0;
        return ((grados_celsius * 9)/5) + 32;
    }
    
    public static double celsius_a_kevin(){
        double grados_centigrados = 50.0;
        return grados_centigrados + 273.15;
    }
    
    public static double celsius_a_rankine(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)/5) + 491.67;
    }

    public static double farhenheit_a_celsius(){ 
        double grados_fahrenheit = 86.0;
        return (grados_fahrenheit - 32) * 5 / 9;
    }

    public static double farhenheit_a_kelvin(){ 
        double grados_fahrenheit = 86.0;
        return ((grados_fahrenheit - 32) * 5 / 9) + 273.15;
    }

    public static double farhenheit_a_rankine(){ 
        double grados_fahrenheit = 86.0;
        return grados_fahrenheit + 459.67;
    }

    public static double kelvin_a_celsius(){
        double grados_kelvin = 323.15;
        return grados_kelvin - 273.15;
    }

    public static double kelvin_a_farhenheit(){
        double grados_kelvin = 323.15;
        return ((grados_kelvin - 273.15) * 9 / 5) + 32;
    }

    public static double kelvin_a_rankine(){
        double grados_kelvin = 323.15;
        return grados_kelvin * 9 / 5;
    }

    public static double rankine_a_celsius(){
        double grados_rankine = 581.67;
        return (grados_rankine - 491.67) * 5 / 9;
    }

    public static double rankine_a_farhenheit(){
        double grados_rankine = 581.67;
        return grados_rankine - 459.67;
    }

    public static double rankine_a_kelvin(){
        double grados_rankine = 581.67;
        return grados_rankine * 5 / 9;
    }
}
