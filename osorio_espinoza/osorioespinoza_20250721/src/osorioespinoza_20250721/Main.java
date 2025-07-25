/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package osorioespinoza_20250721;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("50 Grados Cenigrados a Fahrenheit: " + celsius_a_fahrenheit() + " F");
        System.out.println("50 Grados Centigrados a Kelvin: " + celsius_a_kelvin() + " K");
        System.out.println("50 Grados Centigrados a rankine: " + celsius_a_rankine() + " R");
        System.out.println("30 Grados Fahrenheit a Celsius: " + fahrenheit_a_celsius() + " C");
        System.out.println("30 Grados Fahrenheit a Kelvin: " + fahrenheit_a_kelvin() + " K");
        System.out.println("30 Grados Fahrenheit a Rankine: " + fahrenheit_a_rankine() + " R");
        System.out.println("100 Grados Kelvin a Celsius: " + kelvin_a_celsius() + " C");
        System.out.println("100 Grados Kelvin a Fahrenheit: " + kelvin_a_fahrenheit() + " F");
        System.out.println("100 Grados Kelvin a Rankine: " + kelvin_a_rankine() + " R");
      
    }
    
    public static double celsius_a_fahrenheit(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9) / 5) + 32;
    }
            
    public static double celsius_a_kelvin(){
        double grados_centigrados = 50.0;
        return grados_centigrados + 273.15; 
    }
    
    public static double celsius_a_rankine(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9) / 5) + 491.67;
    }
    
    public static double fahrenheit_a_celsius(){
        double grados_fahrenheit = 30.0;
        return ((grados_fahrenheit - 32) * 5) / 9;
    }
    
    public static double fahrenheit_a_kelvin(){
        double  grados_fahrenheit = 30.0;
        return (((grados_fahrenheit - 32) * 5)/9) + 273.15;
    }   
    
    public static double fahrenheit_a_rankine() {
        double grados_fahrenheit = 30.0;
        return grados_fahrenheit + 459.67;
    }

    public static double kelvin_a_celsius() {
        double grados_kelvin = 100.0;
        return grados_kelvin - 273.15;
    }

    public static double kelvin_a_fahrenheit() {
        double grados_kelvin = 100.0;
        return (grados_kelvin - 273.15) * 9 / 5 + 32;
    }

    public static double kelvin_a_rankine() {
        double grados_kelvin = 100.0;
        return grados_kelvin * 9 / 5;
    }
    
}   
