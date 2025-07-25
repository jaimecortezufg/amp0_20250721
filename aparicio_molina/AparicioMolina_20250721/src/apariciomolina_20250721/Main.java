/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apariciomolina_20250721;

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
        System.out.println("50 Grados centigrados a fahreheit: " + celcius_a_fahrenheit() + "F");
        
        System.out.println("50 Grados centigrados a kelvin: " + celcius_a_kelvin() + "K");
        
        System.out.println("50 Grados centigrados a kelvin: " + celcius_a_rankine() + "R");
        
        System.out.println("50 Grados centigrados a kelvin: " + fahrenheit_a_celcius() + "C");
        
        System.out.println("50 Grados centigrados a kelvin: " + fahrenheit_a_kelvin() + "K");
        
        System.out.println("50 Grados centigrados a kelvin: " + fahrenheit_a_rankine() + "R");
        
        
        
        
        
        
    }
    
    public static double celcius_a_fahrenheit() {
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)/5) + 32;
    }
    
    public static double celcius_a_kelvin() {
        double grados_centigrados = 50.0;
        return grados_centigrados + 273.15;
    }
    
    public static double celcius_a_rankine() {
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)/5) + 491.67;
    }
    
    public static double fahrenheit_a_celcius() {
        double grados_fahrenheit = 30.0;
        return ((grados_fahrenheit - 32) * 5) / 9;
    }
    
    public static double fahrenheit_a_kelvin() {
        double grados_fahrenheit = 30.0;
        return (((grados_fahrenheit - 32) * 5) /9) + 273.15;
    }
    
    public static double fahrenheit_a_rankine() {
        double grados_fahrenheit = 30.0;
        return grados_fahrenheit + 459.67;
    }
    
    public static double kelvin_a_celcius() {
        double grados_kelvin = 30.0;
        return grados_kelvin - 273.15;
    }
    
    public static double kelvin_a_fahrenheit() {
        double grados_kelvin = 30.0;
        return (((grados_kelvin - 273.15)*9)/5) + 32;
    }
    
    public static double kelvin_a_rankine() {
        double grados_kelvin = 30.0;
        return grados_kelvin;
    }
}
