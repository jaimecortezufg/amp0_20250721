/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguezrivas_20250721;

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
        System.out.println("Grados Centigrados a Farenheit: " +celsius_a_farenheit()+" F");
        System.out.println("Grados Centigrados a Kelvin: " +celsius_a_kelvin()+" K");
        System.out.println("Grados Centigrados a Rankine: " +celsius_a_rankine()+" Ra");
        System.out.println("Grados Farenheit a Celsius: " +farenheit_a_celsius()+" C");
        System.out.println("Grados Farenheit a Kelvin: " +farenheit_a_kelvin()+" K");
        System.out.println("Grados Farenheit a Rankine: " +farenheit_a_rankine()+" Ra");
        System.out.println("Grados Kelvin a Celsius: " +kelvin_a_celsius()+" C");
        System.out.println("Grados Kelvin a Farenheit: " +kelvin_a_farenheit()+" F");
        System.out.println("Grados Kelvin a Rankine: " +kelvin_a_rankine()+" Ra");
        System.out.println("Grados Rankine a Celisus: " +rankine_a_celsius()+" C");
        System.out.println("Grados Rankine a Farenheit: " +rankine_a_farenheit()+" F");
        System.out.println("Grados Rankine a Kelvin: " +rankine_a_kelvin()+" K");
    }
    
    
    public static double celsius_a_farenheit(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados *9)/5) +32;
    }
    
    public static double celsius_a_kelvin(){
        double grados_centigrados = 50.0;
        return grados_centigrados + 273.15;
    }
    
    public static double celsius_a_rankine(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados *9)/5) + 491.67;
    }
    
    public static double farenheit_a_celsius(){
        double grados_farenheit = 30.0;
        return ((grados_farenheit -32) *5)/9;
    }
    
    public static double farenheit_a_kelvin(){
        double grados_farenheit = 30.0;
        return ((grados_farenheit -32)*5)/9 + 273.15;
    }
    
    public static double farenheit_a_rankine(){
        double grados_farenheit = 30.0;
        return grados_farenheit  + 459.67;
    }
    
    public static double kelvin_a_celsius(){
        double grados_kelvin = 00.0;
        return grados_kelvin - 273.15;
    }
    
    public static double kelvin_a_farenheit(){
        double grados_kelvin = 00.0;
        return (((grados_kelvin - 273.15)*9)/5) + 32;
    }
    
    public static double kelvin_a_rankine(){
        double grados_kelvin = 20.0;
        return (grados_kelvin*9)/5;
    }
    
    public static double rankine_a_celsius(){
        double grados_rankine = 1.0;
        return ((grados_rankine -491.67)*5)/9;
    }
    
    public static double rankine_a_farenheit(){
        double grados_rankine = 1.0;
        return grados_rankine - 459.67;
    }
    
    public static double rankine_a_kelvin(){
        double grados_rankine = 1.0;
        return (grados_rankine * 5)/ 9;
    }
}
