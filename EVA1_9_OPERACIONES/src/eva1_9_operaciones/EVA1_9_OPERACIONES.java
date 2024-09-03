/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_9_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // operacion aritmetica
        // iniciacion de una variable 
        int x = 10; // declaracion y asignacion
        int y = 5;
        //si nesecitan muchas variables:
        int suma, resta, mult, div, pot, raiz;
        //suma y resta
        suma = x + y; //operador suma +
        System.out.println("la suma de x + y :");
        System.out.println(suma);
         resta = x - y; //operador resta -
        System.out.println("la resta de x - y :");
        System.out.println(resta);
        
        //multiplicacion
        mult = x * y;
        System.out.println("la multiplicacion de x * y :");
        System.out.println(mult);
        
        //división
        //en java los operadores dependen del tipo de dato
        //divides entero, java da como resultado entero
        //OPERADOR DE DIVISION
        
        div = x / y;
        System.out.println("la division de x / y :");
        System.out.println(div);
        x = 5;
        y = 2;
        // division con numeros con punto flotante
        double va11 = 5;
        double va12 = 2;
        double resu;
        resu = va11 / va12;
     
        System.out.println("la division de x / y :");
        System.out.println(resu);
        
        
                
    }
    
}
