/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_converciones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_CONVERCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONVERCIONES DE TEMPERATURA
        double farh, cent, kep;
        // crea el sacnner
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Captura los °Faherenheit");
        farh = cap.nextDouble();
        cent = (farh - 32) / 1.8; //expresion
        System.out.println("°C = " + cent);
        
        System.out.println("Captura los Celcius:");
        cent= cap.nextDouble();
        kep=(cent+273.15);
        System .out.println("K= "+kep); 
                  
                  
        System.out.println("Captura los Fahrenheit:");
        farh= cap.nextDouble();
        kep=(farh-32)/5/9;
        System .out.println("K= "+kep); 
    }
    
}
