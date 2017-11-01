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
public class Suma {
    //El memtodo main empieza la ejecucion de la aplicacion en Java
    public static void main(String[] args) {
        //Crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int numero1;//Primer numero a sumar
        int numero2;//Segundo numero a sumar
        int suma;//suma de numero1 y numero2
        
        System.out.print("Escribe el primer entero: ");//Indicador
        numero1 = entrada.nextInt();//Lee el primer numero del usuario y se lo asigna a la variable
        
        System.out.print("Escriba el segundo entero: ");//Indicador
        numero2 = entrada.nextInt();//Lee el segundo numero del ususario y se lo asigna a la variable
        
        suma = numero1 + numero2;//Suma los numeros, depsues almacena el total en suma
        
        System.out.printf("La suma es %d%n", suma);//Muestra la suma
    }//Fin del metodo main
}//Fin de la clase Suma
