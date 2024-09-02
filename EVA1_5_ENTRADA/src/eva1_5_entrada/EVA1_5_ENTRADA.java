/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Captura datos del teclado:
        //Scanner --> herramienta (clase)
        //Scanner: es un tipo de dato
        Scanner cap; //incorporar la herramienta al codigo (import)
        // no existe se tiene que agregar
         String nombre;
        cap = new Scanner(System.in); //creamos la herramienta Scanner
        System.out.println("Introduce tu nombre completo");
        nombre = cap.nextLine(); //capturamos todo el texto hasta que precione enter
        
        //Imprime datos
        System.out.println("<<<<<<<<<<<DATOS CAPTURADOS>>>>>>>>>>>>>");
        System.out.println(nombre);
    }
    
}
