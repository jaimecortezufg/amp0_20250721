/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigo_floresrivera_21_07_2025;
/*  
Nancy Beatriz Flores Rivera - FR100524
 
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("50 grados celcius a fahrenheit: "+celcius_a_fahrenheit()+ " F");
        System.out.println("50 grados celcius a kelvin: "+celcius_a_kelvin()+ " K");
        System.out.println("50 grados celcius a rankine: "+celcius_a_rankine()+ " R");
        System.out.println("50 grados fahrenheit a celcius: "+fahrenheit_a_celcius()+ " C");
        System.out.println("50 grados fahrenheit a kelvin: "+fahrenheit_a_kelvin()+ " K");
        System.out.println("50 grados fahrenheit a rankine: "+fahrenheit_a_rankine()+ " R");
        System.out.println("50 grados kelvin a celcius: "+kelvin_a_celcius()+ " C");
        System.out.println("50 grados kelvin a farenheit: "+kelvin_a_farenheit()+ " F");
        System.out.println("50 grados kelvin a rankine: "+kelvin_a_rankine()+ " R");
        System.out.println("50 grados rankine a celcius: "+rankine_a_celcius()+ " C");
        System.out.println("50 grados rankine a farenheit: "+rankine_a_farenheit()+ " F");
        System.out.println("50 grados rankine a kelvin: "+rankine_a_kelvin()+ " K");
    }
    
    public static double celcius_a_fahrenheit(){
        double grados_celcius = 50.0;
        return ((grados_celcius * 9) / 5) + 32;
    }
    
    public static double celcius_a_kelvin(){
        double grados_celcius = 50.0;
        return grados_celcius + 273.15;
    }
    
    public static double celcius_a_rankine(){
        double grados_celcius = 50.0;
        return ((grados_celcius * 9) / 5) + 491.67;
    }
    
    public static double fahrenheit_a_celcius(){
        double grados_fahrenheit = 50.0;
        return ((grados_fahrenheit - 32) * 5) / 9;
    }
    
    public static double fahrenheit_a_kelvin(){
        double grados_fahrenheit = 50.0;
        return (((grados_fahrenheit - 32) * 5) / 9) + 273.15;
    }
    
    public static double fahrenheit_a_rankine(){
        double grados_fahrenheit = 50.0;
        return grados_fahrenheit + 459.57;
    }
    
    public static double kelvin_a_celcius(){
        double grados_kelvin = 50.0;
        return grados_kelvin - 273.15;
    }
    
    public static double kelvin_a_farenheit(){
        double grados_kelvin = 50.0;
        return (((grados_kelvin - 273.15) * 9) / 5) + 32;
    }
    
    public static double kelvin_a_rankine(){
        double grados_kelvin = 50.0;
        return (grados_kelvin * 9) / 5;
    }
    
    public static double rankine_a_celcius(){
        double grados_rankine = 50.0;
        return ((grados_rankine - 491.67) * 5) / 9;
    }
    
    public static double rankine_a_farenheit(){
        double grados_rankine = 50.0;
        return grados_rankine - 459.67;
    }
    
    public static double rankine_a_kelvin(){
        double grados_rankine = 50.0;
        return (grados_rankine* 5) / 9;
    }
}