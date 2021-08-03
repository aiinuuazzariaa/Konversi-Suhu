/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi.suhu;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
//Class : KonversiSuhu
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    //Method : Main
    public static void main(String[] args) {
    //Variabel Local
    double angka, hasil;    
        
    System.out.println("Konversi Suhu");
        System.out.println("Konversi suhu 78 celcius ke Farenheit, Kelvin, dan Reamur");
    Scanner input = new Scanner (System.in);
            //Output
            System.out.print("Fahrenheit = " + ((1.8*78)+32));
            System.out.println("");
            System.out.println("Kelvin = " + (78+273));
            
            System.out.println("Reamur = " + (0.8*78));
           
    
    
    }
    }
    

