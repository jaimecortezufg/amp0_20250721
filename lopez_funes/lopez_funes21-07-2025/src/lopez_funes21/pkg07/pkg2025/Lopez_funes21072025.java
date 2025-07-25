/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lopez_funes21.pkg07.pkg2025;

/**
 *
 * @author UFG
 */
public class Lopez_funes21072025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("grados centigrados a fahrenheit: "+celsius_a_fahrenhelt()+" F");
        System.out.println("50 grasdos centigrados a kelvin:"+celsius_a_kelvin() + " K");
        System.out.println("50 grados centirados a rankine: " + celsius_a_rankine() + " R");
        System.out.println("30 Grados fahrenheit a celsius: " + fahrenheit_a_celsius() + " C");
        System.out.println("30 grados fahrenheit a kelvin: " + fahrenheit_a_kelvin() + " k");
        System.out.println("30 grados fahrenheit a rankine: " + fahrenheit_a_rankine() +" Ra");
        System.out.println("40 kelvin a celsius: " + kelvin_a_celsius() +" C");
        System.out.println("40 kelvin a fahrenheit: " + kelvin_a_fahrenheit() +" F");
        System.out.println("40 kelvin a rankine: " + kelvin_a_rankine() +" Ra");
        System.out.println("20 grados rankine a celsius: " + rankine_a_celsius() +" C");
        System.out.println("20 grados rankine a fahrenheit: " + rankine_a_fahrenheit() +" F");
        System.out.println("50 grados rankine a kelvin: " + rankine_a_kelvin() +" K");
    }
    
    public static double celsius_a_fahrenhelt(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9) / 5) + 32;
    }
    
    public static double celsius_a_kelvin(){
        double grados_centigrados = 50.0;
        return grados_centigrados + 273.15;
    }
    
    public static double celsius_a_rankine(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)/5) + 491.67;
    }
    
    public static double fahrenheit_a_celsius(){
        double grados_fahrenheit = 30.0;
        return ((grados_fahrenheit - 32) * 5) / 9;
    }
    
    public static double fahrenheit_a_kelvin(){
        double grados_fahrenheit = 30.0;
        return (((grados_fahrenheit -32) * 5)/9) + 273.15;
    }

    public static double fahrenheit_a_rankine(){
        double grados_centigrados = 30.0;
        return grados_centigrados + 459.67;
    }

    public static double kelvin_a_celsius(){
        double grados_centigrados = 40.0;
        return grados_centigrados - 273.15;
    }
    
    public static double kelvin_a_fahrenheit(){
        double grados_centigrados = 40.0;
        return (((grados_centigrados -273.15) * 9)/5) + 32;
    }
    
    public static double kelvin_a_rankine(){
        double kelvin = 40.0;
        return (kelvin * 9)/5;
    }
    
    public static double rankine_a_celsius(){
        double grados_rankine = 20.0;
        return ((grados_rankine -491.67) * 5)/9;
    }
    
    public static double rankine_a_fahrenheit(){
        double grados_rankine = 20.0;
        return grados_rankine -459.67;
    }
    
    public static double rankine_a_kelvin(){
        double grados_rankine = 50.0;
        return (grados_rankine * 5)/9; 
    }
}
