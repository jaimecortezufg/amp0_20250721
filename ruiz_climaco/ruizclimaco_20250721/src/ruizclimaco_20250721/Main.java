/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruizclimaco_20250721;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("50 Grados centigrados a Fahrenhait: " + celsius_a_fahrenhait() + " F");
        System.out.println("50 Grados centigrados a Kelvin: " + celsius_a_kelvin() + " K");
        System.out.println("50 Grados centigrados a Rankine: " + celsius_a_rankine() + " R");
        System.out.println(" 30 Grados Fahrenhait a Celsius: " + fahrenhait_a_celsius() + " C");
        System.out.println(" 30 Grados Fahrenhait a Kelvin: " + fahrenhait_a_kelvin() + " K");
        System.out.println("30 Grados Fahrenhait a Rankine: " + fahrenhait_a_rankine() + " R");
        System.out.println("293.15 Grados Kelvin a Celsius: " + kelvin_a_celsius() + " C");
        System.out.println("293.15 Grados Kelvin a Fahrenhait: " + kelvin_a_fahrenhait() + " F");
        System.out.println("293.15 Grados Kelvin a Rankine: " + kelvin_a_rankine() + " R");
        System.out.println("489.67 Grados Rankine a Celsius: " + rankine_a_celsius() + " C");
        System.out.println("489.67 Grados Rankine a Fahrenhait: " + rankine_a_fahrenhait() + " F");
        System.out.println("489.67 Grados Rankine a Kelvin: " + rankine_a_kelvin() + " K");
    }
    
     public static double celsius_a_fahrenhait(){
         double grados_centigrados = 50.0;
         return ((grados_centigrados * 9)/5) + 32;
    }
    
    public static double celsius_a_kelvin(){
         double grados_centigrados = 50.0;
         return grados_centigrados + 273.15;
    }
    
    public static double celsius_a_rankine(){
       double grados_centigrados = 50.0;
       return ((grados_centigrados * 9)/5) + 491.67;
    }
    
    public static double fahrenhait_a_celsius(){
        double grados_fahrenhait = 30.0;
        return ((grados_fahrenhait - 32) * 5) / 9;
    }
    
    public static double fahrenhait_a_kelvin(){
        double grados_fahrenhait = 30.0;
        return (((grados_fahrenhait - 32) * 5)/9) + 273.15;
    }
    
    public static double fahrenhait_a_rankine(){
        double grados_fahrenhait = 30.0;
        return grados_fahrenhait + 459.67;
    }
    
    public static double kelvin_a_celsius(){
         double grados_kelvin = 293.15;
         return grados_kelvin - 273;
    }
    
    public static double kelvin_a_fahrenhait(){
         double grados_kelvin = 293.15;
         return ((grados_kelvin * 9) / 5) - 459.67;
    }
    
    public static double kelvin_a_rankine(){
           double grados_kelvin = 293.15;
           return ((grados_kelvin - 273.15) * 1.8) + 491.67;
    }
    
    public static double rankine_a_celsius(){
          double grados_rankine = 489.67;
          return (((grados_rankine - 491.67) * 5 ) / 9);
    }
    
    public static double rankine_a_fahrenhait(){
          double grados_rankine = 489.67;
          return grados_rankine - 459.67;
    }
    
    public static double rankine_a_kelvin(){
          double grados_rankine = 489.67;
          return ((grados_rankine * 5) / 9);
    }
}
