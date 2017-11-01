/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author efrain
 */
public class Comparacion {
    //El metodo main empieza la ejecucion de la aplicacion en Java
    public static void main(String[] args) {
        //Crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int numero1;//Primer numero a comparar
        int numero2;//Segundo numero a comparar
        
        System.out.print("Escribe el primer entero: ");//Indicador
        numero1 = entrada.nextInt();//Obtiene la entrada del usuario y lo asigna a la variable
        
        System.out.print("Escribe el segundo numero: ");//Indicador
        numero2 = entrada.nextInt();//Obtiene la entrada del usuario y lo asigna a la variable
        
        if(numero1 == numero2){
            System.out.printf("%d == %d", numero1, numero2);
        }
        if(numero1 != numero2){
            System.out.printf("%d != %d", numero1, numero2);
        }
        if(numero1 < numero2){
            System.out.printf("%d < %d", numero1, numero2);
        }
        if(numero1 > numero2){
            System.out.printf("%d > %d", numero1, numero2);
        }
        if(numero1 <= numero2){
            System.out.printf("%d <= %d", numero1, numero2);
        }
        if(numero1 >= numero2){
            System.out.printf("%d >= %d", numero1, numero2);
        }
    }//Fin del metodo main
}//Fin de la clase Comparacion
