/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mendezguillen_20250723;

/**
 *
 * @author joshu
 */
public class MendezGuillen_20250723 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("50 Grados Centigrados a Fahrenheit: "+celsius_a_fahrenheit()+ " F");
        System.out.println("50 Grados Centigrados a Kelvin: "+celsius_a_kelvin()+ " K");
        System.out.println("50 Grados Centigrados a Rankine: "+celsius_a_rankine()+ " R");
        System.out.println("30 Grados Fahrenheit a Celsius: "+ fahrenheit_a_celsius()+ " C");
        System.out.println("30 Grados Fahrenheit a Kelvin: "+ fahrenheit_a_kelvin()+ " K");
        System.out.println("10 Grados Fahrenheit a Rankine: "+ fahrenheit_a_rankine()+ " R");
        System.out.println("10 Grados Fahrenheit a Rankine: "+ Kelvin_a_Celcius()+ " C");
        System.out.println("45 Grados kelvin a Fahrenheit: "+ kelvin_a_fahrenheit()+ " F");
        System.out.println("45 Grados kelvin a Rankine: "+ kelvin_a_rankine()+ " R");
        System.out.println("45 Grados rankine a celsius: "+ rankine_a_celsius()+ " C");
        System.out.println("75 Grados rankine a fahrenheit: "+ rankine_a_fahrenheit()+ " F");
        System.out.println("75 Grados rankine a kelvin: "+ rankine_a_kelvin()+ " K");
    }
    public static double celsius_a_fahrenheit(){
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

public static double fahrenheit_a_celsius(){
double grados_fahrenheit = 30.0;
return ((grados_fahrenheit - 32) * 5) / 9;

}

public static double fahrenheit_a_kelvin (){
double grados_centigrados = 30.0;
return ((grados_centigrados * 9)/5) + 491.67;

}
public static double fahrenheit_a_rankine (){
double grados_fahrenheit = 10.0;
return (grados_fahrenheit - 32) + 491.67;
}

public static double Kelvin_a_Celcius(){
double grados_kelvin = 10.0;
return grados_kelvin - 273.15;
}

public static double kelvin_a_fahrenheit(){
double grados_kelvin = 45.0;
return (grados_kelvin - 273.15)* 9 / 5 + 32;
}

public static double kelvin_a_rankine(){
double grados_kelvin = 45.0;
return grados_kelvin * 1.8;
}

public static double rankine_a_celsius(){
double grados_rankine = 45.0;
return (grados_rankine - 491.67)* 5 / 9;
}

public static double rankine_a_fahrenheit(){
double grados_rankine = 75.0;
return grados_rankine - 459.67;
}

public static double rankine_a_kelvin(){
double grados_rankine = 20.0;
return (grados_rankine * 5) / 9;
}

}


