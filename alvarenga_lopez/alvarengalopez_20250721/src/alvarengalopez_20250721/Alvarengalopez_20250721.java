/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alvarengalopez_20250721;

/**
 *
 * @author laura
 */
public class Alvarengalopez_20250721 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.println("50 Centigrados a Fahrenheit:" + celsius_a_fahrenheit()+ "F");
       System.out.println("50 Centigrados a Kelvin:" + celsius_a_kelvin()+ "K");
       System.out.println("50 Centigrados a Rankine:" + celsius_a_rankine()+ "R");
       System.out.println("30 fahrenheit a Celsius:" + fahrenheit_a_Celsius()+ "C");
       System.out.println("30 fahrenheit a Kelvin:" + fahrenheit_a_Kelvin()+ "K");
       System.out.println("30 fahrenheit a Rankine:" + fahrenheit_a_Rankine()+ "R");
       System.out.println("60 Kelvin a Celsius:" + Kelvin_a_Celcius()+ "C");
       System.out.println("60 Kelvin a Fahrenheit:" + Kelvin_a_fahrenheit()+ "F");
       System.out.println("60 Kelvin a Rankine:" + Kelvin_a_Rankine()+ "R");
       System.out.println("30 Rankine a Celcius:" + Rankine_a_Celsius()+ "C");
       System.out.println("30 Rankine a Kelvin:" + Rankine_a_Kelvin()+ "K");
       System.out.println("30 Rankine a Farenheit:" + Rankine_a_Farenheit()+ "F");
    }
    
    public static double celsius_a_fahrenheit(){
        double grados_centigrados= 50.0;
        return((grados_centigrados * 9) / 5)+32;
    }
    
    public static double celsius_a_kelvin(){
        double grados_centigrados= 50.0;
        return grados_centigrados + 273.15;
    }
    
    public static double celsius_a_rankine(){
        double grados_centigrados= 50.0;
        return((grados_centigrados * 9) / 5) + 491.67;
    }
    
    public static double fahrenheit_a_Celsius(){
        double grados_fahrenheit= 30.0;
        return((grados_fahrenheit - 32) * 5) / 9;
    }
    
    public static double fahrenheit_a_Kelvin(){
        double grados_fahrenheit= 30.0;
        return(((grados_fahrenheit - 32) * 5) / 9) + 273.15;
    }
    
    public static double fahrenheit_a_Rankine(){
        double grados_fahrenheit= 30.0;
        return grados_fahrenheit + 459.67;
    }
    
    public static double Kelvin_a_Celcius(){
        double grados_Kelvin= 60.0;
        return grados_Kelvin - 273.15;
    }
    
    public static double Kelvin_a_fahrenheit(){
        double grados_Kelvin= 60.0;
        return (((grados_Kelvin - 273.15) * 9)/5 )+ 32;
    }
    
    
    public static double Kelvin_a_Rankine(){
        double grados_Kelvin= 60.0;
        return grados_Kelvin * 9 /5;
    }    
        
    public static double Rankine_a_Celsius(){
        double grados_Rankine= 30.0;
        return  (grados_Rankine - 491.67) * 5.0 / 9.0;
    }    
        
     public static double Rankine_a_Kelvin(){
        double grados_Rankine= 30.0;
        return  grados_Rankine * 5.0 / 9.0;
    }    
     public static double Rankine_a_Farenheit(){
        double grados_Rankine= 30.0;
        return  grados_Rankine - 459.67;
     
                
     
    }
    
    
    
    
  
}
