/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuentesperla_20250721;

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
        celsius_a_fahrenheit();
        System.out.println("Grados Centigrados a Fehrenheit: "+celsius_a_fahrenheit()+ "F");
        System.out.println("Grados Centigrados a Kelvin: "+celsius_a_kelvin()+ "K");
        System.out.println("Grados Centigrados a Rankine: "+celsius_a_rankine()+ "Ra");
        System.out.println("Grados Fahrenheit a Celsius: "+fahrenheit_a_celsius()+ "C");
        System.out.println("Grados Fahrenheit a Kelvin: "+fahrenheit_a_kelvin()+ "K");
        System.out.println("Grados Fahrenheit a Rankine: "+fahrenheit_a_rankine()+ "Ra");
        
    }
    
    public static double celsius_a_fahrenheit (){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)/5)+32;
    }
    
    public static double celsius_a_kelvin (){
        double grados_centigrados = 50.0;
        return grados_centigrados+ 273.15;
    }
    
    public static double celsius_a_rankine (){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)/5)+491.67;
    }
    
    public static double fahrenheit_a_celsius (){
        double grados_fahrenheit = 30.0;
        return ((grados_fahrenheit -32)*5)/9;
    }
    
    public static double fahrenheit_a_kelvin (){
        double grados_fahrenheit = 30.0;
        return (((grados_fahrenheit -32)*5)/9)+273.15;
    }
    
    public static double fahrenheit_a_rankine (){
        double grados_fahrenheit = 30.0;
        return grados_fahrenheit + 459.67;
    }
   
}
