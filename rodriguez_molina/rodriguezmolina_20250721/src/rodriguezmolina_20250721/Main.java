/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguezmolina_20250721;

/**
 *
 * @author Fernando
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("50 Grados Celcius a Fahrenheit: "+Celcius_to_Fahrenheit()+" F°");
        System.out.println("30 Grados Celcius a Kelvin: "+Celcius_to_Kelvin()+" K°");
        System.out.println("20 Grados Celcius a Rankine: "+Celcius_to_Rankine()+" R°");
        System.out.println("40 Grados Fahrenheit a Celcius: "+Fahrenheit_to_Celcius()+" C°");
        System.out.println("30 Grados Fahrenheit a Kelvin: "+Fahrenheit_to_Kelvin()+" K°");
        System.out.println("50 Grados Fahrenheit a Rankine: "+Fahrenheit_to_Rankine()+" R°");
        System.out.println("30 Grados Kelvin a Celcius: "+Kelvin_to_Celcius()+" C°");
        System.out.println("50 Grados Kelvin a Fahrenheit: "+Kelvin_to_Fahrenheit()+" F°");
        System.out.println("40 Grados Kelvin a Rankine: "+Kelvin_to_Rankine()+" R°");
        System.out.println("30 Grados Rankine a Celcius: "+Rankine_to_Celcius()+" C°");
        System.out.println("50 Grados Rankine a Farenheit: "+Rankine_to_Fahrenheit()+" F°");
        System.out.println("30 Grados Rankine a Kelvin: "+Rankine_to_Kelvin()+" K°");
    }
    
    public static double Celcius_to_Fahrenheit (){
    double celcius=50; 
    return (celcius*9/5)+32;
    }
    
    public static double Celcius_to_Kelvin(){
    double celcius=30;
    return (celcius+273.15) ;
    }
    
    public static double Celcius_to_Rankine(){
    double celcius=20;
    return ((celcius*9/5)+491.67) ;
    }
    
    public static double Fahrenheit_to_Celcius(){
    double Fahrenheit=40;
    return (Fahrenheit-32)*5/9;
    }
    
    public static double Fahrenheit_to_Kelvin(){
    double Fahrenheit=30;
    return (Fahrenheit-32)*5/9+273.15;
    }
    
    public static double Fahrenheit_to_Rankine(){
    double Fahrenheit=50;
    return (Fahrenheit+459.67);
    }
    
    public static double Kelvin_to_Celcius(){
    double Kelvin=30;
    return (Kelvin-273.15);
    }
    
    public static double Kelvin_to_Fahrenheit(){
    double Kelvin=50;
    return (Kelvin-273.15)*9/5+32;
    }
    
    public static double Kelvin_to_Rankine(){
    double Kelvin=40;
    return Kelvin*1.8;
    }
    
    public static double Rankine_to_Celcius(){
   double Rankine=30;
   
   return (Rankine-491.67)*5/9;
    }
    
    public static double Rankine_to_Fahrenheit(){
    double Rankine=50;
    
    return (Rankine-459.67);
    }
    
    public static double Rankine_to_Kelvin(){
    double Rankine=30;
    return Rankine*5/9;
    }
    
}
