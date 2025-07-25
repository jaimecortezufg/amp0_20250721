/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raymundoquintanilla_21072025;

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
        
        System.out.println("Grados centigrados a farenheit: "+celsius_a_farenheit()+" F");
        System.out.println("Grados centigrados a kelvin: "+celsius_a_kelvin()+" K");
        System.out.println("Grados centigrados a rankine: "+celsius_a_rankine()+" R");
        
        System.out.println("Grados farenheit a celsius: "+farenheit_a_celsius()+" C");
        System.out.println("Grados farenheit a kelvin: "+farenheit_a_kelvin()+" K");
        System.out.println("Grados farenheit a rankine: "+farenheit_a_rankine()+" R");

        System.out.println("Grados kelvin a celsius: "+kelvin_a_celsius()+ " C");
        System.out.println("Grados kelvin a farenheit: "+kelvin_a_farenheit()+ " F");
        System.out.println("Grados kelvin a rankine: "+kelvin_a_rankine()+ " R");

        System.out.println("Grados rankine a celsius: "+rankine_a_celsius()+ " C");
        System.out.println("Grados rankine a farenheit: "+rankine_a_farenheit()+ " F");
        System.out.println("Grados rankine a kelvin: "+rankine_a_kelvin()+ " K");
    }
       
    public static double celsius_a_farenheit (){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9) / 5) + 32;                      
    }     
    public static double celsius_a_kelvin (){
        double grados_centigrados = 50.0;    
        return grados_centigrados + 273.15;
    }      
    public static double celsius_a_rankine(){
        double grados_centigrados = 50.0;    
        return ((grados_centigrados * 9)/5) + 491.67;    
    } 


           
    public static double farenheit_a_celsius(){
        double grados_farenheit = 30.0;    
        return ((grados_farenheit - 32)*5) / 9;
    }    
    public static double farenheit_a_kelvin(){
        double grados_farenheit = 30.0;    
        return (((grados_farenheit - 32)*5) / 9) + 273.15;
    }    
    public static double farenheit_a_rankine(){
        double grados_farenheit = 30.0;
        return (((grados_farenheit - 32)*5) / 9) + 273.15;
    }


    public static double kelvin_a_celsius(){
        double grados_kelvin = 30.0;
        return (grados_kelvin - 273.15);
    }
    public static double kelvin_a_farenheit(){
        double grados_kelvin = 30.0;
        return (((grados_kelvin - 273.15) * 9) / 5) + 32;
    }
    public static double kelvin_a_rankine(){
        double  grados_kelvin = 30.0;
        return (grados_kelvin * 1.8);
    }


    public static double rankine_a_celsius(){
        double  grados_rankine = 30.0;
        return (((grados_rankine - 491.67)* 5) / 9);
    }
    public static double rankine_a_farenheit(){
        double  grados_rankine = 30.0;
        return (grados_rankine - 459.67);
    }
    public static double rankine_a_kelvin(){
        double  grados_rankine = 30.0;
        return ((grados_rankine * 5) / 9);
    }
}

      
    }
}
