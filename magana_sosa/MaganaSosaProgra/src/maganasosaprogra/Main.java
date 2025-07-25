/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maganasosaprogra;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("50 Grados centigrados a farenheit: " + celcius_a_farenheit() + " F");
        System.out.println("50 Grados Centigrados a Kelvin: " + celsius_a_kelvin() + " K");
        System.out.println("50 Grados Centigrados a Rankine: " + celsius_a_rankine() + " R");
        System.out.println("30 Grados farenheit a Celcius: " + farenheit_a_celsius() + " C");
        System.out.println("30 Grados farenheit a Kelvin: " + farenheit_a_Kelvin() + " K");
        // TODO code application logic here
    }
    
    public static double celcius_a_farenheit(){
     double grados_centigrados = 50.0;
     return ((grados_centigrados * 9) / 5) + 32;
        
     
    }
    
    public static double celsius_a_kelvin() {
        double grados_centigrados = 50.0;
        return grados_centigrados + 273.15;
    }
    
    public static double celsius_a_rankine() { 
        double grados_centigrados = 50.0;
        return ((grados_centigrados  * 9)/5) + 491.67;
    }
    
    public static double farenheit_a_celsius() {
        double grados_farenheit = 30.0;
        return ((grados_farenheit  - 32) * 5) /9;
    }
    
    public static double farenheit_a_Kelvin() {
        double grados_farenheit = 30.0;
        return (((grados_farenheit  - 32) * 5) /9) + 273.15;
    }
}
