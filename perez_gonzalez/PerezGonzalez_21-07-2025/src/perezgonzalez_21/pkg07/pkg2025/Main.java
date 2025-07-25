/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perezgonzalez;
/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // lo que aparece en la consola 
        System.out.println("50 grados centigrados a Fahrenheitt:"  + celcius_a_Fahrenheitt() + "F" );
        System.out.println("50 grados centigrados a kelvin:" + celcius_a_kelvin() + "k");
        System.out.println("50 grados centigrados a Rankine:" + celcius_a_rankine() + "R");
        System.out.println("30 grados Fahrenheitt a celcius :" + Fahrenheitt_a_celcius() + "C");
        System.out.println("30 grados Fahrenheitt a kelvin:" + Fahrenheitt_a_kelvin() + "k");
        System.out.println("30 grados Fahrenheitt a Rankine" + Fahrenheitt_a_Rankine() + "R");
        System.out.println("100 grados kelvin a Celcius" + kelvin_a_celcius() + "C");
        System.out.println("100 grados kelvin a Fahrenheitt" + kelvin_a_Fahrenheitt()+ "F");
        System.out.println("100 grados kelvin a Rankine" + kelvin_a_rankine ()+ "R");
        System.out.println("500 grados Rankine a Celsius" + rankine_a_celcius() + "C" );
        System.out.println("500 grados Rankine a Fahrenheitt" + rankine_a_Fahrenheitt() + "F");
        System.out.println("5000 grados Rankine a kelvin" + rankine_a_kelvin()+  "k");
    }
    //estas son todas las operaciones que se realizan al momento de ejecutar las funciones 
   public static double celcius_a_Fahrenheitt(){
    double grados_centigrados = 50.0;
    return ((grados_centigrados * 9) / 5) +32;
   }
   public static double celcius_a_kelvin(){
       double grados_centigrados =50.0;
       return grados_centigrados +273.15;
   }
   public static double celcius_a_rankine(){
     double grados_centigrados = 50.0;
     return ((grados_centigrados * 9)/5) + 491.67;
}
   public static double Fahrenheitt_a_celcius(){
     double grados_Fahrenheitt = 30.0;
     return ((grados_Fahrenheitt -32) * 5) / 9 ;
}
    public static double Fahrenheitt_a_kelvin(){
     double grados_Fahrenheitt = 30.0;
     return (((grados_Fahrenheitt - 32) * 5)/9) + 273.15;
    }
    public static double Fahrenheitt_a_Rankine(){
        double grados_Fahrenheitt = 30.0;
        return grados_Fahrenheitt +459.67; 
    }
    public static double kelvin_a_celcius(){
        double grados_kelvin = 100;
        return grados_kelvin - 273.15;
    }
   
    public static double kelvin_a_Fahrenheitt() {
        double grados_kelvin = 100;
        return (grados_kelvin - 273.15) * 9/5 + 32;
    }
    public static double kelvin_a_rankine (){
        double grados_kelvin = 100;
        return grados_kelvin * 1.8;
    }
    public static double rankine_a_celcius() {
       double grados_rankine = 500;
       return ((grados_rankine - 491.67) * 5)/9;
    }
    public static double rankine_a_Fahrenheitt (){
        double grados_rankine = 500;
        return grados_rankine - 459.67;
    }
    public static double rankine_a_kelvin ()  {
        double grados_rankine = 500;
        return (grados_rankine * 5) /9;
    }
}
